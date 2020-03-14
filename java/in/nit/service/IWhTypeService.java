package in.nit.service;

import java.util.List;

import in.nit.model.Document;
import in.nit.model.ShipmentType;
import in.nit.model.WhType;

public interface IWhTypeService {
	Integer saveWhType(WhType ob);

	List<WhType> getAllWhTypes();

	public void deleteWhType(Integer id);

	WhType getOneWhType(Integer id);

	void updateWhType(WhType ob);

	public List<Object[]> getWhModeCount();
	public List<Object[]> getwhIdAndCode(String type);
}
