package loof.quiz;
//while 문을 사용해 10부터 20까지 합을 구하고 출력하세요
public class qz02 {
	
	public static void main(String[] args) {
		int sum = 10; //합계 시작값
		int num = 11; //더하는 수
		while(num<=20) { //num의 값이 최대 20까지 되야됨
			sum = sum + num; // 
			num++; // 증감식 //배수를 하고 싶으면 num = num + 배수
		}
		System.out.println(sum);
	}

}
