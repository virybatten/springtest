package com.home.springtest.format;

public class Employee_4{
	private int id;
	private String name;
	private String updatedate;
	private Boolean status;
	private int level;

	public Employee_4(int id, String name, String updatedate, Boolean status, int level) {
		this.setId(id);
		this.setName(name.trim());
		this.setUpdatedate(updatedate);
		this.setStatus(status);
		this.setLevel(level);
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}