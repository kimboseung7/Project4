package conditional.quiz;

// 월을 저장할 변수를 선언하고 1~12 사이의 값을 저장하세요.
// 그리고 월에 해당하는 계절을 출력하세요
// 3~5월 "현재 계절은 봄입니다"
// 6~8월 "현재 계절은 여름입니다"
// 9~11월 "현제 계절은 가을입니다"
// 12월~2월 "현재 계절은 겨울입니다"
// 이외는 "월이 잘못되었습니다"
public class qz05 {

	public static void main(String[] args) {
		int mon = 1;
		if (mon >= 3 && mon <= 5) {
			System.out.println("현재 계절은 봄입니다");
		} else if (mon >= 6 && mon <= 8) {
			System.out.println("현재 계절은 여름입니다");
		} else if (mon >= 9 && mon <= 11) {
			System.out.println("현재 계절은 가을입니다");
		} else if (mon >= 12) { 						// 논리 합 사용이 좋음 mon==12 || mon == 1 || mon == 2 // mon == 12 || mon <= 2
			System.out.println("현재 계절은 겨울입니다");		// 나는 논리 곱 사용
		} else if (mon >= 1 && mon <= 2) {
			System.out.println("현재 계절은 겨울입니다");
		} else {
			System.out.println("월이 잘못되었습니다");
		}

	}

}
