package com.trafficmanagement;

public class TrafficData {
	
	private int vehicleCount;
	private String time;
	private String location;
	public int getVehicleCount() {
		return vehicleCount;
	}
	public String getTime() {
		return time;
	}
	public String getLocation() {
		return location;
	}
	public TrafficData(int vehicleCount, String time, String location) {
		super();
		this.vehicleCount = vehicleCount;
		this.time = time;
		this.location = location;
	}
	@Override
	public String toString() {
		return "TrafficData [vehicleCount=" + vehicleCount + ", time=" + time + ", location=" + location + "]";
	}
	
	
}
