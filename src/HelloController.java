package com.feng.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

//	@RequestMapping("/{num}")
//	public String index(@PathVariable int num) {
//		return "Hello Spring-Boot World!! " + num;
//	}

	@RequestMapping("/{test}")
	public String index(@PathVariable int test, Model model) {

		model.addAttribute("msg", "total: " + test);
		return "index";
	}
}
