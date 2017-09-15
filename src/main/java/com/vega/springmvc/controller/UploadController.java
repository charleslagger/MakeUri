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
	          @PathVariable(value = "mKey") String mKey){
		
		String[] splitSemicolon = fName.split(";");
		String[] tail = new String[splitSemicolon.length];
		for(int i = 0 ;i < splitSemicolon.length; i++) {
			tail[i] = splitSemicolon[i].substring(splitSemicolon[i].indexOf("_") + 1);
			splitSemicolon[i] = splitSemicolon[i].substring(0, splitSemicolon[i].length() - 2);
		}
		
		model.addAttribute("tail", tail);
		model.addAttribute("splitSemicolon", splitSemicolon);
		
	    model.addAttribute("fName", fName);
	    model.addAttribute("ackUrl", ackUrl);
	    model.addAttribute("mKey", mKey);
	 
	    return "documentView";
	  }
}
