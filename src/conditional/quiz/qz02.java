package conditional.quiz;
//정수형 변수 age를 선언하고 나이를 대입하세요
//문자형 변수 gender를 선언하고 성별을 F또는 M으로 대입하세요
//그리고 나이가 8살 이상이고 성별이 여자라면, "여학생입니다"출력하세요
public class qz02 {

	public static void main(String[] args) {
		int age = 8;
		char gender = 'F'; // if문에 gender == 'F' 이런식으로 표현
		if ((age >= 8) && gender == 'F') { //1. age 2. gender
			System.out.println("여학생입니다");
			
		}
		

	}

}
