package cn.com.service;

import cn.com.dao.UserDao;
public class UserServiceImpl implements UserService{
	private UserDao dao;//要注入的对象属性
	public UserDao getDao() {
		return dao;
	}
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	@Override
	public void addUser() {
		System.out.println("用户添加方法！");
		dao.save();
	}
}