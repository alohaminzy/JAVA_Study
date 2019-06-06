package test;

public class GugudanDowhile {

	public static void main(String[] args) {

		int i = 1;
		 
		do { 
	
			int j = 1;
			
			i++; //i 2부터 돌고, j 1부터 돌고
			
			System.out.println("\n" + i + "단입니다.");
			System.out.println(i + " * " + j + " = " + i*j);
			
			do {
				
				j++; 
				
				System.out.println(i + " * " + j + " = " + i*j);
				
			} while(j < 9);
			
		} while(i < 9);

	}

}
