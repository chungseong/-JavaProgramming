package test;
import java.util.Scanner;

public class praticeProblem03_08 {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 개의 정수를 입력하실 것입니까?>> ");
		int line = scanner.nextInt();
		int number [] = new int[line];
		
		for (int i=0; i<number.length; i++) {
			int newNumber = (int)(Math.random()*100 + 1);
			if (newNumber == number[i]) {
				i--;
				continue;
			} else
			number[i] = newNumber;
		}
		
		for (int i=0; i<number.length; i++)
			System.out.print(number[i] + " ");
		
		scanner.close();
		
		

	}
}
