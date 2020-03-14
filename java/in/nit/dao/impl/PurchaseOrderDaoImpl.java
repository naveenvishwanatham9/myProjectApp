package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IPurchaseOrderDao;
import in.nit.model.PurchaseOrder;

@Repository
public class PurchaseOrderDaoImpl implements IPurchaseOrderDao{
@Autowired
	private HibernateTemplate ht;
	
	public Integer savePurchaseOrder(PurchaseOrder ob) {

		return (Integer) ht.save(ob);
}

	public List<PurchaseOrder> getAllPurchaseOrders() {
		return ht.loadAll(PurchaseOrder.class);
	}
	
	public void deletePurchaseOrder(Integer id) {
ht.delete(ht.get(PurchaseOrder.class, id));
	}		
		
	public PurchaseOrder getOnePurchaseOrder(Integer id) {
		return ht.get(PurchaseOrder.class, id);
	}
	
	public void updatePurchaseOrder(PurchaseOrder ob) {
ht.update(ob);		
	}
}

