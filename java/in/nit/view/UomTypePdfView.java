package in.nit.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.view.document.AbstractPdfView;


import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;


import in.nit.model.UomType;

public class UomTypePdfView extends AbstractPdfView{
@Override
protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
		HttpServletRequest request, HttpServletResponse response) throws Exception {
	response.addHeader("Content-Disposition", "attachment;filename=UOM.Pdf");
	Paragraph p=new Paragraph("welcome to UOM Type");
	document.add(p);
	List<UomType> list=(List<UomType>) model.get("list");
	PdfPTable t=new PdfPTable(4);
	t.addCell("ID");
	t.addCell("TYPE");
	t.addCell("MODEL");
	t.addCell("DESCRIPTION");
for(UomType st:list) {
	t.addCell(st.getUomId().toString());
	t.addCell(st.getUmType());
	t.addCell(st.getUomModel());
	t.addCell(st.getUomDesc());
	
}
document.add(t);
document.add(new Paragraph(new Date().toString()));

}
}
