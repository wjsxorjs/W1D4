package pm;

public class StringEx3 {
	
	public static void main(int args) {
		// overloading
		// 중복정의
		/* 
		   한 클래스에서 이름이 같고 인자를 다르게해서
		   다른 기능을 하게 하는 것을 오버로딩(overloading?)이라고 한다.
		*/
	}

	public static void main(String[] args) {
		// 문자열 객체 생성
		
		String str1 = "Test Java Example";
		
		// 문자 또는 문자열 수정: replaceAll()
		String str2 = str1.replaceAll("a", "*");
		System.out.printf("\"%s\" ===[\'a\' to \'*\']===> \"%s\"\n\n", str1, str2);
		
		// 문자열 추출: substring()
		String str3 = str1.substring(5);
		System.out.printf("\"%s\"의 5번지부터 끝까지의 substring: %s\n\n", str1, str3);
		
		String str4 = str1.substring(5, 8);
		System.out.printf("\"%s\"의 5번지부터 8번지 앞까지의 substring: %s\n\n", str1, str4);
		
		// 문자열에서 특정 문자를 찾아서 인덱스 값을 알아내기: indexOf()
		int idx = str1.indexOf("J");
//		int idx = str1.indexOf("Java");
		
		String str5 = str1.substring(5);
		System.out.printf("\"%s\"의 %d번지부터 끝까지의 substring: %s\n\n", str1, idx, str5);
		
		
		
		
	}

}
