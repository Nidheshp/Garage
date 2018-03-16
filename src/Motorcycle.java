
public class Motorcycle extends Vehicle {

	private boolean swerves;
	
	public Motorcycle(String id, String type, int seats, int wheels, boolean swerves) {
		super(id, type, seats, wheels);
		this.swerves = swerves;
	}
	
	public boolean getSwerves() {
		return swerves;
	}
	
	public void setSwerves(boolean b) {
		this.swerves = b;
	}

}


