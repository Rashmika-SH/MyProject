package com.tns.nonaccess;

public class employee {
	private String name;
	private int id;
	static String companyName="TNSIF";
	
	public Employee(String name, int id) {
		super();
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", id=" + id + "]";
	}
}
