package in.nit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.nit.model.OrderMethod;
import in.nit.service.IOrderMethodService;
import in.nit.view.OrderMethodExcelView;
import in.nit.view.OrderMethodPdfView;
@Controller
@RequestMapping("/order")
public class OrderMethodController {
	@Autowired
	private IOrderMethodService service;
	
	@RequestMapping("/register")
	public String showRegPage(Model model) {
		model.addAttribute("orderMethod",new OrderMethod());
		return "OrderMethodRegister";
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveOrderMethod(@ModelAttribute OrderMethod orderMethod,Model model) {
		Integer id=service.saveOrderMethod(orderMethod);
		String message = "Order Method '" + id + "' Saved";
		model.addAttribute("message", message);
		model.addAttribute("orderMethod",new OrderMethod());
		return "OrderMethodRegister";
	}
	@RequestMapping("/all")
	public String getAllOrderMethod(Model model) {
		List<OrderMethod> list=service.getAllOrderMethod();
		model.addAttribute("list",list);
		return "OrderMethodData";
	}
	@RequestMapping("/delete")
	public String deleteOrderMethod(@RequestParam("oid")Integer id,Model model) {
		service.deleteOrderMethod(id);
		String message="Order Method '"+id+"' Deleted";
		model.addAttribute("message",message);
		List<OrderMethod> list=service.getAllOrderMethod();
		model.addAttribute("list",list);
		return "OrderMethodData";
	}
	@RequestMapping("/edit")
	public String showOrderMethod(@RequestParam("oid")Integer id,Model model) {
		OrderMethod om=service.getOneOrderMethod(id);
		model.addAttribute("orderMethod",om);
		return "OrderMethodEdit";
	}
	@RequestMapping(value="/update", method =RequestMethod.POST)
	public String updateOrderMethod(@ModelAttribute OrderMethod orderMethod,Model model) {
		OrderMethod order=new OrderMethod();
		service.updateOrderMethod(order);
		String message="Order Method '"+orderMethod.getOrderId()+"' Updated";
		model.addAttribute("message",message);
		List<OrderMethod> list=service.getAllOrderMethod();
		model.addAttribute("list",list);
		return "OrderMethodData";
	}
	@RequestMapping("/view")
	public String viewOrderMethod(@RequestParam("oid")Integer id,Model model) {
		OrderMethod om=service.getOneOrderMethod(id);
		model.addAttribute("ob",om);
		return "OderMethodView";
	}
	@RequestMapping("/excel")
	public ModelAndView showExcel(@RequestParam(value="id",required=false)Integer id) {
		ModelAndView m=new ModelAndView();
		m.setView(new OrderMethodExcelView());
		if(id==null) {
		List<OrderMethod> list=service.getAllOrderMethod();
		m.addObject("list",list);
		}
		else {
			OrderMethod st=service.getOneOrderMethod(id);
			m.addObject("list",Arrays.asList(st));
		}
		return m;
	}
	@RequestMapping("/pdf")
	public ModelAndView showPdf(@RequestParam(value="id",required=false)Integer id) {
		ModelAndView m=new ModelAndView();
		m.setView(new OrderMethodPdfView());
		if(id==null) {
		List<OrderMethod> list=service.getAllOrderMethod();
		m.addObject("list",list);
		}
		else {
			OrderMethod st=service.getOneOrderMethod(id);
			m.addObject("list",Arrays.asList(st));
		}
		return m;
	}
	

}
