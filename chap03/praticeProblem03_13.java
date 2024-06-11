package test;

public class praticeProblem03_13 {

	public static void main(String[] args) {
	
		for (int i=1; i<100; i++) {
			int tendigit = i / 10;
			int onedigit = i % 10;
			
			if ((tendigit == 3) || (tendigit == 6) || (tendigit == 9)) {
				if ((onedigit == 3) || (onedigit == 6) || (onedigit == 9))
					System.out.println(i + " 박수 짝짝");
				else
					System.out.println(i + " 박수 짝");
			} 
			else if ((onedigit == 3) || (onedigit == 6) || (onedigit == 9))
					System.out.println(i + " 박수 짝");
			
			
		}
		
		
	}
		

}
