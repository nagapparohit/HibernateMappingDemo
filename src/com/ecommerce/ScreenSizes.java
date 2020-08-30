package com.ecommerce;

public class ScreenSizes {

	private int  screenId;
	private String size;
	
	
	public ScreenSizes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScreenSizes(String size) {
		super();
		this.screenId=0;
		this.size = size;
	}
	public ScreenSizes(int screenId, String size) {
		super();
		this.screenId = screenId;
		this.size = size;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "ScreenSizes [screenId=" + screenId + ", size=" + size + "]";
	}
	
	
	
	
	
	
}
