package loof.quiz;

//중첩 반복문을 사용해서 직각 삼각형을 그려보세요
public class qz10 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
