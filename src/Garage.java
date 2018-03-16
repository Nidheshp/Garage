import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();	
	
	public Garage() {
		
	}
	
	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void addVehicle(Vehicle v) {
		vehicleList.add(v);
	}
	
	public void removeVehicle(Vehicle v) {
		vehicleList.remove(v);
	}
	
	public void removeVehicle(String s) {
		
	}
	
	public void emptyGarage() {
		while(vehicleList.size() != 0) {
			vehicleList.remove(0);
		}
	}
	public void showVehicles() {
		System.out.print("Current Vehicles in Garage:");
		for(Vehicle v : vehicleList) {
			System.out.print(" " + v.getId());
		}
		System.out.println();
	}
	public void billVehicle() {
		for(Vehicle v : vehicleList) {
			if(v instanceof Car) {
				int price = v.getSeats()*8 + v.getWheels()*70;
				if(((Car)v).getGoesFast()) {
					price+=400;
				}
				System.out.println("The Car: " + v.getId() + " will take £" + price + " to repair");
			}
			if(v instanceof Bus) {
				int price = v.getSeats()*10 + v.getWheels()*90;
				if(((Bus)v).getGoesSlow()) {
					price-=250;
				}
				System.out.println("The Bus: " + v.getId() + " will take £" + price + " to repair");
			}
			if(v instanceof Motorcycle) {
				int price = v.getSeats()*5 + v.getWheels()*60;
				if(((Motorcycle)v).getSwerves()) {
					price+=1000;
				}
				System.out.println("The Motorcycle: " + v.getId() + " will take £" + price + " to repair");
			}
		}
	}
}
