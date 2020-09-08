package com.globallogic.bootcamp.patterns;


public class App 
{
    public static void main( String[] args )
    {
    	
        ElectricalOven consumo = new ElectricalOven(new LedAppliance());
        System.out.println(consumo.getPower());
        consumo.turnOn();
        System.out.println(consumo.getPower());
        consumo.turnLed();
        System.out.println(consumo.getPower());
    }
}
