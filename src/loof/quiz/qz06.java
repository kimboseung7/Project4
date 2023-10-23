package loof.quiz;
/*
 * for 문을 사용해 1부터 100까지 더하는 코드를 작성하세요
 * 단 중간에 합이 500이 넘어가면 중단합니다.
 * for문이 종료되기전 num과 sum의 값을 출력하세요
 * 
 * */
public class qz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num;
		for(num = 1; num <= 100; num++) { //i가 100이 될때까지 총 100번 수행함
			sum = sum + num; // i를 1씩 증가시키면서 sum에 더하기
			
			if(sum>= 500) { //sum이 500을 넘으면 for문 종료
				break;
			}
		}
		System.out.println("sum:"+sum);
		System.out.println("num:"+num);
	}
}
