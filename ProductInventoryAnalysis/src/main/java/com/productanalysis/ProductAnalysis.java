package com.productanalysis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<ProductInfo> products = Arrays.asList(
				new ProductInfo(1, "Laptop", "Electronics", 1000, 5),
				new ProductInfo(2, "Headphones", "Electronics", 150, 10),
				new ProductInfo(3, "Desk", "Furniture", 200, 3)
				);
		
//		Filtered Products
		List<ProductInfo> filteredProducts = products.stream()
												.filter(p -> p.getQuantity() < 10 && p.getCategory()=="Electronics")
												.collect(Collectors.toList());
		System.out.println("filtered products: "+ filteredProducts);
		
//		Statistics
		Map<String, IntSummaryStatistics> categoryStatistics = products.stream()
                .collect(Collectors.groupingBy(
                        ProductInfo::getCategory,
                        Collectors.summarizingInt(ProductInfo::getPrice)
                ));
        categoryStatistics.forEach((category, stats) -> {
            System.out.println("\n Statistics for '" + category + "': Average Price = " + stats.getAverage() + ", Total Quantity = " + stats.getSum());
        });
		
//        Conversion
        Map<Integer, String> productMap = products.stream()
                .collect(Collectors.toMap(ProductInfo::getId, ProductInfo::getName));
        System.out.println("\n Product Map: " + productMap);
        
        
     // Custom Sorting
        List<ProductInfo> sorting = products.stream()
                .sorted(Comparator.comparingDouble(product -> (double) product.getPrice() / product.getQuantity()))
                .collect(Collectors.toList());
        System.out.println("\n Products Sorted by Price-to-Quantity Ratio: \n" + sorting);
   
												
	}

}
