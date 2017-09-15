package com.vega.springmvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping(value = "/fname={fName}&ackurl={ackUrl}&mkey={mKey}", method = RequestMethod.GET)
	public ModelAndView getData(Model _model,
			@PathVariable(value = "fName") String fName,
	        @PathVariable(value = "ackUrl") String ackUrl,
	        @PathVariable(value = "mKey") String mKey){
		List<Map<String, String>> lists = getList(fName);
		//tham chieu toi mainView.jsp
		ModelAndView model = new ModelAndView("mainView");
		model.addObject("lists", lists);
		_model.addAttribute("fName", fName);
		return model;
	}
	
	public List<Map<String, String>> getList(String fileName){
		String[] splitSemicolon = fileName.split(";");
		String[] tails = new String[splitSemicolon.length];
		
		for(int i = 0; i < splitSemicolon.length; i++){
			tails[i] = splitSemicolon[i].substring(splitSemicolon[i].indexOf("_") + 1);
			splitSemicolon[i] = splitSemicolon[i].substring(0, splitSemicolon[i].length() - 2);
		}
		
		List<Map<String, String>> lists = new ArrayList<Map<String, String>>();
		
		for(int i = 0; i < splitSemicolon.length; i++) {
			Map<String, String> map = new HashMap<String, String>();
			map.put(splitSemicolon[i], tails[i]);
			lists.add(map);
		}
		
		return lists;
	}
}
