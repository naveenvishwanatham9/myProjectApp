package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IWhTypeDao;
import in.nit.model.ShipmentType;
import in.nit.model.WhType;

@Repository
public class WhTypeDapImpl implements IWhTypeDao {
	@Autowired
	private HibernateTemplate ht;

	public Integer saveWhType(WhType ob) {
		return (Integer) ht.save(ob);
	}
	@Override
	public List<WhType> getAllShipmentTypes() {
		return ht.loadAll(WhType.class);
	}
@Override
	public void deleteWhType(Integer id) {
	ht.delete(ht.get(WhType.class, id));
	}
 @Override
public WhType getOneWhType(Integer id) {
	return ht.get(WhType.class, id);
}
 @Override
public void updateWhType(WhType ob) {
	ht.update(ob);
}
 @Override
public List<Object[]> getWhModeCount() {
	return null;
}
@Override
public List<Object[]> getwhIdAndCode(String type) {
	String hql=" select userId,userCode from "+ WhType.class.getName()+" where userType=?0";
	return (List<Object[]>) ht.find(hql,type);
}
}
