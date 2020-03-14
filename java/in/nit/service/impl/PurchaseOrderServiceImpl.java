package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IPurchaseOrderDao;
import in.nit.model.PurchaseOrder;
import in.nit.model.PurchaseOrder;
import in.nit.service.IPurchaseOrderService;

@Service
public class PurchaseOrderServiceImpl implements IPurchaseOrderService{
@Autowired
	private IPurchaseOrderDao dao;

@Transactional	
public Integer savePurchaseOrder(PurchaseOrder ob) {
	return dao.savePurchaseOrder(ob);
}

@Transactional(readOnly = true)
public List<PurchaseOrder> getAllPurchaseOrders() {
	List<PurchaseOrder> list = dao.getAllPurchaseOrders();
	Collections.sort(list, (o1, o2) -> o1.getPartId() - o2.getPartId());
	return list;
}
@Transactional
public void deletePurchaseOrder(Integer id) {
dao.deletePurchaseOrder(id);	
}
@Transactional(readOnly = true)
	public PurchaseOrder getOnePurchaseOrder(Integer id) {
		return dao.getOnePurchaseOrder(id);
	}
@Transactional
	public void updatePurchaseOrder(PurchaseOrder ob) {
dao.updatePurchaseOrder(ob);		
	}
}

