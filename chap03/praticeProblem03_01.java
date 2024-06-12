package test;
import java.util.Scanner;

public class praticeProblem03_14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		
		System.out.print("과목 이름: ");
		String subject = scanner.next();
		
		for (int i=0; i<course.length; i++) {
			if (subject.equals(course[i]))
				System.out.println(course[i] +"의 점수는 " + score[i] + "입니다.");
		}
		
		scanner.close();
		
	}
		

}
