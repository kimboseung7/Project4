package loof;
/*
 * 
 * do-while 
 * */
public class Ex04 {

	public static void main(String[] args) {
		int num = 1;
		
		do { //조건을 만족하지 않더라도 블록을 무조건 한 번 실행함
			System.out.println(num);
			num++;
		}while(num<=10);

	}

}
