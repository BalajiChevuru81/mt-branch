package com.example.demo.pojos;



//import java.util.Optional;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;


@Entity

@Table(name="iposs")
	public class IposPlanned {
	
	@Id
	int id1;
	String companyName;
	String stockExchange;
    String pricePerShare;
    String totalNumOfShares;
	String openDateTime;
	String remarks;
	
    
    
	@Override
	public String toString() {
		return "IposPlanned [id1=" + id1 + ", companyName=" + companyName + ", stockExchange=" + stockExchange
				+ ", pricePerShare=" + pricePerShare + ", totalNumOfShares=" + totalNumOfShares + ", openDateTime="
				+ openDateTime + ", remarks=" + remarks + "]";
	}
	public int getId1() {
		return id1;
	}
	public void setId1(int id1) {
		this.id1 = id1;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(String pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public String getTotalNumOfShares() {
		return totalNumOfShares;
	}
	public void setTotalNumOfShares(String totalNumOfShares) {
		this.totalNumOfShares = totalNumOfShares;
	}
	public String getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public static void setiposPlanned(IposPlanned iposPlanned) {
		// TODO Auto-generated method stub
		
	}
	
			
}
