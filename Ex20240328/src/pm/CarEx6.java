package pm;

public class CarEx6 {
	// 자동차를 의미하는 클래스

	// 필요한 값들을 멤버변수로 선언하자
	
	int speed;
	String color = "Black";

	public void speedUp() {
		if(speed<150) {
			speed += 10;
		} else {
			System.out.println("!!과속금지!!");
		}
	}

	public void speedDown() {
		if (speed>0) {
			--speed;
		} else {
			System.out.println("이미 정지한 차량입니다.");
		}
	}
	
	public void stop() {
		if (speed>0) {
			if(speed > 60) {
				System.out.println("일단 멈추기는 했습니다만,\n급정거는 위험합니다.");
			}
			speed = 0 ;
		} else {
			System.out.println("이미 정지한 차량입니다.");
		}
	}
	
	public void respray(String newColor) {
		if(newColor.equalsIgnoreCase(color)) {
			System.out.printf("이미 해당 차량은 %s색입니다.\n");
		} else {
			color = newColor;
			System.out.printf("%s색으로 차량 색을 변경했습니다.\n");
		}
		
	}

}
