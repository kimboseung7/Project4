package loof.quiz;

public class qz01d2 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		
		while(num<=10) {
		 sum = sum + num; //num의 역할 1씩 계속 올려줌 
		 num++;			  //sum에 적용이 되고 10번 반복
		 				  //1~10까지 더해짐
		}
		System.out.println(sum);
	}

}
