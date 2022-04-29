//package Garage;
//
//public class Car extends Vehicle {
//
//	public Car(boolean running, String colour, String make, String model, String type, int ID) {
//		super(running, colour, make, model, type, ID);
//		// TODO Auto-generated constructor stub
//	}
//	
//	int ID= 0;
//	float cost = 0;
//	float hoursWorked = 0;
//	float costOfParts = 0;
//	float costPH = 0;
//	float price = 0;
//
//	@Override
//	public void partsCost(float i) {
//		costOfParts = costOfParts + i;
//	}
//
//	@Override
//	public void TotalWorked(float i) {
//	
//		hoursWorked = hoursWorked + i;
//	}
//
//	@Override
//	public void costPerHour(float i) {
//		costPH = i;
//		
//	};
//	
//	@Override
//	public void cost(float i) {
//		
//		
//		price = costPH * hoursWorked;
//		
//	}
//
//	@Override
//	public void vehicleID(int i) {
//
//		ID = i;
//	};
//	
//	
//}
