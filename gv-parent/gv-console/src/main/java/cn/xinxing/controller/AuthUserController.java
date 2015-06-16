package cn.xinxing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.xinxing.model.AuthUser;
import cn.xinxing.service.Auth_UserService;
import cn.xinxing.utils.UUIDUtils;

@Controller
@RequestMapping("/authUser")
public class AuthUserController {
	
	@Autowired
	Auth_UserService service; 
	
	@RequestMapping("/toReg.do")
	public String toReg(){
		return "reg";
	}
	
	@RequestMapping("/reg.do")
	public String reg(String username,String password,Integer mobile){
		AuthUser authuser = new AuthUser();
		authuser.setUsername(username);
		authuser.setPassword(password);
		authuser.setMobile(mobile);
		authuser.setGender(0);
		authuser.setIsOutperson(0);
		authuser.setEmail(null);
//		authuser.setUserid(UUIDUtils.getUUID());
		service.insertSelective(authuser);
		return "login";
	}
	
}
