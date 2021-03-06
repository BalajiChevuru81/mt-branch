package com.example.demo.pojos;

//import javax.persistence.Column;

import javax.persistence.Entity;

//import javax.persistence.GeneratedValue;

//import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity

@Table(name="companys")


public class Company {
	@Id
	
	String companyName;
	String turnover;
	String ceo;
	String boardOfDirectors;
	String listInStockExchange;
	String sector;
	String aboutCompany;
	String stockCode;
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", turnover=" + turnover + ", ceo=" + ceo + ", boardOfDirectors="
				+ boardOfDirectors + ", listInStockExchange=" + listInStockExchange + ", sector=" + sector
				+ ", aboutCompany=" + aboutCompany + ", stockCode=" + stockCode + "]";
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTurnover() {
		return turnover;
	}
	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public String getListInStockExchange() {
		return listInStockExchange;
	}
	public void setListInStockExchange(String listInStockExchange) {
		this.listInStockExchange = listInStockExchange;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getAboutCompany() {
		return aboutCompany;
	}
	public void setAboutCompany(String aboutCompany) {
		this.aboutCompany = aboutCompany;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	
	
}
