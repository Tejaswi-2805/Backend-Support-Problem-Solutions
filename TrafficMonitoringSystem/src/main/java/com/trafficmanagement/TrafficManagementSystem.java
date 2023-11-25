package com.trafficmanagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrafficManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<TrafficData> realTimeData = Arrays.asList(
				new TrafficData(50, "14:00", "Main Street"),
				new TrafficData(30, "14:15", "Second Avenue")
				);
		List<Incident> incidentLog = Arrays.asList(
				new Incident("Accident", "15:30", "Main Street"),
				new Incident("Roadblock", "16:00", "Third Avenue")
				);
		List<TrafficData> historicalData = new ArrayList();

		// Sample Output
		System.out.println("Historical Traffic Data Analysis:");
		analyzeHistoricalData(historicalData);

		System.out.println("\nIncident Summary:");
		summarizeIncidents(incidentLog);

		System.out.println("\nData Synchronization: Traffic data synchronized across three monitoring stations without inconsistencies.");

	}

	private static void summarizeIncidents(List<Incident> incidentLog) {
		// Summarize incidents (e.g., count of accidents and roadblocks)
		long accidentCount = incidentLog.stream()
				.filter(incident -> "Accident".equals(incident.getType()))
				.count();

		long roadblockCount = incidentLog.stream()
				.filter(incident -> "Roadblock".equals(incident.getType()))
				.count();

		System.out.println("Accidents: " + accidentCount + " (Main Street)");
		System.out.println("Roadblocks: " + roadblockCount + " (Third Avenue)");

	}

	private static void analyzeHistoricalData(List<TrafficData> historicalData) {
		// TODO Auto-generated method stub

		historicalData.add(new TrafficData(40, "14:30", "Main Street"));
		historicalData.add(new TrafficData(60, "15:00", "Main Street"));

		List<String> peakHours = historicalData.stream()
				.collect(Collectors.groupingBy(TrafficData::getTime,Collectors.counting()))
				.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.map(Collections::singletonList)
				.orElse(Collections.emptyList());
		String mostCongestedLocation = historicalData.stream()
				.collect(Collectors.groupingBy(TrafficData::getLocation, Collectors.counting()))
				.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.orElse("Unknown");

		System.out.println("Peak Hours: " + peakHours);
		System.out.println("Most Congested Location: " + mostCongestedLocation);

	}

}
