package com.productInv;

public class Product {

		// TODO Auto-generated method stub
		private String id;
	    private String name;
	    private String category;
	    private double price;
	    private int quantity;
		public String getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getCategory() {
			return category;
		}
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public Product(String id, String name, String category, double price, int quantity) {
			super();
			this.id = id;
			this.name = name;
			this.category = category;
			this.price = price;
			this.quantity = quantity;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price
					+ ", quantity=" + quantity + "]";
		}   
	    

}


