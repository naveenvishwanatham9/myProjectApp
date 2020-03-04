package in.nit.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.nit.model.ShipmentType;
import in.nit.model.UomType;
import in.nit.service.IUomTypeService;
import in.nit.util.ShipmentTypeUtil;
import in.nit.util.UomTypeUtil;
import in.nit.view.ShipmentTypeExcelView;
import in.nit.view.ShipmentTypePdfView;
import in.nit.view.UomTypeExcelView;
import in.nit.view.UomTypePdfView;

@Controller
@RequestMapping("/uom")
public class UomTypeController {
	@Autowired
	private IUomTypeService service;
	@Autowired
	private ServletContext context;
	@Autowired
	private UomTypeUtil util;
	
	
	@RequestMapping("/register")
	public String showRegPage() {
		return "UomTypeRegister";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveUom(@ModelAttribute UomType uomType, Model model) {
		Integer id=service.saveUomType(uomType);
		String message="Uom Type '"+id+"' Saved";
		model.addAttribute("message",message);
		return "UomTypeRegister";
	}
	@RequestMapping("/all")
	public String getAllUomTypes(Model model) {
		List<UomType> list=service.getAllUomTypes();
		model.addAttribute("list",list);
		return "UomTypeData";
	}
	@RequestMapping("/delete")
	public String deleteUomType(@RequestParam("umid") Integer id,Model model) {
		service.deleteUomType(id);
		String message="UomType '"+id+"' Deleted ";
		model.addAttribute("message",message);
		List<UomType> list=service.getAllUomTypes();
		model.addAttribute("list",list);
		return "UomTypeData";
	}
	@RequestMapping("/edit")
	public String showEditPage(@RequestParam("umid")Integer id,Model model) {
		UomType ut=service.getOneUomType(id);
		model.addAttribute("uomType",ut);
		return "UomTypeEdit";
	}
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String UpdateUomType(@ModelAttribute UomType uomType,Model model) {
		service.UpdateUomType(uomType);
		String message="UomType'"+uomType.getUomId()+"' Updated";
		model.addAttribute("message",message);
		List<UomType> list=service.getAllUomTypes();
		model.addAttribute("list",list);
		return "UomTypeData";
	}
	@RequestMapping(value="/view")
	public String viewUomtype(@RequestParam("umid")Integer id,Model model) {
		UomType um=service.getOneUomType(id);
		model.addAttribute("um", um);
		return "UomTypeView";
	}
	@RequestMapping("/excel")
	public ModelAndView showExcel(@RequestParam(value="id",required=false)Integer id) {
		ModelAndView m=new ModelAndView();
		m.setView(new UomTypeExcelView());
		if(id==null) {
		List<UomType> list=service.getAllUomTypes();
		m.addObject("list",list);
		}
		else {
			UomType st=service.getOneUomType(id);
			m.addObject("list",Arrays.asList(st));
		}
		return m;
	}
	@RequestMapping("/pdf")
	public ModelAndView showPdf(@RequestParam(value="id",required=false)Integer id) {
		ModelAndView m=new ModelAndView();
		m.setView(new UomTypePdfView());
		if(id==null) {
		List<UomType> list=service.getAllUomTypes();
		m.addObject("list",list);
		}
		else {
			UomType st=service.getOneUomType(id);
			m.addObject("list",Arrays.asList(st));
		}
		return m;
	}
	@RequestMapping("/charts")
	public String showCharts() {
	List<Object[]> list=service.getUomTypeCount();
	String path=context.getRealPath("/");
	util.generatePie(path, list);
	util.generateBar(path, list);
	return "ShipmentTypeCharts";
	}
}
