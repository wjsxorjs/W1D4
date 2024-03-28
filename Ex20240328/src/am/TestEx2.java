package am;

public class TestEx2 { // 클래스명은 이용자를 위해서라도 의미부여가 필요하다.

	// 속성 (변수/상수)
	int age; // 나이를 저장하는 변수 	 	| 초기값: 0
	String name; // 이름을 저장하는 변수 	| 초기값: null < 멤버(?)변수
	
	// 동작 (함수 또는 메서드)
	public void setName(String newName/*인자(매개변수)*/) {		// 접근제한자: public(누구나 접근가능) +
																// 반환형: void(반환하지않음) +
																// 함수명: setName(name을 set해준다는 의미)
		// 이름을 저장하는 동작
		// 이름을 newName이라는 변수로 받아서
		// 		  name이라는 멤버변수에 저장하는 동작
		name = newName;
	}  
		
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		TestEx2 te2 = new TestEx2();
		
		te2.age=15;
		te2.setName("JDI");
		System.out.println(te2.age + " " + te2.name);
	}
}

