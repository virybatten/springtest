package com.home.springtest.model;

import java.util.Date;

/**
 * Employee2 generated by hbm2java
 */
public class Employee2 implements java.io.Serializable {

	private int id;
	private String name;
	private Date updatedate;
	private String opinion;

	public Employee2() {
	}

	public Employee2(int id) {
		this.id = id;
	}

	public Employee2(int id, String name, Date updatedate, String opinion) {
		this.id = id;
		this.name = name;
		this.updatedate = updatedate;
		this.opinion = opinion;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

}