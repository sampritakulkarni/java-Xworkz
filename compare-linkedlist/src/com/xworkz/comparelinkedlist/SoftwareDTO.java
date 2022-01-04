package com.xworkz.comparelinkedlist;

import java.util.Comparator;

public class SoftwareDTO {
	
	private int softwareId;
	private String name;
	private double price;
	private double version;
	private boolean autoSaveSupported;
	private boolean internetApp;
	
	public SoftwareDTO() {
		super();
	}
	
	public SoftwareDTO(int softwareId,String name,double price,double version,boolean autoSaveSupported,boolean internetApp) {
		super();
		this.softwareId=softwareId;
		this.name=name;
		this.price=price;
		this.version=version;
		this.autoSaveSupported=autoSaveSupported;
		this.internetApp=internetApp;
	}

	public int getSoftwareId() {
		return softwareId;
	}

	public void setSoftwareId(int softwareId) {
		this.softwareId = softwareId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isAutoSaveSupported() {
		return autoSaveSupported;
	}

	public void setAutoSaveSupported(boolean autoSaveSupported) {
		this.autoSaveSupported = autoSaveSupported;
	}

	public boolean isInternetApp() {
		return internetApp;
	}

	public void setInternetApp(boolean internetApp) {
		this.internetApp = internetApp;
	}

	@Override
	public String toString() {
		return "SoftwareDTO [softwareId=" + softwareId + ", name=" + name + ", price=" + price + ", version=" + version
				+ ", autoSaveSupported=" + autoSaveSupported + ", internetApp=" + internetApp + "]";
	}
	
	

}
