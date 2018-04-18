package cn.com.pojo;

public class Computer {
	private String screen;
	private String box;
	private double price;
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getBox() {
		return box;
	}
	public void setBox(String box) {
		this.box = box;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void show() {
		System.out.println("电脑显示器:"+this.screen+",电脑主机:"+this.box+",电脑价格:"+this.price);
	}
}
