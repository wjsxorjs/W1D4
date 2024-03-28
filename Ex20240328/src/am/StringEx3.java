package am;

public class StringEx3 {

	public static void main(String[] args) {
		/*
		 String (문자열 객체)
		  특징 2가지 :
		    1) 불변적 특징 : String 객체 내에 있는 값은 변경시킬 수 없다.
		    				 변경시키는 것처럼 보이지만 새로운 객체를 만들고 해당 주소값을 변수에 저장시켜주는 것
		    				 그렇기에 주소값을 비교하면 값이 수정된 것이아닌 새로운 객체가 만들어졌다는 것을 알 수 있다.
		    2) 객체 생성법 2가지 제공
		      - 암시적 (String str = "String";)
		      		언제나 새로운 객체를 생성하는 것은 아니며
		      		기존에 존재하는 객체를 사용한다.
		      - 명시적 (String str = new String();)
		      		무조건 새로운 객체를 생성한다.
		      		그 이유는 new로 인해서 새로운 객체를 만드는 것을 명시해주었기 때문이다.
		 
		 
		 
		 */
		
		String str1 = "SIST";  			  // (암시적 생성)
		String str2 = "SIST!"; 			  // (암시적 생성) str1과 주소값이 다름
		String str3 = "SIST";  			  // (암시적 생성) str1과 주소값이 같음
		String str4 = new String("SIST"); // (명시적 생성) str1과 주소값이 다름
		String str5 = "SIST"; 			  // (암시적 생성) str1과 주소값이 같음 : str4와 다름
		

		// 피연산자들이 객체일 때 ==로 비교하면 주소값 비교!
		if(str1 == str3) {
			System.out.println("str1과 str3는(주소를 비교해봤는데) 서로 같다.");
		} else {
			System.out.println("str1과 str3는(주소를 비교해봤는데) 서로 다르다");
		}
		
		if(str1 == str4) {
			System.out.println("str1과 str4는(주소를 비교해봤는데) 서로 같다.");
		} else {
			System.out.println("str1과 str4는(주소를 비교해봤는데) 서로 다르다");
		}
		
		if(str3 == str4) {
			System.out.println("str3과 str4는(주소를 비교해봤는데) 서로 같다.");
		} else {
			System.out.println("str3과 str4는(주소를 비교해봤는데) 서로 다르다");
		}
		
		
		

	}

}
