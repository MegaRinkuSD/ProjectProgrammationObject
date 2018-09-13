package com.project.model;

public class Wheelchair extends Product {

	private double widthChair;
	private double weight;

	public Wheelchair() {
		super();
	}

	public Wheelchair(double widthChair, double weight) {
		super();
		this.widthChair = widthChair;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWidthChair() {
		return widthChair;
	}

	public void setWidthChair(double widthChair) {
		this.widthChair = widthChair;
	}

	@Override
	public String toString() {
		return "Wheelchair [widthChair=" + widthChair + ", weight=" + weight + ", noRef=" + getNoRef() + ", mark="
				+ getMark() + ", model=" + getModel() + ", price=" + getPrice() + ", stock=" + getStock() + "]";
	}

	@Override
	public String toFile() {
		return widthChair + ";" + weight + ";" + getNoRef() + ";" + getMark() + ";" + getModel() + ";" + getPrice()
				+ ";" + getStock() + ";";
	}
}
