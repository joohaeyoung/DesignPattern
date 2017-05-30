package joo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javafx.scene.image.ImageView;

public class Test {
	
	private static Map<String, String[]> lectures = new HashMap<>();

	public static void main(String[] args) {
		lectures.put("최영규", new String[] { "C언어", "자바", "네트워크" });
		lectures.put("정구철", new String[] { "그래픽스", "컴구조", "C언어" });
		lectures.put("김상진", new String[] { "자바프로그래밍", "객체지향" });
		// 종후이 무슨책으로 공부함? ㅋㅋㅋㅋㅋ글쿤 ㅋㅋ ㅋㅋㅋㅋㅋㅋ 하 ㅋㅋ 헤어지기 아쉽노 ㅋㅋㅋ오키오키오키오키 ㅋㅋ 여자친구한테 또 양보해야지 ㅋㅋㅋ
		// ㅋㅋㅋㅋㅋㅋㅋ 근데 자극된다 멋잇다 ㅋㅋㅋㅋ 열심히해야지 ㅋㅋㅋ
		// ok 알았으 
		Scanner scanner = new Scanner(System.in);
		System.out.println("교수님이름: ");
		
		// 교수님 얻기
		String professorName = scanner.next();
		
		// 교수님 프로필 사진 수정
		ImageView profileImg = (ImageView) findViewById(R.id.profileImg);
		profileImg.setImage();
		
		// 교수님 과목에 해당하는 RatingBar 추가
		for(String lecture: lectures.get(professorName)) {
			//System.out.println(lecture);
			RatingBar lectureRatingBar = new RatingBar();
			lectureRatingBar.setText(lecture);
			
			lectureLinerLayout.add(ratingBar);
		}
	}

}
