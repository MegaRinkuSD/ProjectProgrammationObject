package com.project.model;

public class Mattress extends Bed {

	private int inflatableTime;

	public Mattress() {
		super();
	}

	public Mattress(int inflatableTime) {
		super();
		this.inflatableTime = inflatableTime;
	}

	public int getInflatableTime() {
		return inflatableTime;
	}

	public void setInflatableTime(int inflatableTime) {
		this.inflatableTime = inflatableTime;
	}

	@Override
	public String toString() {
		return "Mattress [inflatableTime=" + inflatableTime + ", noRef=" + getNoRef() + ", mark=" + getMark() + ", model=" + getModel() + ", price=" + getPrice() + ", stock=" + getStock() + "]";
	}
}
