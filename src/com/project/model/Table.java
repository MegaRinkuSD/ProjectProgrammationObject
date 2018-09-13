package com.project.model;

public class Table extends Product {

	private double weightMax;
	private double sizeLarge;
	private double sizeWide;
	private double sizeHight;

	public Table() {
		super();
	}

	public Table(double weightMax, double sizeLarge, double sizeWide, double sizeHight) {
		super();
		this.weightMax = weightMax;
		this.sizeLarge = sizeLarge;
		this.sizeWide = sizeWide;
		this.sizeHight = sizeHight;
	}

	public double getWeightMax() {
		return weightMax;
	}

	public void setWeightMax(double weightMax) {
		this.weightMax = weightMax;
	}

	public double getSizeLarge() {
		return sizeLarge;
	}

	public void setSizeLarge(double sizeLarge) {
		this.sizeLarge = sizeLarge;
	}

	public double getSizeWide() {
		return sizeWide;
	}

	public void setSizeWide(double sizeWide) {
		this.sizeWide = sizeWide;
	}

	public double getSizeHight() {
		return sizeHight;
	}

	public void setSizeHight(double sizeHight) {
		this.sizeHight = sizeHight;
	}

	@Override
	public String toString() {
		return "Table [weightMax=" + weightMax + ", sizeLarge=" + sizeLarge + ", sizeWide=" + sizeWide + ", sizeHight="
				+ sizeHight + ", noRef=" + getNoRef() + ", mark=" + getMark() + ", model=" + getModel() + ", price="
				+ getPrice() + ", stock=" + getStock() + "]";
	}
}
