package in.nit.controller;


import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import in.nit.model.Document;
import in.nit.service.IDocumentService;

@Controller
@RequestMapping("/docs")
public class DocumentController {
	@Autowired
	private IDocumentService service;

	@RequestMapping("/show")
	public String showuploadPage(Model model) {
		  List<Object[]> list=service.getIdAndNames();
		  model.addAttribute("list",list);
		return "Document";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String doUpload(@RequestParam Integer fileId, @RequestParam CommonsMultipartFile fileob, Model model) {

		if (fileob != null) {
			Document doc = new Document();
			doc.setFileId(fileId);
			doc.setFileName(fileob.getOriginalFilename());
			doc.setFileData(fileob.getBytes());
			service.saveDocument(doc);
			String msg = fileId + "is Uploaded";
			model.addAttribute("message", msg);
		} 
		else {
			String msg = "file not found";
			model.addAttribute("message", msg);
		}
		return "Redirect:show";
	}
	@RequestMapping("/download")
	public void doDownload(@RequestParam Integer fid,HttpServletResponse resp) {
		Document doc=service.getOneDocument(fid);
		resp.addHeader("content-Disposition","attachment;filename="+doc.getFileName());
		try {
			FileCopyUtils.copy(doc.getFileData(),resp.getOutputStream());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
