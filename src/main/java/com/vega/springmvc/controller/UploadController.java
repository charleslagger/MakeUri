package com.vega.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UploadController {	
	@RequestMapping("/fname={fName}&ackurl={ackUrl}&mkey={mKey}")
	  public String documentView(Model model,
	          @PathVariable(value = "fName") String fName,
	          @PathVariable(value = "ackUrl") String ackUrl,
	          @PathVariable(value = "mKey") String mKey) {
		  //Todo: split 0 and 1
	      model.addAttribute("fName", fName);
	      model.addAttribute("ackUrl", ackUrl);
	      model.addAttribute("mKey", mKey);
	 
	      return "documentView";
	  }
	
	public String zeroFile(String fileName){
		String[] temp = fileName.split("0");
		for(int i = 0; i < temp.length; i++) {
			if(temp[i].length() == 1) {
				
			}
		}
		for(int i = 0; i < temp.length; i++) {
			String[] secondTemp = temp[i].split("1");
		}
		fileName = temp[0];
		return fileName;
	}
	
	//Todo
	public String oneFile(String fileName) {
		String[] temp = fileName.split("0");
		fileName = temp[0];
		return fileName;
	}
}
