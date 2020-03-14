package in.nit.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.springframework.web.servlet.view.document.AbstractPdfView;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import in.nit.model.OrderMethod;
import in.nit.model.ShipmentType;

public class OrderMethodPdfView extends AbstractPdfView{
@Override
protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
		HttpServletRequest request, HttpServletResponse response) throws Exception {
	response.addHeader("Content-Disposition", "attachment;filename=Order.Pdf");
	Paragraph p=new Paragraph("welcome to OrderMethod");
	document.add(p);
	List<OrderMethod> list=(List<OrderMethod>) model.get("list");
	PdfPTable t=new PdfPTable(6);
	t.addCell("ID");
	t.addCell("MODE");
	t.addCell("CODE");
	t.addCell("TYPE");
	t.addCell("ACCEPT");
	t.addCell("DESCRIPTION");
for(OrderMethod st:list) {
	t.addCell(st.getOrderId().toString());
	t.addCell(st.getOrderMode());
	t.addCell(st.getOrderCode());
	t.addCell(st.getOrderType());
	t.addCell(st.getOrderAccept().toString());
	t.addCell(st.getOrderDesc());
	
}
document.add(t);
document.add(new Paragraph(new Date().toString()));

}
}
