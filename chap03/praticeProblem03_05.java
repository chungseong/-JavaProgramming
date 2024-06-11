package test;
import java.util.Scanner;

public class praticeProblem03_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 개의 정수를 입력하실 것입니까?>> ");
		int line = scanner.nextInt();
		int a [] = new int[line];
		
		for (int i=0; i<a.length; i++)
			a[i] = scanner.nextInt();
			
		for (int i=0; i<a.length; i++) {
			if ((a[i] % 3) == 0)
				System.out.print(a[i] + " ");
			else
				continue;
		}
		
		scanner.close();
		

	}

}
