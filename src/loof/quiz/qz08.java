package loof.quiz;

/*
 * 구구단에서 짝수는 생략하고 홀수단만 출력하세요
 * 
 * */
public class qz08 {

	public static void main(String[] args) {
		for (int dan = 1; dan <= 9; dan++) {
			for (int times = 1; times <= 9; times++) { //if 안에다가 for을 사용해도됨
				if (dan % 2 != 0) { //if(dan % 2 ==0){ continue; } 써도됨 , if//if(dan % 2 ==1
					System.out.println(dan + "x" + times + "=" + dan * times);
				}
				System.out.println();
			}
		}

	}
}

