package in.nit.controller;

import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.OrderMethod;
import in.nit.service.IOrderMethodService;
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
	@RequestMapping(name="/save", method=RequestMethod.POST)
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
		model.addAttribute("OrderMethod",om);
		return "OrderMethodEdit";
	}
	@RequestMapping(value="/update", method =RequestMethod.POST)
	public String updateOrderMethod(@ModelAttribute OrderMethod orderMethod,Model model) {
		service.updateOrderMethod(orderMethod);
		String update="Order Method '"+orderMethod.getOrderId()+"' Updated";
		model.addAttribute("message",update);
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

}
