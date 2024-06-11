package test;
import java.util.Scanner;

public class praticeProblem03_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int number = scanner.nextInt();
		
		for (int i=0; i<number; i++) {
			for (int j=number; i<j; j--)
				System.out.print("*");
			System.out.println();
		}
		
		scanner.close();
		
	}

}
