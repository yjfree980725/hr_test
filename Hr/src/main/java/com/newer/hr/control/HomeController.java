package com.newer.hr.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 默认控制器(返回视图)
 * @author Administrator
 */
@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "home.html";
	}

}
