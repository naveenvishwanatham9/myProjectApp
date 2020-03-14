package in.nit.service;



import java.util.List;

import in.nit.model.OrderMethod;



public interface IOrderMethodService {
Integer saveOrderMethod(OrderMethod om);
List<OrderMethod> getAllOrderMethod();
void deleteOrderMethod(Integer id);
OrderMethod getOneOrderMethod(Integer id);
void updateOrderMethod(OrderMethod ob);
List<Object[]> getOrderIdAndCode(String mode);
}
