package com.example.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

	@JsonProperty("address1")
	private String address1;
	@JsonProperty("address2")
	private String address2;
	@JsonProperty("address3")
	private String address3;
	@JsonProperty("city")
	private String city;
	@JsonProperty("state")
	private String state;
	@JsonProperty("provinceCode")
	private String provinceCode;
	@JsonProperty("country")
	private String country;
	@JsonProperty("zipcode")
	private String zipcode;

	// Getter Methods

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getAddress3() {
		return address3;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public String getCountry() {
		return country;
	}

	public String getZipcode() {
		return zipcode;
	}

	// Setter Methods

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
