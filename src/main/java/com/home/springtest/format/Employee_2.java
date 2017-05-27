package com.home.springtest.format;

public class Employee_2 {
	private int id;
	private String name;
	private String updatedate;
	private String opinion;

	public Employee_2(int id, String name, String updatedate, String opinion) {
		this.setId(id);
		this.setName(name.trim());
		this.setUpdatedate(updatedate);
		this.setOpinion(opinion.trim());
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

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
}