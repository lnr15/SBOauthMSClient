package com.example.client.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PackageDetail {
	
	@JsonProperty("packageLineItems")
	private List<PackageLineItems> packageLineItems;

	public List<PackageLineItems> getPackageLineItems() {
		return packageLineItems;
	}

	public void setPackageLineItems(List<PackageLineItems> packageLineItems) {
		this.packageLineItems = packageLineItems;
	}
}
