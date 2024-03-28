package pm;

public class StringEx2 {

	public static void main(String[] args) {
		
		String str1 = "Test";
		String str2 = "123";
		
		String str3 = str1.concat(str2); // str1에 str2에 덧붙힌 값을 반환해주어 str3에 저장한다.
										 // 해당 c
		
		System.out.printf("\"%s\"(str1) + \"%s\"(str2): \"%s\"(str3)\n\n", str1, str2, str3);
		
		String str4 = new String("Test");
		
		String str5 = "Test123";
		
		String str6 = str1+str2;
		
		String str7 = "Test"+"123";
		
		if(str1 == str4) {
			System.out.printf("\"%s\"(str1)과 \"%s\"(str4)의 주소가 서로 같다.\n",str1,str4);
		} else {
			System.out.printf("\"%s\"(str1)과 \"%s\"(str4)의 주소가 서로 다르다.\n",str1,str4);
		}
		
		if(str1.equals(str4)){
			System.out.printf("\"%s\"(str1)과 \"%s\"(str4)의 내용이 서로 같다.\n\n",str1,str4);
		} else {
			System.out.printf("\"%s\"(str1)과 \"%s\"(str4)의 내용이 서로 다르다.\n\n",str1,str4);
		}
		
		if(str3 == str5) {
			System.out.printf("\"%s\"(str6)과 \"%s\"(str5)의 주소가 서로 같다.\n",str3,str5);
		} else {
			System.out.printf("\"%s\"(str6)과 \"%s\"(str5)의 주소가 서로 다르다.\n",str3,str5);
		}
		
		if(str3.equals(str5)){
			System.out.printf("\"%s\"(str6)과 \"%s\"(str5)의 내용이 서로 같다.\n\n",str3,str5);
		} else {
			System.out.printf("\"%s\"(str6)과 \"%s\"(str5)의 내용이 서로 다르다.\n\n",str3,str5);
		}
		
		if(str6 == str5) {
			System.out.printf("\"%s\"(str6)과 \"%s\"(str5)의 주소가 서로 같다.\n",str6,str5);
		} else {
			System.out.printf("\"%s\"(str6)과 \"%s\"(str5)의 주소가 서로 다르다.\n",str6,str5);
		}
		
		if(str6.equals(str5)){
			System.out.printf("\"%s\"(str6)과 \"%s\"(str5)의 내용이 서로 같다.\n\n",str6,str5);
		} else {
			System.out.printf("\"%s\"(str6)과 \"%s\"(str5)의 내용이 서로 다르다.\n\n",str6,str5);
		}
		
		if(str7 == str5) {
			System.out.printf("\"%s\"(str7)과 \"%s\"(str5)의 주소가 서로 같다.\n",str7,str5);
		} else {
			System.out.printf("\"%s\"(str7)과 \"%s\"(str5)의 주소가 서로 다르다.\n",str7,str5);
		}
		
		if(str7.equals(str5)){
			System.out.printf("\"%s\"(str7)과 \"%s\"(str5)의 내용이 서로 같다.\n\n",str7,str5);
		} else {
			System.out.printf("\"%s\"(str7)과 \"%s\"(str5)의 내용이 서로 다르다.\n\n",str7,str5);
		}

	}

}
