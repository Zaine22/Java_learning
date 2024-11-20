package _Interface;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Motorbike motorbike = new Motorbike();
		
		test(car);
		test(motorbike);
	}
	
	public static void test(Car car) {
		car.start();
		car.stop();
	}
	public static void test(Motorbike motorbike) {
		motorbike.start();
		motorbike.stop();
	}


}
