package com.ecommerce;

public class Finance {

	private int financeId;
	private String ftype;
	private String name;
	
	public Finance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Finance(String ftype, String name) {
		super();
		this.financeId=0;
		this.ftype = ftype;
		this.name = name;
	}
	public Finance(int financeId, String ftype, String name) {
		super();
		this.financeId = financeId;
		this.ftype = ftype;
		this.name = name;
	}
	public int getFinanceId() {
		return financeId;
	}
	public void setFinanceId(int financeId) {
		this.financeId = financeId;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Finance [financeId=" + financeId + ", ftype=" + ftype + ", name=" + name + "]";
	}
	
	
}
