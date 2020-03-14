package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IUomTypeDao;
import in.nit.model.UomType;

@Repository
public class UomTypeDaoImpl implements IUomTypeDao{
	@Autowired
	private HibernateTemplate ht;
	
	public Integer saveUomType(UomType ob) {
		return  (Integer) ht.save(ob);
	}
	
	public List<UomType> getAllUomTypes() {
		return ht.loadAll(UomType.class);
	}
	
	public void deleteUomType(Integer id) {
	ht.delete(ht.get(UomType.class, id));	
	}
	
	public UomType getOneUomType(Integer id) {
		return 	ht.get(UomType.class, id);
	}
	@Override
	public void UpdateUomType(UomType ob) {
	ht.update(ob);	
	}
	@Override
	public List<Object[]> getUomTypeCount() {
		String hql="select umType,count(umType) from in.nit.model.UomType group by umType";
		return (List<Object[]>) ht.find(hql);
	
	}
	public List<Object[]> getUomIdAndModel() {
	String hql="select uomId,uomModel from in.nit.model.UomType";
		
		return (List<Object[]>) ht.find(hql);
	}
	}

