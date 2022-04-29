package Garage;

public abstract class Vehicle implements Parts, Labour, ID {

	protected String typeOfVehicle;
	protected boolean running;
	protected static String colour;
	protected String make;
	protected String model;
	protected static String type;
	protected static int ID;
	protected float cost;
	protected float hoursWorked;
	protected float costOfParts;
	protected float costPH;
	protected float price;
	
	
	// CONSTRUCTORS
	
	public Vehicle(String typeOfVehicle, boolean running, String make, String model, float cost, float hoursWorked,
			float costOfParts, float costPH, float price) {
		super();
		this.typeOfVehicle = typeOfVehicle;
		this.running = running;
		this.make = make;
		this.model = model;
		this.cost = cost;
		this.hoursWorked = hoursWorked;
		this.costOfParts = costOfParts;
		this.costPH = costPH;
		this.price = price;
	}



	// GETTERS AND SETTERS
	public boolean isRunning() {
		return running;
	}


	

	public void setRunning(boolean running) {
		this.running = running;
	}


	public static String getColour() {
		return colour;
	}


	public static void setColour(String colour) {
		Vehicle.colour = colour;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public static String getType() {
		return type;
	}


	public static void setType(String type) {
		Vehicle.type = type;
	}


	public static int getID() {
		return ID;
	}


	public static void setID(int iD) {
		ID = iD;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}


	public float getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	public float getCostOfParts() {
		return costOfParts;
	}


	public void setCostOfParts(float costOfParts) {
		this.costOfParts = costOfParts;
	}


	public float getCostPH() {
		return costPH;
	}


	public void setCostPH(float costPH) {
		this.costPH = costPH;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}



	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}



	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}




	


	
	
	
	
	
	
	
	
	
	
}
