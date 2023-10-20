package conditional.quiz;
/*학생의 점수를 저잘할 변수를 선언하고 0~99 사이의 값을 저장하세요 switch 문으로 사용
 * 점수가 90~99이면 "수" 
 * 점수가 80~89이면 "우"
 * 점수가 70~79이면 "미"
 * 그외는 "양"을 출력하세요 
 * */
public class qz08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rank = 90;
		switch(rank/10) {
		case  9:
			System.out.println("수");
			break;
		case  8:
			System.out.println("우");
			break;
		case  7:
			System.out.println("미");
			break;
		default:
			System.out.println("양");
			break;
		}
	}

}
//저간
