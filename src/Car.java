
public class Car extends Vehicle {

	private boolean goesFast;
	
	public Car(String id, String type, int seats, int wheels, boolean goesFast) {
		super(id, type, seats, wheels);
		this.goesFast = goesFast;
	}
	
	public boolean getGoesFast() {
		return goesFast;
	}
	
	public void setGoesFast(boolean b) {
		this.goesFast = b;
	}
	
}


