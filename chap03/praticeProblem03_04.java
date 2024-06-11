package test;
import java.util.Scanner;

public class praticeProblem03_04 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하세요: ");
		String alphabet = scanner.next();
		
		int alphabetNumber = alphabet.charAt(0) - 'a' + 1;
		
		for (int i=0; i<alphabetNumber; i++) {
			for (int j=0; j<alphabetNumber-i; j++) {
				System.out.print((char)('a' + j));	
				
			}
			System.out.println();
		}
		
		scanner.close();
		
	}

}
