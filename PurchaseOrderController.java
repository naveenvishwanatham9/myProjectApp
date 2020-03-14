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

import in.nit.model.PurchaseOrder;
import in.nit.service.IPurchaseOrderService;
import in.nit.service.IShipmentTypeService;
import in.nit.service.IWhTypeService;
import in.nit.util.CommonUtil;

@Controller
@RequestMapping("/purchase")
public class PurchaseOrderController {
	@Autowired
	private IPurchaseOrderService service;
	@Autowired
	private IShipmentTypeService shipmentService;
	@Autowired
	private IWhTypeService whService;
	public void commonUi(Model model) {
		List<Object[]> shipmentlist= shipmentService.getShipmentIdAndCode();
		Map<Integer, String> shipmentMap=CommonUtil.convert(shipmentlist);
		model.addAttribute("shipmentMap",shipmentMap);
	
		List<Object[]> whlist= whService.getwhIdAndCode("vendor");
		Map<Integer, String> whMap=CommonUtil.convert(whlist);
		model.addAttribute("whMap",whMap);
	
	}
@RequestMapping("/register")
	public String registerPorder(Model model) {
		model.addAttribute("purchaseOrder",new PurchaseOrder());
		commonUi(model);
		return "PurchaseOrderRegister";
	}
@RequestMapping(value="/save",method=RequestMethod.POST)
public String saveUom(@ModelAttribute PurchaseOrder purchaseOrder, Model model) {
	Integer id=service.savePurchaseOrder(purchaseOrder);
	String message="Purchase Order '"+id+"' Saved";
	model.addAttribute("message",message);
	return "PurchaseOrderRegister";
}
@RequestMapping("/all")
public String getAllPurchaseOrders(Model model) {
	List<PurchaseOrder> list=service.getAllPurchaseOrders();
	model.addAttribute("list",list);
	return "PurchaseOrderData";
}
@RequestMapping("/delete")
public String deletePurchaseOrder(@RequestParam("poid") Integer id,Model model) {
	service.deletePurchaseOrder(id);
	String message="PurchaseOrder '"+id+"' Deleted ";
	model.addAttribute("message",message);
	List<PurchaseOrder> list=service.getAllPurchaseOrders();
	model.addAttribute("list",list);
	return "PurchaseOrderData";
}
@RequestMapping("/edit")
public String showEditPage(@RequestParam("poid")Integer id,Model model) {
	PurchaseOrder ut=service.getOnePurchaseOrder(id);
	model.addAttribute("PurchaseOrder",ut);
	return "PurchaseOrderEdit";
}
@RequestMapping(value="/update", method = RequestMethod.POST)
public String UpdatePurchaseOrder(@ModelAttribute PurchaseOrder PurchaseOrder,Model model) {
	service.updatePurchaseOrder(PurchaseOrder);
	String message="PurchaseOrder'"+PurchaseOrder.getPartId()+"' Updated";
	model.addAttribute("message",message);
	List<PurchaseOrder> list=service.getAllPurchaseOrders();
	model.addAttribute("list",list);
	return "PurchaseOrderData";
}
@RequestMapping(value="/view")
public String viewPurchaseOrder(@RequestParam("poid")Integer id,Model model) {
	PurchaseOrder po=service.getOnePurchaseOrder(id);
	model.addAttribute("bo", po);
	return "PurchaseOrderView";
}
}
