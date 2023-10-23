package loof;

public class Ex09 {

	public static void main(String[] args) {
		int sum = 0; // 합계
		int i;// 마지막에 i의 값을 출력학 위해 외부에 선언

		for (i = 1; i <= 20; i++) { // i 가 1부터 20이 될때까지 20번 수행함
			sum = sum + i;
			System.out.println("i:" + i + ", sum:" + sum);
			if(sum>= 100) { // 합이 100을 넘으면 종료
				break;
			}
		}
		System.out.println("i:"+ i); 
		System.out.println("sum:" + sum);
	}
}