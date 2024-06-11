package test;

public class praticeProblem03_09 {

	public static void main(String[] args) {
	
		int number [][] = new int [4][4];
		
		for (int i=0; i<number.length; i++) {
			for (int j=0; j<number[i].length; j++)
				number[i][j] = (int)(Math.random()*10 + 1);
		}
		
		
		for (int i=0; i<number.length; i++) {
			for (int j=0; j<number[i].length; j++)
				System.out.print(number[i][j] + " ");
			System.out.println();
		}
		

	}
}
