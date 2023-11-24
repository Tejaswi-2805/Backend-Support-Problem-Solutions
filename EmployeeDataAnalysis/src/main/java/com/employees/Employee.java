package com.employees;

import java.time.LocalDate;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private double sal;
	private LocalDate joinDate;
	public Employee(int id, String name, String dept, double sal, LocalDate joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
		this.joinDate = joinDate;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", sal=" + sal + ", joinDate=" + joinDate
				+ "]";
	}

}
