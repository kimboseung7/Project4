package loof;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복문없이 처리
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		//반복문으로 처리
		int num = 1; //출력할 숫자
		while (num <= 10) { // 조건을 만족하는 동안 블록을 10번 실행, true면 무한 반복 계속 1증가
			System.out.println(num);
			num++; // num을 1씩 증가시켜서 출력
		}
	}

}
