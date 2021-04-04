package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sun.misc.Contended;

@Controller
public class HomeCtrl
{
	@RequestMapping("/home")
	public String home(Model m)
	{
		String str="value1";
		m.addAttribute("name", str);
		return "home";
	}
}
