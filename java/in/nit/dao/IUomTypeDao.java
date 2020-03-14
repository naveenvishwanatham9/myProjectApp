package in.nit.dao;

import java.util.List;

import in.nit.model.UomType;

public interface IUomTypeDao {
Integer saveUomType(UomType ob);
List<UomType> getAllUomTypes();
void deleteUomType(Integer id);
UomType getOneUomType(Integer id);
void UpdateUomType(UomType ob);
public List<Object[]> getUomTypeCount();
List<Object[]> getUomIdAndModel();
}

