package com.maindemo;
class Desktop 
{
	String brand;
	String model;
    int ramSizeGB;
    String isSSDSupported;

}

class Laptop 
{
	String brand;
    String model;
    double screenSizeInches;
    int batteryCapacity;

}

class Mobile
{
	String brand;
    String model;
    String operatingSystem;
    String isMobileDataEnabled;

}

public class DemoFour {

	public static void main(String[] args) {
	    Desktop D=new Desktop();
		D.brand="HP";
		D.model="S320";
		D.ramSizeGB=128;
		D.isSSDSupported="yes";
		System.out.println("Brand:"+D.brand);
		System.out.println("model no.:"+D.model);
		System.out.println("ramSize:"+D.ramSizeGB+" GB");
		System.out.println("Is this SSD supported:"+D.isSSDSupported);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");	
		Laptop L=new Laptop();
		L.brand="Lenova";
		L.model="S20";
		L.screenSizeInches=14.5;
		L.batteryCapacity=8000;
		System.out.println("Brand:"+L.brand);
		System.out.println("Model:"+L.model);
		System.out.println("Screen Size:"+L.screenSizeInches+" inches");
		System.out.println("Battery capacity:"+L.batteryCapacity);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");	
		Mobile M=new Mobile();
		M.brand="Redmi";
		M.model="MI 7pro";
		M.operatingSystem="Android";
		M.isMobileDataEnabled="No";
		System.out.println("Brand:"+M.brand);
		System.out.println("Model :"+M.model);
		System.out.println("OS :"+M.operatingSystem);
		System.out.println("Is the MobileData enabled:"+M.isMobileDataEnabled);



	}

}
