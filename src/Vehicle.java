
public abstract class Vehicle  {

	private String id;
	private String type;
	private int seats;
	private int wheels;
	
	public Vehicle(String id, String type, int seats, int wheels) {
		
		this.id = id;
		this.type = type;
		this.seats = seats;
		this.wheels = wheels;
	}
		
	public String getId() {
		return this.id;
	}
	
	public void setId(String s) {
		this.id = s;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String s) {
		this.type = s;
	}
	
	public int getSeats() {
		return this.seats;
	}
	
	public void setSeats(int i) {
		this.seats = i;
	}
	public int getWheels() {
		return this.wheels;
	}
	
	public void setWheels(int i) {
		this.wheels = i;
	}
	
}
