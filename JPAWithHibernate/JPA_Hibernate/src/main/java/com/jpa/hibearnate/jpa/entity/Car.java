package com.jpa.hibearnate.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	private int carInt;
	private String carName;
	private String carBrand;
	private int carPrice;

	public int getCarInt() {
		return carInt;
	}

	public void setCarInt(int carInt) {
		this.carInt = carInt;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return "Car [carInt=" + carInt + ", carName=" + carName + ", carBrand=" + carBrand + ", carPrice=" + carPrice
				+ "]";
	}

}
