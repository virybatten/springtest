package com.home.springtest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.home.springtest.common.Operations;
import com.home.springtest.format.*;


@RestController
public class HomeController {
	
	//descargar todos los registros de una tabla específica
	@RequestMapping(value="/table/{table}",method = RequestMethod.GET,headers="Accept=application/json")
	public Table listTable(@PathVariable String table){
		Operations op = new Operations();
		return op.listATable(table);
	}
	
	// descargar todos los registros de todas las tablas de la base de datos
	@RequestMapping(value="/tables", method = RequestMethod.GET,headers="Accept=application/json")
	public List listAllTables(){
		List tb = new ArrayList();
		Operations op = new Operations();
		for (int i = 1; i <= 4; i++){
			tb.add(op.listATable("Employee"+i));
		}
		return tb;
	}
	
	//* descargar todos los registros de una tabla específica, indicando fecha
	@RequestMapping(value="/table/{table}/{day}/{month}/{year}", method = RequestMethod.GET,headers="Accept=application/json")
	public Table listDateATable(@PathVariable  String table, @PathVariable  int day, @PathVariable int month, @PathVariable int year){
		Operations op = new Operations();
		return op.listRangeDatesATable(table, day, month, year, day, month, year);
	}
	
	@RequestMapping(value="/tables/{day}/{month}/{year}", method = RequestMethod.GET,headers="Accept=application/json")
	public List listDateAllTables(@PathVariable  int day, @PathVariable int month, @PathVariable int year){
		List tb = new ArrayList();
		Operations op = new Operations();
		for (int i = 1; i <= 4; i++) {
			tb.add(op.listRangeDatesATable("Employee"+i, day, month, year, day, month, year));
		}
		return tb;
	}
		
	@RequestMapping(value="/table/{table}/{day1}/{month1}/{year1}/{day2}/{month2}/{year2}", method = RequestMethod.GET,headers="Accept=application/json")
	public Table listRangeDatesATable(@PathVariable  String table, @PathVariable int day1,@PathVariable int month1,@PathVariable int year1, 
										@PathVariable int day2,@PathVariable int month2,@PathVariable int year2){
		Operations op = new Operations();
		return op.listRangeDatesATable(table, day1, month1, year1, day2, month2, year2);
	}
	
	@RequestMapping(value="/tables/{day1}/{month1}/{year1}/{day2}/{month2}/{year2}", method = RequestMethod.GET,headers="Accept=application/json")
	public List listRangeDatesAllTables(@PathVariable int day1,@PathVariable int month1,@PathVariable int year1, 
										@PathVariable int day2,@PathVariable int month2,@PathVariable int year2){
		List tb = new ArrayList();
		Operations op = new Operations();
		for (int i = 1; i <= 4; i++) {
			tb.add(op.listRangeDatesATable("Employee"+i, day1, month1, year1, day2, month2, year2));
		}
		return tb;
	}
	
	
}