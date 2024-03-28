package pm;

public class StringEx4 {

	public static void main(String[] args) {
		// 문자열 객체 생성
		String str1 = "TESt";
		String str2 = "test";

		if(str1.equals(str2)) {
			System.out.printf("%s(str1)과 %s(str2)의 내용이 같다\n\n", str1, str2);
		} else {
			System.out.printf("%s(str1)과 %s(str2)의 내용이 다르다\n\n", str1, str2);
		}

		if(str1.equalsIgnoreCase(str2)) {
			System.out.printf("%s(str1)과 %s(str2)의 내용이 같다\n\n", str1, str2);
		} else {
			System.out.printf("%s(str1)과 %s(str2)의 내용이 다르다\n\n", str1, str2);
		}

	}

}
