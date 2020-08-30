package com.ecommerce;

public class Color {

	private int colorId;
	private String name;
	
	
	public Color() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Color(String name) {
		super();
		this.colorId=0;
		this.name = name;
	}
	
	public int getColorId() {
		return colorId;
	}

	public void setColorId(int colorId) {
		this.colorId = colorId;
	}

	public Color(int id, String name) {
		super();
		this.colorId = id;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Color [id=" + colorId + ", name=" + name + "]";
	}
	
	
}
