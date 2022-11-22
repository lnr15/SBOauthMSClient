package com.example.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipFrom {
	@JsonProperty("address")
	Address AddressObject;
	
	@JsonProperty("accountNumber")
	private String accountNumber;
	
	@JsonProperty("locationId")
	private String locationId;

	// Getter Methods

	public Address getAddress() {
		return AddressObject;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getLocationId() {
		return locationId;
	}

	// Setter Methods

	public void setAddress(Address addressObject) {
		this.AddressObject = addressObject;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
}
