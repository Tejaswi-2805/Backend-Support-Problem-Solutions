package com.productInv;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InnventoryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> products = Arrays.asList(
				new Product("001", "Laptop", "Electronics", 1200, 10),
				new Product("002", "Shirt", "Apparel", 40, 4),
				new Product("003", "Headphones", "Electronics", 100, 15),
				new Product("004", "Jeans", "Apparel", 60, 5)	
				);

		//		product catalog
		Map<String, Product> productCatalog = products.stream()
				.collect(Collectors.toMap(Product::getId, product -> product));
		System.out.println("Product Catalog: ");
		((Map<String, Product>) productCatalog).values().forEach(System.out::println);

		//		Category-wise Product Listing
		Map<String, String> productIdsByCategory = products.stream()
				.collect(Collectors.groupingBy(Product::getCategory,
						Collectors.mapping(Product::getId, Collectors.joining(", "))));
		System.out.println("\nProducts by Category:");
		productIdsByCategory.forEach((category, ids) -> {
			System.out.println(category + " :Employee Ids : [ " + ids + "]");
		});

		//		Inventory status tracking
		int threshold=5;
		List<Product> flaggedForReorder = products.stream()
				.filter(p->p.getQuantity()<threshold)
				.collect(Collectors.toList());
		System.out.println("\nInventory Status (Threshold: " + threshold + " units):");
		System.out.println("Flagged for Reorder: " + flaggedForReorder);

		//		Frequent product updates
		String productIdToUpdate = "003";
		double newPrice = 130;
		double oldPrice = productCatalog.get(productIdToUpdate).getPrice();
		productCatalog.get(productIdToUpdate).setPrice(newPrice);
		System.out.println("\nProduct Update: Price of product " + productCatalog.get(productIdToUpdate).getId() +
				" updated from " + oldPrice + " to " + newPrice + ".");



	}

}
