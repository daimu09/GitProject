import java.util.ArrayList;
import java.util.List;

class Vehicle{
	private String name;
	private Double price;
	
	public Vehicle(String name, Double price) {
		this.name=name;
		this.price=price;
	}
	public 	String getName(){
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price=price;
	}
}
class VehicleImplementation{
	public double sumOfPrices(List<Vehicle> list) {
		return list.stream().mapToDouble(Vehicle::getPrice).sum();
		
	}
	public List<String> getVehicleList(List<Vehicle> list) {
		return list.stream().filter(vehicle -> vehicle.getPrice()>25000).map(Vehicle::getName).toList();
	}
	public Double maxPrice(List<Vehicle> list) {
		return list.stream().mapToDouble(Vehicle::getPrice).max().orElse(0.0);
	}
}
public class vehicleToPurchase {
	public static void main(String[] args) {
		List<Vehicle> list=new ArrayList<>();
		list.add(new Vehicle("AF",67778.0));
		list.add(new Vehicle("ER",67778.0));
		list.add(new Vehicle("YU",67778.0));
		list.add(new Vehicle("UI",67778.0));
		
		VehicleImplementation vi= new VehicleImplementation();
		System.out.println(vi.sumOfPrices(list));
		System.out.println(vi.getVehicleList(list));
		System.out.println(vi.maxPrice(list));
		
	}
}
