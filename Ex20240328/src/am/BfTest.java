package am;

import java.util.Scanner;

public class BfTest {

	public static boolean notMine(int ntMn) {
		return ntMn != -1;
	}
	
//	public void mineField() {
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<10;j++) {
//				System.out.printf("%-3c", '#');
//			}
//			System.out.println();
//		}
//	}
	
	public static void main(String[] args) {
		// 배열은 객체로 인식된다.
		
		// 지뢰찾기
		
		/*
			배열 [10] * 10 : 모두 0으로 초기화
		 	지뢰 곁 8칸 : 좌상측 j-1 행 [i-1] 부터 우하측 j+1행 [i+1]까지 +1
		 					| 주변 지뢰의 수를 알려주는 값은 최소 0. 최대 3이다.
		 					| 최상층의 지뢰는 상층이 없고 최하층의 지뢰는 하층이 없다.
		 					| 최좌측의 지뢰는 좌측이 없고 최우측의 지뢰는 우측이 없다.
							| 지뢰는 숫자를 가지면 안된다. -1로 변경해준다.
							| 각 행마다 지뢰는 하나씩 랜덤 위치에 존재한다. < 완전랜덤은 아직 어렵다. (중복 무시 알고리즘 필요)
							| 사용자는 열 그 다음 행을 숫자(1~10)로 입력한다.
							| 0을 선택할 경우 팔방의 칸을 열어준다.
		 	
		 	
		 */
		
//		mineField();
		
		int[][] mnFld = new int[10][10];
		

		for(int i=0; i<10; i++) {
			int mnInd = (int) (Math.random()*10);
			mnFld[i][mnInd] = -1;
		}
		

		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(mnFld[i][j] == -1) {
					//지뢰의 윗줄
					if(i!=0) {
						if(j!=0) {
							if(notMine(mnFld[i-1][j-1])) {
								mnFld[i-1][j-1] += 1;
							}
						}
						if(notMine(mnFld[i-1][j])) {
							mnFld[i-1][j] += 1;
						}
						if(j!=9) {
							if(notMine(mnFld[i-1][j+1])) {
								mnFld[i-1][j+1] += 1;
							}
						} 
						
					}
					
					//지뢰와 같은 줄 < 같은 줄에는 또 다른 지뢰가 없다.
					if(j!=0) {
						mnFld[i][j-1] += 1;
					}
					if(j!=9) {
						mnFld[i][j+1] += 1;
					}

					//지뢰의 밑줄 < 같은 줄에는 또 다른 지뢰가 없다.
					if(i!=9) {
						if(j!=0) {
							if(notMine(mnFld[i+1][j-1])) {
								mnFld[i+1][j-1] += 1;
							}
						}
						if(notMine(mnFld[i+1][j])) {
							mnFld[i+1][j] += 1;
						}
						if(j!=9) {
							if(notMine(mnFld[i+1][j+1])) {
								mnFld[i+1][j+1] += 1;
							}
						} 
						
					}
					
					
				}
			}
		}
		
		Scanner scanGuess = new Scanner(System.in);
		int rowInd = 0;
		int colInd = 0;
		
		int gssCnt = 0;
		
		while(true) { // 지뢰 "찾기"
		
			while(true) {
				System.out.print("선택하실 행을 입력하세요 (1~10) :");
				rowInd = scanGuess.nextInt()-1;
				if (rowInd >= 0 && rowInd <= 9) break;
				System.out.println("제대로 입력하세요");
			}
			
			while(true) {
				System.out.print("선택하실 열을 입력하세요 (1~10) :");
				colInd = scanGuess.nextInt()-1;
				if (colInd >= 0 && colInd <= 9) break;
				System.out.println("제대로 입력하세요");
			}
		
//		System.out.println("["+rowInd+"]  ["+colInd+"]");
			gssCnt++;
			if(mnFld[rowInd][colInd] == -1) {
				System.out.printf("쾅!! %3d번 만에 지뢰를 찾았다!",gssCnt);
				if(gssCnt == 1) {
					System.out.printf("  < 운이 좋은건지 나쁜건지");
				}
				System.out.println();
				System.out.println("지뢰의 위치: ");
				for(int i=0; i<10; i++) {
					for(int j=0; j<10; j++) {
						if(mnFld[i][j]==-1) {
							System.out.printf("행: %2d  || 열: %2d", i+1, j+1);
							if(i == rowInd) {
								System.out.print(" < 당신이 찾은 지뢰!");
							}
							System.out.println();
						}
					}
				}
				
				break;
			}
			else {
				System.out.printf("지뢰가 아닙니다! (주변의 지뢰 수: %d)\n\n",mnFld[rowInd][colInd]);
			}
		}
		
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<10; j++) {
//				System.out.printf("%-3d", mnFld[i][j]);
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
	}

}
