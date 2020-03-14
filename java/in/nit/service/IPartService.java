package in.nit.service;

import java.util.List;

import in.nit.model.Part;

public interface IPartService {
Integer partSave(Part ob);
List<Part> getAllPart();
public void deletePart(Integer id);
Part getOnePart(Integer id);
void updatePart(Part ob);


}
