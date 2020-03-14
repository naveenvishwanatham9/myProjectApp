package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.ShipmentType;
import in.nit.model.WhType;
import in.nit.service.IWhTypeService;

@Controller
@RequestMapping("/whtype")
public class WhTypeController {
	@Autowired
	private IWhTypeService service;

	@RequestMapping("/register")
	public String showRegPage(Model model) {
		model.addAttribute("whType", new WhType());
		return "WhTypeRegister";
	}

@RequestMapping(value="/save",method =RequestMethod.POST)
public String saveWhType(@ModelAttribute WhType whType,Model model) {
	Integer id=service.saveWhType(whType);
	String message="WhType '"+id+"'saved";
	model.addAttribute("message",message);
	return "WhTypeRegister";	
}
@RequestMapping("/all")
public String getAllWhType(Model model) {
	List<WhType> list=service.getAllWhTypes();
	model.addAttribute("list",list);
	return "WhTypeData";
}
@RequestMapping("/delete")
public String deleteWhtype(@RequestParam("uid") Integer id, Model model) {
	service.deleteWhType(id);
	String message = "Whtype '" + id + "' Deleted";
	model.addAttribute("message", message);
	List<WhType> list = service.getAllWhTypes();
	model.addAttribute("list", list);
	return "WhTypeData";
}
@RequestMapping("/edit")
public String showEditPage(@RequestParam("uid") Integer id, Model model) {
	WhType st = service.getOneWhType(id);
	model.addAttribute("WhType", st);
	return "WhTypeEdit";
}

@RequestMapping(value="/update",method = RequestMethod.POST)
public String updateWhType(@ModelAttribute WhType whType,Model model) {
	service.updateWhType(whType);
	String message="WhType '"+whType.getUserId()+"' Updated";
	model.addAttribute("message",message);
	List<WhType> list=service.getAllWhTypes();
	model.addAttribute("list",list);
	return "WhTypeData";
}

@RequestMapping("/view")
public String showOneWh(
		@RequestParam("uid")Integer id,Model model) {
	WhType st=service.getOneWhType(id);
	model.addAttribute("ob", st);
	return "WhTypeView";
	
}


}
