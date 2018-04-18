package cn.com.test;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.pojo.Computer;
import cn.com.pojo.Printer;
import cn.com.service.UserService;
public class Demo1 {
	
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");//加载配置文件
		UserService us = (UserService) context.getBean("userService");
		us.addUser();
	}
	@Test
	public void test1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");//加载配置文件
		Computer com = (Computer) context.getBean("computer");
		com.show();
	}
	@Test
	public void test2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");//加载配置文件
		Printer pt = (Printer) context.getBean("printer");
		pt.print();
		Printer pt2 = (Printer) context.getBean("printer");
		if (pt == pt2) {
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}
	}
}
