package com.globallogic.bootcamp.patterns;

public class ElectricalAppliance {

	protected int power = 500;

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	public void turnOn() {
		this.power -=50;
	}
}
