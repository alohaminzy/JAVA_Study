package test;

public class GugudanDowhile {

	public static void main(String[] args) {

		int i = 1;
		 
		do { 
	
			int j = 1;
			
			i++; //i 2���� ����, j 1���� ����
			
			System.out.println("\n" + i + "���Դϴ�.");
			System.out.println(i + " * " + j + " = " + i*j);
			
			do {
				
				j++; 
				
				System.out.println(i + " * " + j + " = " + i*j);
				
			} while(j < 9);
			
		} while(i < 9);

	}

}
