package com.cts.project.pojos;

import java.sql.Time;

import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity

@Table(name = "stockprice")

public class StockPrice {

	@Id
	private String companyname;
	
	@Override

	public String toString() {

		return "StockPrice [companyname=" + companyname + ", stockexchange=" + stockexchange + ", currentprice="

				+ currentprice + ", date=" + date + ", time=" + time + "]";

	}
	private String stockexchange;
	public String getStockexchange() {
		return stockexchange;
	}

	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}
	private String currentprice;
	private String date;
	private String time;
	

	public String getCompanyname() {

		return companyname;

	}

	public void setCompanyname(String companyname) {

		this.companyname= companyname;

	}

	

	public String getCurrentprice() {

		return currentprice;

	}

	public void setCurrentprice(String currentprice) {

		this.currentprice = currentprice;

	}

	public String getDate() {

		return date;

	}

	public void setDate(String date) {

		this.date = date;

	}

	public String getTime() {

		return time;

	}

	public void setTime(String time) {

		this.time = time;

	}

}
