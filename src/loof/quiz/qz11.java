package loof.quiz;

public class qz11 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-i; j++) {// 4 3 2 1 공백문자
				System.out.print(" ");
			}
			for (int k = 1; k<= i; k++) { //1 2 3 4 5 출력 *
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
// 1. 패턴분석 공백이 생기는가? , 잘못만들면 조건 검토
// 2. 줄바꿈