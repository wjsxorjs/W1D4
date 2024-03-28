package am;

public class TestEx2Main {

	public static void main(String[] args) {
		
		
		//원하는 클래스를 생성한다.
		TestEx2 te2 = new TestEx2();
		//TestEx2 객체를 새롭게 생성하여 그 주소를 ex에 저장한다.
		
		System.out.printf("te2's age: %d, te2's name: %s\n",te2.getAge(),te2.getName());
															// 다른 클래스이기에 private 접근제한자를 가진 변수 사용불가
															// te2.age, te2.name 사용불가
		
		
		te2.setAge(3);
		te2.setName("고양이");
		
		System.out.printf("te2's age: %d, te2's name: %s\n",te2.getAge(),te2.getName());
		
		
		
		
//		BfTest mindField = new BfTest();
//		
//		mindField.mineField();

	}

}
