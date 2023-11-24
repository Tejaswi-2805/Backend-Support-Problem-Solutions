package com.employees;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.Optional;

public class EmployeeDataProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees=Arrays.asList(
				new Employee(1, "Alice", "IT", 70000, LocalDate.parse("2020-01-01")),
				new Employee(2, "Bob", "HR", 50000, LocalDate.parse("2021-06-01")),
				new Employee(3, "Charlie", "IT", 80000, LocalDate.parse("2022-01-01"))
				);

//		filtered Employees
		List<String> fEmployees =   employees.stream()
		.filter( e -> e.getJoinDate().isAfter(LocalDate.parse("2021-01-01"))== true)
		.map(Employee::getName)
		.collect(Collectors.toList());
		System.out.println("Filtered Employees (Joined after '2021-01-01'): \n" + fEmployees);

//		Average Salary
		OptionalDouble avgSal = employees.stream()
									.filter( i -> i.getDept()== "IT")
									.mapToDouble(e -> e.getSal()).average();
		System.out.println("\nAverage sal is: " + avgSal);

//		IT dept employee names
		List<String> namEmployees = employees.stream()
										.filter(i->i.getDept().equals("IT"))
										.map(Employee::getName)
										.collect(Collectors.toList());
		System.out.println("\nIT Department Employee Names: " + namEmployees);
		
//		Highest & Lowest Sal
		Optional<Employee> highestSalaryEmployee = employees.stream()
				.max((e1, e2) -> Double.compare(e1.getSal(), e2.getSal()));
		Optional<Employee> lowestSalaryEmployee = employees.stream()
				.min((e1, e2) -> Double.compare(e1.getSal(), e2.getSal()));

		highestSalaryEmployee.ifPresent(e -> System.out.println("\nHighest Salary: Employee " + e.getId() + " (" + e.getSal() + ")"));
		lowestSalaryEmployee.ifPresent(e -> System.out.println("Lowest Salary:Employee " + e.getId() + "( "+ e.getSal() +")"));
		

	}

}
