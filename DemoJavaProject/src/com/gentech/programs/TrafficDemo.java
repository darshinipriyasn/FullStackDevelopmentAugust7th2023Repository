package com.gentech.programs;

public class TrafficDemo {

	public static void main(String[] args) {
		String s=args[0];
		switch(s)
		{
		case "red":case "RED":case "Red":
			System.out.println("Stop");
			break;
		case "Yellow": case "yellow": case "YELLOW":
			System.out.println("Get Ready");
			break;
		case "green": case "Green": case "GREEN":
			System.out.println("Go");
			break;
		default:
			System.out.println("invalid entry");
			
			
		}

	}

}
