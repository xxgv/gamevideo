package cn.xinxing.serviceImpl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.xinxing.model.AuthUser;
import cn.xinxing.service.Auth_UserService;

public class Auth_UserServiceImplTest {


	@Test
	public void test() {
		ApplicationContext apx = new ClassPathXmlApplicationContext("beans.xml");
		Auth_UserService service = (Auth_UserService) apx.getBean("auth_UserServiceImpl");
		System.out.println(service);
		AuthUser authuser = new AuthUser();
		authuser.setEmail("123");
		authuser.setGender(1);
		authuser.setIsOutperson(0);
		authuser.setPassword("111");
		authuser.setUsername("测试");
		service.insertSelective(authuser);
	}

}
