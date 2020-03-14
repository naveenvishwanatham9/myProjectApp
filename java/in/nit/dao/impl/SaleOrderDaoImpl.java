package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.ISaleOrderDao;
import in.nit.model.SaleOrder;

@Repository
public class SaleOrderDaoImpl implements ISaleOrderDao {
	@Autowired
	private HibernateTemplate ht;

	public Integer saveSaleOrder(SaleOrder ob) {
		return (Integer) ht.save(ob);
	}

	public List<SaleOrder> getAllSaleOrders() {
		return ht.loadAll(SaleOrder.class);
	}

	public void deleteSaleOrder(Integer id) {
		ht.delete(ht.get(SaleOrder.class, id));
	}

	public SaleOrder getOneSaleOrder(Integer id) {
		return ht.get(SaleOrder.class, id);
	}

	public void updateSaleOrder(SaleOrder ob) {
		ht.update(ob);
	}
}
