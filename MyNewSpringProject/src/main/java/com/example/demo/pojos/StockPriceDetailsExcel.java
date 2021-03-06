package com.example.demo.pojos;

import java.sql.Date;

//import javax.persistence.Column;

import javax.persistence.Entity;

//import javax.persistence.GeneratedValue;

//import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity

@Table(name="stockpricedetailsexcelss")


public class StockPriceDetailsExcel {

	@Id
	
	int companyCode;
	String stockExchange;
	double currentPrice;
	Date date;

	@Override
	public String toString() {
		return "StockPriceDetailsExcel [companyCode=" + companyCode + ", stockExchange=" + stockExchange
				+ ", currentPrice=" + currentPrice + ", date=" + date + "]";
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	


}
