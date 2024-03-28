package pm;

public class StringBufferEx5 {

	public static void main(String[] args) {
		// 문자열 편집이 가능한 StringBuffer객체 생성

		StringBuffer strBf1 = new StringBuffer("JAVA");
		StringBuffer strBf2 = strBf1;
		
		
		if(strBf1 == strBf2) {
			System.out.printf("\"%s\"(strBf1)과 \"%s\"(strBf2)의 주소가 서로 같다.\n",strBf1,strBf2);
		} else {
			System.out.printf("\"%s\"(strBf1)과 \"%s\"(strBf2)의 주소가 서로 다르다.\n",strBf1,strBf2);
		}

		// 문자열 뒤에 덧붙이기: append
		strBf1.append(" Programming");
		System.out.printf("strBf2 after [strBf1.append(\" Programming\")]: %s\n\n", strBf2);

		//문자열 잘라내기: delete
		strBf2.delete(0,3);
		System.out.printf("strBf1 after [strBf2.delete(0,3)]: %s\n\n", strBf1);

		//문자열 특정 위치에 넣기: insert()
		strBf1.insert(2,"-");
		System.out.printf("strBf2 after [strBf1.insert(2,\"-\")]: %s\n\n", strBf2);
		
		
		
		
		

	}

}