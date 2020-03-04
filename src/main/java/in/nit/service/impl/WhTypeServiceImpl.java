package in.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IWhTypeDao;
import in.nit.model.ShipmentType;
import in.nit.model.WhType;
import in.nit.service.IWhTypeService;

@Service
public class WhTypeServiceImpl implements IWhTypeService {
	@Autowired
	private IWhTypeDao dao;

	@Transactional
	public Integer saveWhType(WhType ob) {
		return dao.saveWhType(ob);
	}
@Transactional(readOnly = true)
	public List<WhType> getAllWhTypes() {
		return dao.getAllShipmentTypes();
	}
@Transactional
public void deleteWhType(Integer id) {
dao.deleteWhType(id);
}
@Transactional(readOnly = true)
public WhType getOneWhType(Integer id) {
	return dao.getOneWhType(id);
}
@Transactional
public void updateWhType(WhType ob) {
dao.updateWhType(ob);	
}
@Override
public List<Object[]> getWhModeCount() {
	// TODO Auto-generated method stub
	return null;
}
}
