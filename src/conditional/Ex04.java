package conditional;

/*
 * rank 순위 변수로 스위치 함수를 이용해서 값 찾기
 * 조건은 3개
 * if와 case 중 괜찮은거 고르면됨
 * */
public class Ex04 {

	public static void main(String[] args) {
		int rank = 5; // 순위
		switch (rank) {
		case 1: // rank (변수)값이 1이면 //rank 변수와 대조해서 맞으면 실행 아니면 case 2로 넘어감
			System.out.println("매달의 색은 금입니다");
			break; // 반복 끝   break문을 만나면 빠져나온다 안쓰면 다음 case까지 적용됨
		case 2: // rank (변수)값이 2이면
			System.out.println("매달의 색은 은입니다");
			break;
		case 3: // rank (변수)값이 3이면 //if(case==3) 이랑 같은 기능
			System.out.println("매달의 색은 동입니다");
			break;
		default: //  변수의 값과 일치하는 case문이 없다면 default문이 수행된다 == else랑 비슷한 기능
			System.out.println("매달이 없습니다");
		}
	}

}
