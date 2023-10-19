package conditional.quiz;

// 1. int형 변수를 선언하고 값을 대입하세요
// 그리고 조건문을 사용해서 변수의 값이 2의 배수거나3의 배수라면
// 2또는 3의 배수입니다 라는 문장을 출력
public class qz01 {

	public static void main(String[] args) {
		int num = 2;
		if ((num % 2 == 0) || (num % 3 == 0)) {
			System.out.println("2 또는 3의 배수입니다");
		}

	}

}
//틀린점 2의 배수를 (num % 0)으로 적어버림 (num % 2 == 0)으로 적어야함
// ==0 붙어야함