package in.nit.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import in.nit.model.Part;
import in.nit.model.ShipmentType;

public class PartExcelView extends AbstractXlsxView{
@Override
protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
response.addHeader("Content-Disposition", "attachment;filename=Part.xlsx");	
Sheet s=workbook.createSheet("PART");
setHeader(s);
List<Part> list=(List<Part>)model.get("list");
setBody(s,list);

}



private void setBody(Sheet s, List<Part> list) {
	int count=1;
	for(Part st:list) {
		Row r=s.createRow(count++);
		r.createCell(0).setCellValue(st.getId());
		r.createCell(1).setCellValue(st.getPartCode());
		r.createCell(2).setCellValue(st.getPartLen());
		r.createCell(3).setCellValue(st.getPartWid());
		r.createCell(4).setCellValue(st.getPartHgt());
		r.createCell(5).setCellValue(st.getBaseCost());
		r.createCell(6).setCellValue(st.getBaseCurrency());
		r.createCell(7).setCellValue(st.getUomOb().getUomModel());
		r.createCell(8).setCellValue(st.getNote());
	}
}



private void setHeader(Sheet s) {
Row r=s.createRow(0);
r.createCell(0).setCellValue("ID");
r.createCell(1).setCellValue("CODE");
r.createCell(2).setCellValue("LENGTH");
r.createCell(3).setCellValue("WIDTH");
r.createCell(4).setCellValue("HEIGHT");
r.createCell(5).setCellValue("COST");
r.createCell(6).setCellValue("CURRENCY");
r.createCell(7).setCellValue("UOM");
r.createCell(8).setCellValue("DESCRIPTION");

}
	
}

