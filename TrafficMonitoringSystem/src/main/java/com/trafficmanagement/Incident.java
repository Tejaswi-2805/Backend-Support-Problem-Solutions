package com.trafficmanagement;

public class Incident {
	private String type;
	private String time;
	private String location;
	public Incident(String type, String time, String location) {
		super();
		this.type = type;
		this.time = time;
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public String getTime() {
		return time;
	}
	public String getLocation() {
		return location;
	}
	@Override
	public String toString() {
		return "Incident [type=" + type + ", time=" + time + ", location=" + location + "]";
	}
	
	
	

}
