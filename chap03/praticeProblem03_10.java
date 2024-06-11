package test;

public class praticeProblem03_10 {

	public static void main(String[] args) {
	
		int number [][] = new int [4][4];
		int position [] = new int [10];
		
		for (int i=0; i<position.length; i++) {
			int newNumber = (int)(Math.random()*16);
			for (int j=0; j<i; j++) {
				if (newNumber == position[j]) {
					i--;
					j--;
					continue;
				} else
					position[i] = newNumber;				
			}			
		}		
		
		for (int i=0; i<10; i++) {
			number[position[i] / 4][position[i] % 4] = (int)(Math.random()*10 + 1);
		}
		
		
		for (int i=0; i<number.length; i++) {
			for (int j=0; j<number[i].length; j++)
				System.out.print(number[i][j] + " ");
			System.out.println();
		}
		

	}
}
