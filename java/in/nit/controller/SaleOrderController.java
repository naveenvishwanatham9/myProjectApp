package in.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.SaleOrder;
import in.nit.service.ISaleOrderService;
import in.nit.service.IShipmentTypeService;
import in.nit.service.IWhTypeService;
import in.nit.util.CommonUtil;

@Controller
@RequestMapping("/sale")
public class SaleOrderController {
	@Autowired
	private ISaleOrderService service;
	@Autowired
	private IShipmentTypeService shipmentService;
	@Autowired
	private IWhTypeService whService;
	public void commonUi(Model model) {
		List<Object[]> shipmentlist= shipmentService.getShipmentIdAndCode();
		Map<Integer, String> shipmentMap=CommonUtil.convert(shipmentlist);
		model.addAttribute("shipmentMap",shipmentMap);
	
		List<Object[]> whlist= whService.getwhIdAndCode("customer");
		Map<Integer, String> whMap=CommonUtil.convert(whlist);
		model.addAttribute("whMap",whMap);
	
	}
@RequestMapping("/register")
	public String registerPorder(Model model) {
		model.addAttribute("saleOrder",new SaleOrder());
		commonUi(model);
		return "SaleOrderRegister";
	}
@RequestMapping(value="/save",method=RequestMethod.POST)
public String saveUom(@ModelAttribute SaleOrder saleOrder, Model model) {
	Integer id=service.saveSaleOrder(saleOrder);
	String message="Sale Order '"+id+"' Saved";
	model.addAttribute("message",message);
	return "SaleOrderRegister";
}
//@RequestMapping("/all")
//public String getAllSaleOrders(Model model) {
//	List<SaleOrder> list=service.getAllSaleOrders();
//	model.addAttribute("list",list);
//	return "SaleOrderData";
//}
//@RequestMapping("/delete")
//public String deleteSaleOrder(@RequestParam("soid") Integer id,Model model) {
//	service.deleteSaleOrder(id);
//	String message="SaleOrder '"+id+"' Deleted ";
//	model.addAttribute("message",message);
//	List<SaleOrder> list=service.getAllSaleOrders();
//	model.addAttribute("list",list);
//	return "SaleOrderData";
//}
//@RequestMapping("/edit")
//public String showEditPage(@RequestParam("soid")Integer id,Model model) {
//	SaleOrder so=service.getOneSaleOrder(id);
//	model.addAttribute("saleOrder",so);
//	return "SaleOrderEdit";
//}
//@RequestMapping(value="/update", method = RequestMethod.POST)
//public String UpdateSaleOrder(@ModelAttribute SaleOrder saleOrder,Model model) {
//	service.updateSaleOrder(saleOrder);
//	String message="SaleOrder'"+saleOrder.getSaleId()+"' Updated";
//	model.addAttribute("message",message);
//	List<SaleOrder> list=service.getAllSaleOrders();
//	model.addAttribute("list",list);
//	return "SaleOrderData";
//}
//@RequestMapping(value="/view")
//public String viewSaleOrder(@RequestParam("soid")Integer id,Model model) {
//	SaleOrder so=service.getOneSaleOrder(id);
//	model.addAttribute("bo", so);
//	return "SaleOrderView";
//}
}
