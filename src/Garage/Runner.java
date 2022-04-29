package Garage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Runner {
	
	static List<Integer> IDs = new ArrayList<Integer>();
	static List<Vehicle> garage = new ArrayList<Vehicle>();
	
	public static void main(String[] args) {
		
		int num = 4;
		
		numOfVehiclesToAdd(num);
		
		readTheVehiclesWeHave();		
	}
	
	
	
	public static void numOfVehiclesToAdd(int num){
		
	for (int i = 0 ; i<num; i++) {
				
				IDs.add(i);
				
				// change these to user input variable to make different vehicles
	
				String typeOfVehicle = "Motorbike" + i;
				boolean running = true;
				String colour = "colour" + i;
				String make = "make" + i;
				String model = "model" + i;
				int ID = i;
				float cost = i;
				float hoursWorked = i;
				float costOfParts = i;
				float costPH = i;
				float price = i;
				
				System.out.println(typeOfVehicle);
				
				// populating for testing
				switch(i) {
				
				case 1:
					Motorbike Moto1 = new Motorbike(typeOfVehicle, running, make, model, cost, hoursWorked, costOfParts, costPH, price);
					garage.add(Moto1);
					
					break;
				case 2:
					Motorbike Moto2 = new Motorbike(typeOfVehicle, running, make, model, cost, hoursWorked, costOfParts, costPH, price);
					garage.add(Moto2);
					
					break;
				case 3:
					Motorbike Moto3 = new Motorbike(typeOfVehicle, running, make, model, cost, hoursWorked, costOfParts, costPH, price);
					garage.add(Moto3);
					
					break;
				case 4:
					Motorbike Moto4 = new Motorbike(typeOfVehicle, running, make, model, cost, hoursWorked, costOfParts, costPH, price);	
					garage.add(Moto4);
					
					break;
				}	
			}

		
		
	};

	public static void readTheVehiclesWeHave() {
		 
		System.out.println(IDs);
		System.out.println(garage);
		for(Vehicle vehicle : garage) {
			System.out.println(vehicle);

			
		}
		
	}
	
	
}



