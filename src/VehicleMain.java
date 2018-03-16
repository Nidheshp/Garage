import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		//int wheels, String id, String type, int seats
		Car car1 = new Car("Sports Car", "Ferrari", 2, 4, true);
		Car car2 = new Car("Saloon Car", "Ford", 5, 4, false);
		Bus bus1 = new Bus("Small Bus", "Unilink", 22, 6, true);
		Bus bus2 = new Bus("Large Bus", "Megabus", 16, 8, false);
		Motorcycle motorcycle1 = new Motorcycle("Fast Bike", "Yamaha", 1, 2, false);
		Motorcycle motorcycle2 = new Motorcycle("Slow Bike", "Mitsubishi", 2, 2, true);
		
		Garage garage = new Garage();
		garage.addVehicle(car1);
		garage.addVehicle(bus1);
		garage.addVehicle(motorcycle1);
		garage.addVehicle(car2);
		garage.addVehicle(bus2);
		garage.addVehicle(motorcycle2);
		
		garage.showVehicles();
		garage.billVehicle();
		
		Scanner s = new Scanner(System.in);
		String responce = s.nextLine();
		System.out.println(responce);
		s.close();
	}

}
