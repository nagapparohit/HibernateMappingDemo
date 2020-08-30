package com.ecommerce;

public class OS {

	private int osId;
	private String name;
	
	public OS(String name) {
		super();
		this.osId=0;
		this.name = name;
	}
	public OS() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OS(int osId, String name) {
		super();
		this.osId = osId;
		this.name = name;
	}
	public int getOsId() {
		return osId;
	}
	public void setOsId(int osId) {
		this.osId = osId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "OS [osId=" + osId + ", name=" + name + "]";
	}
	
	
}
