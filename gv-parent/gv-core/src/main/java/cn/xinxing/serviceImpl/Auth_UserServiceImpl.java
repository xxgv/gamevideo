package cn.xinxing.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xinxing.Dao.Auth_UserDao;
import cn.xinxing.model.AuthUser;
import cn.xinxing.service.Auth_UserService;

@Service
public class Auth_UserServiceImpl implements Auth_UserService {

	@Autowired
	Auth_UserDao ud;
	public void insertSelective(AuthUser authuser) {
		ud.insertSelective(authuser);
	}

	public void deleteUser(Integer userId) {
		ud.deleteUser(userId);
	}

	public AuthUser selectById(Integer userId) {
		return ud.selectById(userId);
	}

	public void updateUser(AuthUser authuser) {
		ud.updateUser(authuser);
	}

	public List<AuthUser> selectAll() {
		return ud.selectAll();
	}

}
