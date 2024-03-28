package pm;

public class CarEx6Main {

	public static void main(String[] args) {

		CarEx6 car1 = new CarEx6();
		
		System.out.println(car1.speed);
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		System.out.println(car1.speed); //50
		
		car1.stop();
		System.out.println(car1.speed); //0
		
		

	}

}
