package in.nit.service.impl;


import java.util.Collections;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IUomTypeDao;
import in.nit.model.UomType;
import in.nit.service.IUomTypeService;

@Service
public class UomTypeServiceImpl implements IUomTypeService{
	@Autowired
	private IUomTypeDao dao;
	
@Transactional
public Integer saveUomType(UomType ob) {
	return dao.saveUomType(ob);
}

@Transactional(readOnly=true)
public List<UomType> getAllUomTypes() {
	List<UomType> list=dao.getAllUomTypes();
	Collections.sort(list,(o1,o2)->o1.getUomId()-o2.getUomId());
	return list;
}
@javax.transaction.Transactional
public void deleteUomType(Integer id) {
	dao.deleteUomType(id);
}
@Transactional(readOnly = true)
public UomType getOneUomType(Integer id) {
	
	return dao.getOneUomType(id);
}
@Transactional
public void UpdateUomType(UomType ob) {
dao.UpdateUomType(ob);	
}
@Transactional(readOnly = true)
public List<Object[]> getUomTypeCount() {
	return dao.getUomTypeCount();
}
}
