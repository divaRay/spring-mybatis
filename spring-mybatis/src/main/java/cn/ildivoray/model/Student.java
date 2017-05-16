package cn.ildivoray.model;

public class Student {
	 private long id;
	 private String name;
	 private int qq;
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQq() {
		return qq;
	}
	public void setQq(int qq) {
		this.qq = qq;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", qq=" + qq + "]";
	}
	
	
	
}
