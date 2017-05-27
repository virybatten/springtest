package com.home.springtest.format;

public class Employee_3 {
	private int id;
	private String name;
	private String updatedate;
	private int departure;

	public Employee_3(int id, String name, String updatedate, int departure) {
		this.setId(id);
		this.setName(name.trim());
		this.setUpdatedate(updatedate);
		this.setDeparture(departure);
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

	public int getDeparture() {
		return departure;
	}

	public void setDeparture(int departure) {
		this.departure = departure;
	}
}