package Garage;


public class Motorbike extends Vehicle {
	
	


	

	public Motorbike(String typeOfVehicle, boolean running, String make, String model, float cost, float hoursWorked,
			float costOfParts, float costPH, float price) {
		super(typeOfVehicle, running, make, model, cost, hoursWorked, costOfParts, costPH, price);
		// TODO Auto-generated constructor stub

		this.cost = cost;
		this.hoursWorked = hoursWorked;
		this.costOfParts = costOfParts;
		this.costPH = costPH;
		this.price = price;
		this.running = running;
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.type = type;
		this.ID = ID;
		
	}

	public String toString() {
		String Motorbike = ID+""+cost+""+hoursWorked+""+costOfParts+""+costPH+""+price
				+""+running+""+colour+""+make+""+model+""+""+type+""+ID;	
		return Motorbike;
	}
	
	


	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return super.isRunning();
	}

	@Override
	public String getMake() {
		// TODO Auto-generated method stub
		return super.getMake();
	}

	@Override
	public void setMake(String make) {
		// TODO Auto-generated method stub
		super.setMake(make);
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return super.getModel();
	}

	@Override
	public void setModel(String model) {
		// TODO Auto-generated method stub
		super.setModel(model);
	}

	@Override
	public String getTypeOfVehicle() {
		// TODO Auto-generated method stub
		return super.getTypeOfVehicle();
	}

	@Override
	public void setTypeOfVehicle(String typeOfVehicle) {
		// TODO Auto-generated method stub
		super.setTypeOfVehicle(typeOfVehicle);
	}

	@Override
	public void TotalWorked(float i) {
	
		hoursWorked = hoursWorked + i;
	}

	@Override
	public void costPerHour(float i) {
		costPH = i;
		
	}
	
	@Override
	public void cost(float i) {
		
		
		price = costPH * hoursWorked;
		
	}

	@Override
	public void vehicleID(int i) {

		ID = i;
	}
	
	
	@Override
	public void partsCost(float i) {
		
		costOfParts = costOfParts + i;
	}
	
	
}

