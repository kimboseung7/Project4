package conditional.quiz;
/*학생의 점수를 저잘할 변수를 선언하고 0~99 사이의 값을 저장하세요 (조건이 여러개 이므로 else if 사용)
 * 점수가 90~99이면 "수" -->
 * 점수가 80~89이면 "우"
 * 점수가 70~79이면 "미"
 * 그외는 "양"을 출력하세요 (else 사용)
 * */

public class qz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 50	;
		if (score >= 90) { //90~99 --> 논리 곱으로 연결 
			System.out.println("수"); 
		} else if (score >= 80 && score <= 89) { //80~89 --> 논리 곱으로 연결  뒤에 "score < = 89" 없어도됨
			System.out.println("우");
		} else if (score >= 70 && score <= 79) { //70~79 --> 논리 곱으로 연결  뒤에 "score < = 79" 없어도됨
			System.out.println("미");
		} else {
			System.out.println("양");
		}
	}

}
