package pm;

//import am.TestEx2;

public class StringEx1 {

	public static void main(String[] args) {
		//Start of the program

//		TestEx2 te2 = new TestEx2();

		String str1 = new String("JAVA programming");
		String str2 = "JAVA pr0gr4mm1ng";
		
		// 문자열의 길이
		int strLen = str1.length();
		System.out.printf("\"%s\"의 길이: %d\n", str1, strLen);
		
		char ch0 = str1.charAt(0);  // str1이 기억하는 곳에 있는 문자열에서 0번지 값을 얻어내어 ch0에 저장하는 것
		
		System.out.printf("\"%s\"의 첫 글자: %c\n", str1, ch0);
		
		// String의 기능인 length()와 charAt()을 가지고
		// 특정 문자열에 숫자가 있는지 없는지 판단할 수 있다.
		
		int count = 0; // 숫자가 있을 때마다 count를 증가시킨다.
		for(int i=0; i<strLen; i++) {
			// str1으로부터 문자 1개를 얻어낸다. < charAT() : char 타입을 반환해줌
			char ch = str1.charAt(i);
			
			// ch가 저장한 값이 숫자인지 아닌지 판단			
			if(ch>='0' && ch<= '9') {
				count++;
			}
		}
		System.out.printf("\"%s\"안에 숫자의 수는: %d\n", str1, count);
		
		int count2 = 0; // 숫자가 있을 때마다 count를 증가시킨다.		
		for(int i=0; i<str2.length(); i++) {
			// str1으로부터 문자 1개를 얻어낸다. < charAT() : char 타입을 반환해줌
			char ch = str2.charAt(i);
			
			// ch가 저장한 값이 숫자인지 아닌지 판단			
			if(ch>='0' && ch<= '9') {
				count2++;
			}
		}
		
		System.out.printf("\"%s\"안에 숫자의 수는: %d\n", str2, count2);
		

	}

}
