package com.transactions;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Transactions> transactions = Arrays.asList(
				new Transactions(1, 200, LocalDateTime.parse("2023-11-01T12:00:00"), "Completed"),
                new Transactions(2, 150, LocalDateTime.parse("2023-11-01T13:00:00"), "Pending"),
                new Transactions(3, 300, LocalDateTime.parse("2023-11-01T14:00:00"), "Completed")
				);
		
//		filtered Transactions
		List<Transactions> filteredTransactions = transactions.stream()
													.filter(i -> i.getAmount()> 150 && i.getStatus()== "Completed")
													.collect(Collectors.toList());
		System.out.println("Filtered Transactions (amount > 150 and status = 'Completed'): \n" + filteredTransactions);
		
//		Sorted Transactions
		List<Transactions> sortedTransactions = transactions.stream()
													.sorted((i1,i2) -> Double.compare(i2.getAmount(), i1.getAmount()))
													.collect(Collectors.toList());
		System.out.println("Sorted Transactions: \n" + sortedTransactions);
		
//		Total Amount
		double totalTransactions = transactions.stream()
													.mapToDouble(k -> k.getAmount()).sum();													
		System.out.println("Total Amount: " + totalTransactions);
		
//		Grouped by Status
		Map<String, Double> groupedByStatus = transactions.stream()
                .collect(Collectors.groupingBy(Transactions::getStatus, Collectors.summingDouble(Transactions::getAmount)));
        System.out.println("Grouped by Status: " + groupedByStatus);
		
	}

}
