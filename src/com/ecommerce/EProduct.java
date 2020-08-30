package com.ecommerce;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EProduct {

	private int id;
	private String name;
	private double price;
	private Date dateAdded;
	private List<Color> colors;
	private Collection<ScreenSizes> screenSizes;
	private Set<OS> os;
	private Map finance;
	
	
	public EProduct() {
		super();
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	public List<Color> getColors() {
		return colors;
	}
	public void setColors(List<Color> colors) {
		this.colors = colors;
	}
	public Collection<ScreenSizes> getScreenSizes() {
		return screenSizes;
	}
	public void setScreenSizes(Collection<ScreenSizes> screenSizes) {
		this.screenSizes = screenSizes;
	}
	public Set<OS> getOs() {
		return os;
	}
	public void setOs(Set<OS> os) {
		this.os = os;
	}
	public Map getFinance() {
		return finance;
	}
	public void setFinance(Map finance) {
		this.finance = finance;
	}
	@Override
	public String toString() {
		return "EProduct [id=" + id + ", name=" + name + ", price=" + price + ", dateAdded=" + dateAdded + ", colors="
				+ colors + ", screenSizes=" + screenSizes + ", os=" + os + ", finance=" + finance + "]";
	}
	
	
	
	
}
