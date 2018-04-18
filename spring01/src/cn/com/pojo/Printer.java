package cn.com.pojo;

public class Printer {
	Paper paper;
	Box box;
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	public Box getBox() {
		return box;
	}
	public void setBox(Box box) {
		this.box = box;
	}
	public void print() {
		System.out.println(paper.getSize() + ":" + box.getColor());
	}
}
