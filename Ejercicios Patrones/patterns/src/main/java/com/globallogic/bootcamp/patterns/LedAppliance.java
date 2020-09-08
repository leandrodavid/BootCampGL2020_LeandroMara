package com.globallogic.bootcamp.patterns;

public class LedAppliance {
   int power;
	
   public void turnOn() {
		 power -=100;
	}

public int getPower() {
	return power;
}

public void setPower(int power) {
	this.power = power;
}
}