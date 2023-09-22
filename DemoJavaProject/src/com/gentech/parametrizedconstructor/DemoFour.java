package com.gentech.parametrizedconstructor;



class Desktop 
{
	String brand;
	String model;
    int ramSizeGB;
    String isSSDSupported;
    Desktop(String bname,String mname,int ramsize,String SSDsupported)
    {
    	brand=bname;
		model=mname;
		ramSizeGB=ramsize;
		isSSDSupported=SSDsupported;
		System.out.println("Brand:"+brand);
		System.out.println("model no.:"+model);
		System.out.println("ramSize:"+ramSizeGB+" GB");
		System.out.println("Is this SSD supported:"+isSSDSupported);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

}

class Laptop 
{
	String brand;
    String model;
    double screenSizeInches;
    int batteryCapacity;
    Laptop(String bname,String mname, double Screeninche,int bcapacity)
    {
    	brand=bname;
		model=mname;
		screenSizeInches=Screeninche;
		batteryCapacity=bcapacity;
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Screen Size:"+screenSizeInches+" inches");
		System.out.println("Battery capacity:"+batteryCapacity);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");	
    }

}

class Mobile
{
	String brand;
    String model;
    String operatingSystem;
    String isMobileDataEnabled;
    Mobile(String bname,String mname,String OS,String isMobileDataEnabled)
    {
    	brand=bname;
		model=mname;
		operatingSystem=OS;
		isMobileDataEnabled=isMobileDataEnabled;
		System.out.println("Brand:"+brand);
		System.out.println("Model :"+model);
		System.out.println("OS :"+operatingSystem);
		System.out.println("Is the MobileData enabled:"+isMobileDataEnabled);
    }

}

public class DemoFour {

	public static void main(String[] args) {
		Desktop D=new Desktop("HP","S320",128,"yes");
		Laptop L=new Laptop("Lenova","S320",4.5,8000);
		Mobile M=new Mobile("Redmi","MI 7Spro","Android","No");

	}

}
