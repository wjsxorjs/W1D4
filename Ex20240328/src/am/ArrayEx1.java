package am;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		
		// 문자형 배열 4개짜리를 선언하고 생성하자!
		char[] ar = new char[4];
		
		//알파벳 문자를 난수로 발생시켜 저장하자!
				
		for(int i=0; i<ar.length; i++) {
			int rd = (int) (Math.random()*26 + 65); // 난수 생성. 알파벳 갯수 = 26(범위값), 'A'의 코드값 = 65(시작값)
			ar[i] = (char) rd;
		}
		
		//문자형 배열 출력
		for(int i=0; i<ar.length; i++) {
			System.out.printf("ar[%d]: %-2c\n", i, ar[i]);
		}
		

	}

}
