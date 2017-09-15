package com.vega.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vega.springmvc.model.ElementUri;

@Controller
public class MainController {
	@RequestMapping(value = "/fname={fName}&ackurl={ackUrl}&mkey={mKey}", method = RequestMethod.GET)
	public ModelAndView getData(Model _model,
			@PathVariable(value = "fName") String fName,
	        @PathVariable(value = "ackUrl") String ackUrl,
	        @PathVariable(value = "mKey") String mKey){
		List<ElementUri> lists = getList(fName);
		//tham chieu toi mainView.jsp
		ModelAndView model = new ModelAndView("mainView");
		model.addObject("lists", lists);
		_model.addAttribute("fName", fName);
		return model;
	}
	
	public List getList(String fileName) {
		String[] splitSemicolon = fileName.split(";");
		for(int i = 0 ;i < splitSemicolon.length; i++) {
			splitSemicolon[i] = splitSemicolon[i].substring(0, splitSemicolon[i].length() - 2);
		}
		
		List<ElementUri> lists = new ArrayList<ElementUri>();
		
		for(int i = 0; i < splitSemicolon.length; i++) {
			ElementUri uri = new ElementUri(splitSemicolon[i]);
			lists.add(uri);
		}
		
		return lists;	
	}
}
