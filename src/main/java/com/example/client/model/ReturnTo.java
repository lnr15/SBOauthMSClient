package com.example.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReturnTo {
	
	@JsonProperty("address")
	Address AddressObject;

	// Getter Methods

	public Address getAddress() {
		return AddressObject;
	}

	// Setter Methods

	public void setAddress(Address addressObject) {
		this.AddressObject = addressObject;
	}
}

