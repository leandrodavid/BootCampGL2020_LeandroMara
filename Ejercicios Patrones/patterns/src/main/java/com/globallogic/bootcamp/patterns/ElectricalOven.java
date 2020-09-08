package com.globallogic.bootcamp.patterns;

public class ElectricalOven extends ElectricalAppliance {

	private LedAppliance ledAppliance;
		
	public ElectricalOven(LedAppliance ledAppliance) {
		
		this.ledAppliance = ledAppliance;
	}

	@Override
	public void turnOn() {
		this.power -=75;
	}
	
	public void turnLed() {
		this.ledAppliance.setPower(this.getPower());
		this.ledAppliance.turnOn();
		this.setPower(this.ledAppliance.getPower());
	}

	public LedAppliance getLedAppliance() {
		return ledAppliance;
	}

	public void setLedAppliance(LedAppliance ledAppliance) {
		this.ledAppliance = ledAppliance;
	}
}
