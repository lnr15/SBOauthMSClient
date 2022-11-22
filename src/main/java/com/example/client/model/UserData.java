package com.example.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserData{

	@JsonProperty("data")
	Data data;

	// Getter Methods

	public Data getData() {
		return data;
	}

	// Setter Methods

	public void setData(Data data) {
		this.data = data;
	}
}












