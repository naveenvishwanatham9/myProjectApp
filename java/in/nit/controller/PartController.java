package in.nit.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.nit.model.Part;
import in.nit.service.IOrderMethodService;
import in.nit.service.IPartService;
import in.nit.service.IUomTypeService;
import in.nit.util.CommonUtil;
import in.nit.view.PartExcelView;
import in.nit.view.PartPdfView;

@Controller
@RequestMapping("/part")
public class PartController {

	@Autowired
private IUomTypeService uomService;
	@Autowired
	private IPartService service;
	@Autowired
	private IOrderMethodService orderMethodService;
	
	private void commonUi(Model model) {
		List<Object[]> uomlist=uomService.getUomIdAndModel();
		Map<Integer, String> uomMap=CommonUtil.convert(uomlist);
		model.addAttribute("uomMap",uomMap);
		
		
		  List<Object[]> omsaleList=orderMethodService.getOrderIdAndCode("sale");
		  Map<Integer,String> omSaleMap=CommonUtil.convert(omsaleList);
		  model.addAttribute("omSaleMap",omSaleMap);
		 
		
		  List<Object[]> omPurchaseList=orderMethodService.getOrderIdAndCode("purchase");
		  Map<Integer,String> omPurchaseMap=CommonUtil.convert(omPurchaseList);
		  model.addAttribute("omPurchaseMap",omPurchaseMap);
		 
		
	}
	@RequestMapping("/register")
	public String regPart(Model model) {
		model.addAttribute("part",new Part());
		commonUi(model);
		return "PartRegister";
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String savePart(@ModelAttribute Part part,Model model) {
		Integer id= service.partSave(part);
		String message="part '"+id+"'inserted";
		model.addAttribute("message",message);
		model.addAttribute("part",new Part());
		commonUi(model);
		return "PartRegister";
	}
	
	@RequestMapping("/all")
	public String getAllPart(Model model) {
		List<Part> list = service.getAllPart();
		model.addAttribute("list", list);
		return "PartData";
	}
	@RequestMapping("/delete")
	public String deletePart(@RequestParam("pid") Integer id, Model model) {
		service.deletePart(id);
		String message = "Part '" + id + "' Deleted";
		model.addAttribute("message", message);
		List<Part> list = service.getAllPart();
		model.addAttribute("list", list);
		return "PartData";
	}

	@RequestMapping("/edit")
	public String showEditPage(@RequestParam("pid") Integer id, Model model) {
		Part st = service.getOnePart(id);
		model.addAttribute("part", st);
		commonUi(model);
		return "PartEdit";
	}
	
	@RequestMapping(value="/update",method = RequestMethod.POST)
	public String updatePart(@ModelAttribute Part part,Model model) {
		service.updatePart(part);
		String message="Part '"+part.getId()+"' Updated";
		model.addAttribute("message",message);
		List<Part> list=service.getAllPart();
		model.addAttribute("list",list);
		return "PartData";
	}
	
	@RequestMapping("/view")
	public String showOneShipment(
			@RequestParam("pid")Integer id,Model model) {
		Part st=service.getOnePart(id);
		model.addAttribute("ob", st);
		return "PartView";
		
	}
	@RequestMapping("/excel")
	public ModelAndView showExcel(@RequestParam(value="pid",required=false)Integer id) {
		ModelAndView m=new ModelAndView();
		m.setView(new PartExcelView());
		if(id==null) {
		List<Part> list=service.getAllPart();
		m.addObject("list",list);
		}
		else {
			Part st=service.getOnePart(id);
			m.addObject("list",Arrays.asList(st));
		}
		return m;
	}
	@RequestMapping("/pdf")
	public ModelAndView showPdf(@RequestParam(value="pid",required=false)Integer id) {
		ModelAndView m=new ModelAndView();
		m.setView(new PartPdfView());
		if(id==null) {
		List<Part> list=service.getAllPart();
		m.addObject("list",list);
		}
		else {
			Part st=service.getOnePart(id);
			m.addObject("list",Arrays.asList(st));
		}
		return m;
	}

}
