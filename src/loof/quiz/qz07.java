package loof.quiz;

/*
 * 구구단을 3단부터 7단까지 출력하세요
 * */
public class qz07 {

	public static void main(String[] args) {
		for (int dan = 3; dan <= 7; dan++) {
			for (int times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan * times);

			}
			System.out.println();
		}

	}
}
