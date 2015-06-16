package cn.xinxing.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JunitTest {

	@Test
	public void test1() throws SQLException{
		
		ApplicationContext apx = new ClassPathXmlApplicationContext("beans.xml");
		
		DriverManagerDataSource dm =  (DriverManagerDataSource) apx.getBean("dataSource");
	/*	String sn = 
	     b.getSqlSession().insert(sn+"insert", brand);*/
		System.out.println(dm);
		Connection conn = dm.getConnection();
		
		Statement stat = conn.createStatement();
		
		boolean b = stat.execute("INSERT INTO auth_user VALUES(NULL,'admin','admin','1',NULL,NULL)");
		System.out.println(b);
		if(b){
			System.out.println("成功");
		}
		
	}
}
