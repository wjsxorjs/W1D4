package am;

public class TestEx2 { // 클래스명은 이용자를 위해서라도 의미부여가 필요하다.

	// 속성 (변수/상수)
	private int age; // 나이를 저장하는 변수 	 	| 초기값: 0
	private String name; // 이름을 저장하는 변수 	| 초기값: null < 멤버변수 (선언된 영역[클래스]에서 모두 사용가능하다)
	
	// 동작 (함수 또는 메서드)
	
	
	public void setName(String newName/*인자(매개변수)*/) {		// 접근제한자: public(누구나 접근가능) +
																// 반환형: void(반환하지않음) +
																// 함수명: setName(name을 set해준다는 의미)
		// 이름을 저장하는 동작
		// 이름을 newName이라는 변수로 받아서
		// 		  name이라는 멤버변수에 저장하는 동작
		name = newName;
	}  
	
	// 나이를 저장하는 동작
	// 나이를 newAge라는 변수로 받아서
	//		  age라는 멤버변수에 저장하는 동작
	public void setAge(int newAge /*인자는 지역변수로 해당 영역에서만 사용할 수 있다.*/) {
		age = newAge;
	} // 멤버함수(멤버메소드)
		
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	
		
	
	public static void main(String[] args) {

		TestEx2 te2_1 = new TestEx2();
		te2_1.setAge(27);
		te2_1.setName("JMG");
		System.out.println(te2_1.age + " " + te2_1.name); //같은 클래스이기에 private 접근제한자를 가진 변수 사용가능


		TestEx2 te2_2 = new TestEx2();
		te2_2.setAge(20);
		te2_2.setName("J_Est");
		System.out.println(te2_2.age + " " + te2_2.name);
		
		
	}
}

