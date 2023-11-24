package com.productanalysis;

public class ProductInfo {
	
	private int id;
	private String name;
	private String Category;
	private int price;
	private int quantity;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return Category;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ProductInfo(int id, String name, String category, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		Category = category;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductInfo [id=" + id + ", name=" + name + ", Category=" + Category + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	
}
