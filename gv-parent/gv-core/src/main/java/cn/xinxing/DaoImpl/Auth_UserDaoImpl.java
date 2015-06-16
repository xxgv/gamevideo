package cn.xinxing.DaoImpl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import cn.xinxing.Dao.Auth_UserDao;
import cn.xinxing.model.AuthUser;
@Repository
public class Auth_UserDaoImpl extends SqlSessionDaoSupport implements
		Auth_UserDao {

	String sn = "sql.mapper.AuthUserMapper.";
	public void insertSelective(AuthUser authuser) {
		this.getSqlSession().insert(sn+"insertSelective", authuser);
	}

	public void deleteUser(Integer userId) {
		this.getSqlSession().delete(sn+"deleteByPrimaryKey",userId);
	}

	public AuthUser selectById(Integer userId) {
		return (AuthUser) this.getSqlSession().selectOne(sn+"selectByPrimaryKey", userId);
	}

	public void updateUser(AuthUser authuser) {
		this.getSqlSession().update(sn+"updateByPrimaryKeySelective", authuser);
	}

	public List<AuthUser> selectAll() {
		return this.getSqlSession().selectList(sn+"selectAll");
	}

}
