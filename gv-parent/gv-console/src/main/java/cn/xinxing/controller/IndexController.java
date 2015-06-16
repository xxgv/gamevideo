package cn.xinxing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@RequestMapping("/toIndex.do")
	public String toIndex(){
		return "index";
	}
	
}
