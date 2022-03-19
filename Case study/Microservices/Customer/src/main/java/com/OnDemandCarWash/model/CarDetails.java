package com.OnDemandCarWash.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="CarDetails")
public class CarDetails {
	@Id
	private int id;
	@Field
	private String customerName;
	@Field
	private long phoneNo;
	@Field
	private String address;
	@Field
	private String carBrand;
	@Field
	private String CarModel;
	@Field
	private String CarType;
	public CarDetails(int id, String customerName, long phoneNo, String address, String carBrand, String carModel,
			String carType) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.carBrand = carBrand;
		CarModel = carModel;
		CarType = carType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarModel() {
		return CarModel;
	}
	public void setCarModel(String carModel) {
		CarModel = carModel;
	}
	public String getCarType() {
		return CarType;
	}
	public void setCarType(String carType) {
		CarType = carType;
	}
	
	
	

}
