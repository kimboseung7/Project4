package conditional.quiz;

// 정수형 변수 i를 선언하고 숫자 값을 대입
// 그리고 i가 100<i<200 범위(조건)()에 속해있다면 if
// i는 100이상 200이하 입니다(조건 만족){} 라는 메시지를 출력
// 그렇지 않다면 "i는 100보다 작거나 200보다 큽니다"(조건 불만족) 라는 메시지를 출력하세요 else{}
// ->조건식 필요함 -> 만족하는 경우 + 만족하지 못하는 경우(if와 else) 조건1개
public class qz04 {

	public static void main(String[] args) {
		int i = 300;
		if(i>100 && 200>i) { //범위를 나타낼 때는 &&사용  //만족하는경우
			System.out.println("100이상 200이하 입니다");
		}else {//불만족 
			System.out.println("i는 100보다 작거나 200보다 큽니다");
		}
	}
}
		
	
