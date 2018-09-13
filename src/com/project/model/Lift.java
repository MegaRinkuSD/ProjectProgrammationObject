package com.project.model;

public class Lift extends Product {

	private double raisingCap;
	private double spinCap;

	public Lift() {
		super();
	}

	public Lift(double raisingCap, double spinCap) {
		super();
		this.raisingCap = raisingCap;
		this.spinCap = spinCap;
	}

	public double getRaisingCap() {
		return raisingCap;
	}

	public void setRaisingCap(double raisingCap) {
		this.raisingCap = raisingCap;
	}

	public double getSpinCap() {
		return spinCap;
	}

	public void setSpinCap(double spinCap) {
		this.spinCap = spinCap;
	}

	@Override
	public String toString() {
		return "Lift [raisingCap=" + raisingCap + ", spinCap=" + spinCap + ", noRef=" + getNoRef() + ", mark="
				+ getMark() + ", model=" + getModel() + ", price=" + getPrice() + ", stock=" + getStock() + "]";
	}

	@Override
	public String toFile() {
		return raisingCap + ";" + spinCap + ";" + getNoRef() + ";" + getMark() + ";" + getModel() + ";" + getPrice()
				+ ";" + getStock() + ";";
	}
}
