
public class Bus extends Vehicle {

	private boolean goesSlow;
	
	public Bus(String id, String type, int seats, int wheels, boolean goesSlow) {
		super(id, type, seats, wheels);
		this.goesSlow = goesSlow;
	}
	
	public boolean getGoesSlow() {
		return goesSlow;
	}
	
	public void setGoesSlow(boolean b) {
		this.goesSlow = b;
	}
		

}


