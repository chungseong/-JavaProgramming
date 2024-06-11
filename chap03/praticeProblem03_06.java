package test;
import java.util.Scanner;

public class praticeProblem03_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		System.out.print("금액을 입력하세요>> ");
		int cash = scanner.nextInt();
		int count = 0;
		
		for (int i=0; i<unit.length; i++) {
			count = cash / unit[i];
			cash = cash % unit[i];
			System.out.print(unit[i] + "원짜리 : " + count + "개\n");
		}
		
		scanner.close();
		

	}
}
