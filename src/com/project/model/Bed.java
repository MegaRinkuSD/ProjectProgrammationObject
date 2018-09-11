package com.project.model;

public class Bed extends Product {

	private double sizeLarge;
	private double sizeWide;
	private double sizeHight;
	private double maxWeight;

	public Bed() {
		super();
	}

	public double getSizeLarge() {
		return sizeLarge;
	}

	public void setSizeLarge(double sizeLarge) {
		this.sizeLarge = sizeLarge;
	}

	public double getSizeHight() {
		return sizeHight;
	}

	public void setSizeHight(double sizeHight) {
		this.sizeHight = sizeHight;
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getSizeWide() {
		return sizeWide;
	}

	public void setSizeWide(double sizeWide) {
		this.sizeWide = sizeWide;
	}

}
