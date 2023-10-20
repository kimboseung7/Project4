package conditional.quiz;
/*
 * char타입 변수를 선언하고 문자,b,c,d 중에서 하나를 입력하세요
 * 문자에 해당하는 동물을 출력하세요
 * */
public class qz07 {

	public static void main(String[] args) {
		char ani = 'd'; // 비교값은 타입이 맞게 작성
		switch (ani){ //switch 옆에 괄호 하고 변수, 스위치 안에 오는 변수는 문자만 사용가능 실수x
		case 'c': 
			System.out.println("cat");
			break;
		case 'b':
			System.out.println("bird");
			break;
		case 'd':
			System.out.println("dog");
			break;
			
		}
		

	}

}
