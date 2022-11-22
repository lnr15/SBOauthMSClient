package com.example.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
	@JsonProperty("attributes")
	Attributes attribute;

	// Getter Methods

	public Attributes getAttributes() {
		return attribute;
	}

	// Setter Methods

	public void setAttributes(Attributes attributesObject) {
		this.attribute = attributesObject;
	}
}
