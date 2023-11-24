package com.transactions;
import java.time.LocalDateTime;

public class Transactions {
	
	private int id;
	private double amount;
	private LocalDateTime timeStamp;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Transactions [id=" + id + ", amount=" + amount + ", timeStamp=" + timeStamp + ", status=" + status
				+ "]";
	}
	public Transactions(int id, double amount, LocalDateTime timeStamp, String status) {
		super();
		this.id = id;
		this.amount = amount;
		this.timeStamp = timeStamp;
		this.status = status;
	}
	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
