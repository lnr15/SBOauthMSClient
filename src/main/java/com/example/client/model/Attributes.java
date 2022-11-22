package com.example.client.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attributes {
	
	@JsonProperty("label")
	Label label;
	
	@JsonProperty("shipFrom")
	ShipFrom shipFromObject;
	
	@JsonProperty("shipTo")
	ShipTo shipToObject;
	
	@JsonProperty("returnTo")
	ReturnTo returnToObject;
	
	@JsonProperty("packageDetail")
	List<PackageDetail> packageDetail;
	
	public Label getLabel() {
		return label;
	}
	public void setLable(Label label) {
		this.label = label;
	}
	public ShipFrom getShipFromObject() {
		return shipFromObject;
	}
	public void setShipFromObject(ShipFrom shipFromObject) {
		this.shipFromObject = shipFromObject;
	}
	public ShipTo getShipToObject() {
		return shipToObject;
	}
	public void setShipToObject(ShipTo shipToObject) {
		this.shipToObject = shipToObject;
	}
	public ReturnTo getReturnToObject() {
		return returnToObject;
	}
	public void setReturnToObject(ReturnTo returnToObject) {
		this.returnToObject = returnToObject;
	}
	public List<PackageDetail> getPackageDetail() {
		return packageDetail;
	}
	public void setPackageDetail(List<PackageDetail> packageDetail) {
		this.packageDetail = packageDetail;
	}

	// Getter Methods

	

	
}
