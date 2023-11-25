package com.empmanagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = Arrays.asList(
				new Employee(101, "Alice", "HR", 60000),
				new Employee(102, "Bob", "IT", 70000),
				new Employee(103, "Charlie", "HR", 65000),
				new Employee(104, "Diana", "Sales", 55000),
				new Employee(105, "Ethan", "IT", 72000)
				);

		//		Store Employee Details
		Map<Integer, Employee> employeeMap = employees.stream()
				.collect(Collectors.toMap(Employee::getId, employee -> employee));
        System.out.println("Employee IDs: " + employeeMap.keySet());

		// Department-Wise Employee Grouping
		Map<String, List<Integer>> departmentGrouping = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.mapping(Employee::getId, Collectors.toList())));
		System.out.println("\nGrouped by Department:");
		departmentGrouping.forEach((department, idList) -> {
			System.out.println(department + ": " + idList);
		});

		// Salary Range Query
		int minSal = 55000;
		int maxSal = 70000;
		List<Integer> salaryInRange = employees.stream()
				.filter(employee -> employee.getSalary() >= minSal && employee.getSalary() <= maxSal)
				.map(Employee::getId)
				.collect(Collectors.toList());
        System.out.println("\nSalary Range Query (" + minSal + "-" + maxSal + ") - Employee IDs: " + salaryInRange);

		// Employee De-duplication: 
		employees = new ArrayList<>(new HashSet<>(employees));


	}

}
