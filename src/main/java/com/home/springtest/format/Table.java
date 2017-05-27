package com.home.springtest.format;

import java.util.List;

public class Table {
	private String tableName;
	private List data;
	
	public Table(String tableName, List data){
		this.setTableName(tableName);
		this.data = data;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}



	
}
