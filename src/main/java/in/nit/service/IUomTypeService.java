package in.nit.service;



import java.util.List;

import in.nit.model.UomType;

public interface IUomTypeService {
Integer saveUomType(UomType ob);
List<UomType> getAllUomTypes();
void deleteUomType(Integer id);
UomType getOneUomType(Integer id);
void UpdateUomType(UomType ob);
public List<Object[]> getUomTypeCount();
}

