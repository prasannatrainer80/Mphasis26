package com.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameListController {
@RequestMapping("/names")
public ModelAndView nameDemo(){
	List<String> lstNames=new ArrayList<String>();
	lstNames.add("Sindhuvi");
	lstNames.add("Felix");
	lstNames.add("Kishore");
	lstNames.add("Agalya");
	lstNames.add("Arifa");
	return new ModelAndView("ShowPage","lists",lstNames);
}
}
