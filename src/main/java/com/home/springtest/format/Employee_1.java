package com.home.springtest.format;


public class Employee_1 {
	private int id;
	private String name;
	private String updatedate;
	

	public Employee_1(int id, String name, String updatedate) {
		this.setId(id);
		this.setName(name.trim());
		this.setUpdatedate(updatedate);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
}
