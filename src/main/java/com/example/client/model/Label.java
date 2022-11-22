package com.example.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Label {
	
	
	@JsonProperty("trackingNumber")
	private String trackingNumber;
	
	@JsonProperty("trackingUrl")
	private String trackingUrl;
	// Getter Methods

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public String getTrackingUrl() {
		return trackingUrl;
	}

	// Setter Methods

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public void setTrackingUrl(String trackingUrl) {
		this.trackingUrl = trackingUrl;
	}
}
