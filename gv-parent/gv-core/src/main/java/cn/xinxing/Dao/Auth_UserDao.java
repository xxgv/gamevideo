package cn.xinxing.Dao;

import java.util.List;

import cn.xinxing.model.AuthUser;

public interface Auth_UserDao {
	public void insertSelective(AuthUser authuser);
	public void deleteUser(Integer userId);
	public AuthUser selectById(Integer userId);
	public void updateUser(AuthUser authuser);
	public List<AuthUser> selectAll();
}
