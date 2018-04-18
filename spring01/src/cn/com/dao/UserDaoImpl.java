package cn.com.dao;

public class UserDaoImpl implements UserDao {
	@Override
	public void save(){
		System.out.println("数据库层级调用dao代码！");
	}
}
