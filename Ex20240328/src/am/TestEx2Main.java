package am;

public class TestEx2Main {

	public static void main(String[] args) {
		
		
		//원하는 클래스를 생성한다.
		TestEx2 te2 = new TestEx2();
		//TestEx2 객체를 새롭게 생성하여 그 주소를 ex에 저장한다.
		
		System.out.printf("te2's age: %d, te2's name: %s\n",te2.age,te2.name);
		
		
		te2.setAge(3);
		te2.setName("고양이");
		
		System.out.printf("te2's age: %d, te2's name: %s\n",te2.age,te2.name);
		
		
		
		
//		BfTest mindField = new BfTest();
//		
//		mindField.mineField();

	}

}
