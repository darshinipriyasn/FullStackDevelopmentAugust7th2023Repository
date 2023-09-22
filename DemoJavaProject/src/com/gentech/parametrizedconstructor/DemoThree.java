package com.gentech.parametrizedconstructor;
class TwoWheelers 
{
	String type;
    int engineCapacity;
    String hasStorage;
    String fuelType;
    TwoWheelers(String type,int enginecapacity,String storage,String fueltype)
    {
    	type=type;
		engineCapacity=enginecapacity;
		hasStorage=storage;
		fuelType=fueltype;
		System.out.println("Two wheeler type:"+type);
		System.out.println("Engine capacity:"+engineCapacity);
		System.out.println("Does it have storage space:"+hasStorage);
		System.out.println("Fuel type:"+fuelType);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}

class FourWheeler 
{
	String type;
    int seatingCapacity;
    String isSUV;
    String fuelType;
    FourWheeler(String type,int seatcapacity,String issuv,String fueltype)
    {
    	type=type;
		seatingCapacity=seatcapacity;
		isSUV=issuv;
		fuelType=fueltype;
		System.out.println("Four wheeler type:"+type);
		System.out.println("Seating capacity:"+seatingCapacity);
		System.out.println("Is this an SUV:"+isSUV);
		System.out.println("Fuel type:"+fuelType);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }
}

class HeavyVehicle 
{
	String type;
    double maxPayload;
    String fuelType;
    int numAxles;
    HeavyVehicle(String type,double payload,String fuel,int numAxles )
    {
    	type=type;
		maxPayload=payload;
		fuelType=fuel;
		numAxles=numAxles;
		System.out.println("Heavy vehicle type:"+type);
		System.out.println("Maximum Payload: "+maxPayload+"tons");
		System.out.println("Fuel type:"+fuelType);
		System.out.println("Number of axels:"+numAxles);

    }
}

public class DemoThree {

	public static void main(String[] args) {
		TwoWheelers tw = new TwoWheelers("bike",250,"yes","petrol");
		FourWheeler fw = new FourWheeler("SUV",6,"yes","diesel");
		HeavyVehicle hv=new HeavyVehicle("truck",4.6,"diesel",2);

	}

}
