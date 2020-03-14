package in.nit.dao;

import java.util.List;

import in.nit.model.Part;
import in.nit.model.ShipmentType;

public interface IPartDao {
Integer savePart(Part ob);
List<Part> getAllPart();
public void deletePart(Integer id);
Part getOnePart(Integer id);
void updatePart(Part ob);


}
