package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IPartDao;
import in.nit.model.Part;

@Repository
public class PartDaoImpl implements IPartDao {
	@Autowired
	private HibernateTemplate ht;

	public Integer savePart(Part ob) {
		return (Integer) ht.save(ob);
	}

	public List<Part> getAllPart() {
		return ht.loadAll(Part.class);
	}

	public void deletePart(Integer id) {
		ht.delete(ht.get(Part.class, id));
	}

	public Part getOnePart(Integer id) {
		return ht.get(Part.class, id);
	}
	public void updatePart(Part ob) {
		ht.update(ob);
	}
}
