package conditional.quiz;

//3. 문자형 변수 gender를 선언하고, 문자 하나를 대입하세요
// 변수의 값이F면(조건)/ "여성입니다". 그렇지 않으면 "남성입니다" (코드)
public class qz03 { // "=" 대입 연산자 "==" 비교 연산자

	public static void main(String[] args) {
		char gender = 'F';
		if (gender == 'F') {
			System.out.println("여성입니다");
		} else {
			System.out.println("남성입니다");
		}
	}

}
