package com.example.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PackageLineItems {

	@JsonProperty("itemSequence")
	private Integer itemSequence;
	
	@JsonProperty("itemCode")
	private String itemCode;
	
	@JsonProperty("quantity")
	private Integer quantity;
	
	@JsonProperty("uom")
	private String uom;
	
	@JsonProperty("itemDescription")
	private String itemDescription;
	
	@JsonProperty("color")
	private String color;
	
	@JsonProperty("size")
	private String size;
	
	@JsonProperty("currency")
	private String currency;
	
	@JsonProperty("unitPrice")
	private Integer unitPrice;
	
	@JsonProperty("retailPrice")
	private Integer retailPrice;
	
	@JsonProperty("listPrice")
	private Integer listPrice;

	public Integer getItemSequence() {
		return itemSequence;
	}

	public void setItemSequence(Integer itemSequence) {
		this.itemSequence = itemSequence;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Integer retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Integer getListPrice() {
		return listPrice;
	}

	public void setListPrice(Integer listPrice) {
		this.listPrice = listPrice;
	}

	
}
