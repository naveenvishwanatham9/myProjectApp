package in.nit.service;

import java.util.List;

import in.nit.model.Document;

public interface IDocumentService {
	Integer saveDocument(Document doc);
	public List<Object[]> getIdAndNames();
	public Document getOneDocument(Integer id);
}
