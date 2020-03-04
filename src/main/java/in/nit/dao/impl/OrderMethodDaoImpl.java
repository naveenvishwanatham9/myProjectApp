package in.nit.dao.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IOrderMethodDao;
import in.nit.model.OrderMethod;

@Repository
public class OrderMethodDaoImpl implements IOrderMethodDao {
	@Autowired
	private HibernateTemplate ht;

	public Integer saveOrderMethod(OrderMethod om) {
		return (Integer) ht.save(om);
	}

	public List<OrderMethod> getAllOrderMethod() {
		return ht.loadAll(OrderMethod.class);
	}

	public void deleteOrderMethod(Integer id) {
		ht.delete(ht.get(OrderMethod.class, id));
	}
	public OrderMethod getOneOrderMethod(Integer id) {
		return ht.get(OrderMethod.class, id);
	}

	public void updateOrderMethod(OrderMethod ob) {
	ht.update(ob);	
	}
}
