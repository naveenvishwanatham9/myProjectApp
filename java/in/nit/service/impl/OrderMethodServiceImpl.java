package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IOrderMethodDao;
import in.nit.model.OrderMethod;
import in.nit.service.IOrderMethodService;

@Service
public class OrderMethodServiceImpl implements IOrderMethodService {
	@Autowired
	private IOrderMethodDao dao;

	@Transactional
	public Integer saveOrderMethod(OrderMethod om) {
		return dao.saveOrderMethod(om);
	}

	@Transactional(readOnly = true)
	public List<OrderMethod> getAllOrderMethod() {
		List<OrderMethod> list = dao.getAllOrderMethod();
		Collections.sort(list, (o1, o2) -> o1.getOrderId() - o2.getOrderId());
		return list;
	}

	@Transactional
	public void deleteOrderMethod(Integer id) {
		dao.deleteOrderMethod(id);
	}
	@Transactional
	public OrderMethod getOneOrderMethod(Integer id) {
		return dao.getOneOrderMethod(id);
	}
	@Transactional
	public void updateOrderMethod(OrderMethod ob) {
		dao.updateOrderMethod(ob);
	}
@Transactional(readOnly = true)
	public List<Object[]> getOrderIdAndCode(String mode) {
		return dao.getOrderIdAndCode(mode);
	}
	
}
