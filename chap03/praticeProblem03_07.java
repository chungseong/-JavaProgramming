package test;

public class praticeProblem03_07 {

	public static void main(String[] args) {
			
		int [] number = new int[10];
		int sum = 0;
		double avr;
		
		for (int i=0; i<number.length; i++) {
			number[i] = (int)(Math.random()*10 + 1);
		}
		
		for (int i=0; i<number.length; i++)
			sum += number[i];
		avr = sum / number.length;
		
		System.out.print("랜덤한 정수들: ");
		for (int i=0; i<number.length; i++)
			System.out.print(number[i] + " ");
		System.out.println();
		
		System.out.println("평균은 " + avr);	
		

	}
}
