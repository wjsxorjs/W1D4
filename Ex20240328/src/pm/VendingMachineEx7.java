package pm;

import java.util.Scanner;

public class VendingMachineEx7 {
	
	/*
	 음료수 자판기
	 
	   [멤버변수]
	    음료수 (4 종류)
	    가격 
	    받은 돈
	    거스름돈
	    
	   [멤버메소드]
	   음료수 목록
	   
	   
	   레츠비 - 500원 | 사이다 - 700원 | 콜라 - 700원 | 웰치스 - 1000원
	   
	   초기함수 호출시 음료 4가지 셋팅 > 화면에 "금액: " Scanner.nextInt > 금액 입력 시 해당 금액으로 구매 가능한 음료를 보여준다.
	   										500원일시 레츠비만 나와야함 	1. 레츠비  2.사이다   3.콜라   4.웰치스 Scanner.nextInt
	    
	 */
	/*String[] bvrgNm		= {"레츠비", "사이다", "콜라", "웰치스"};*/
	
	
//	BeverageListEx7 bvg1 = new BeverageListEx7();
//	BeverageListEx7 bvg2 = new BeverageListEx7();
//	BeverageListEx7 bvg3 = new BeverageListEx7();
//	BeverageListEx7 bvg4 = new BeverageListEx7();

	StringBuffer bvrgAvail;
	BeverageListEx7[] bvgLst = new BeverageListEx7[4];

	public void stockBvgs(String bvgNm, int bvgPrc, int lstIdx) {
		BeverageListEx7 bvg1 = new BeverageListEx7();
		bvg1.setName(bvgNm);
		bvg1.setPrice(bvgPrc);
		bvgLst[lstIdx] = bvg1;
	}
	
	public void setVending(){
		bvrgAvail = new StringBuffer("");
		
		stockBvgs("레츠비", 500, 0);
		stockBvgs("사이다", 700, 1);
		stockBvgs("콜라", 700, 2);
		stockBvgs("웰치스", 1000, 3);
		
//		bvg1.name = "레츠비";
//		bvg1.price = 500;
//		bvgLst[0] = bvg1;	
//		
//		bvg2.name = "사이다";
//		bvg2.price = 700;
//		bvgLst[1] = bvg2;
//		
//		bvg3.name = "콜라";
//		bvg3.price = 700;
//		bvgLst[2] = bvg3;
//		
//		bvg4.name = "웰치스";
//		bvg4.price = 1000;
//		bvgLst[3] = bvg4;
		
		Scanner scanR = new Scanner(System.in);
		System.out.print("금액: ");
		int inputFnd = scanR.nextInt();
		int maxChs = 0;
		if(inputFnd<400) {
			System.out.println("...안녕히 가세요!");
		} else {
			for(int i=0; i<4; i++) {
				if(bvgLst[i].price <= inputFnd) {
					bvrgAvail.append((i+1)+". "+bvgLst[i].name+" ");
					maxChs++;
				}
			}
			System.out.println(bvrgAvail);
			int inputChs = scanR.nextInt();
			if(!(inputChs>0 && inputChs<=maxChs)) {
				System.out.println("...안녕히 가세요!");
			}
			System.out.printf("%s(%d원)을 구입하셨습니다. 잔돈은 %d원입니다.\n안녕히 가세요! 즐거운 하루 보내시고요!\n",bvgLst[inputChs-1].name,bvgLst[inputChs-1].price,(inputFnd-bvgLst[inputChs-1].price));
		}
		
	}

	
	
	
	
	

}
