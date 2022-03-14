
public class createClassObject {
	
	public static void main(String[] args) {
		
		car mercedes = new car();
		
		mercedes.passengers = 4;
		mercedes.speed = 340;
		mercedes.fuelCapacity = 56.78;
		mercedes.doors = 4;
		mercedes.color = "blue";
		
		System.out.println("Mercedes passenger :" + mercedes.passengers);
		System.out.println("Mercedes Color :" + mercedes.color);
		
		mercedes.run();
	}

}

class car {
	int passengers;
	int speed;
	double fuelCapacity;
	int doors;
	String color;
	
	void run() {
		
		System.out.println("hello there, welcome to run method!");
	}
}