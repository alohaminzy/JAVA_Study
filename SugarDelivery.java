package test;
import java.util.*;

public class SugarDelivery {

	public static void  main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����̴� ���� �������忡�� ������ ����ϰ� �ִ�.\r\n"
						 + "����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�.\r\n" 
						 + "�������忡�� ����� ������ ������ ����� �ִ�.\r\n"
						 + "������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.\r\n" 
						 + "����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�.\r\n"
						 + "���� ���, 18ų�α׷� ������ ����ؾ� �� ��,\r\n"
						 + "3ų�α׷� ���� 6���� �������� ������,\r\n"
						 + "5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�,\r\n"
						 + "�� ���� ������ ������ ����� �� �ִ�.\r\n" 
						 + "����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��,\r\n"
						 + "���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.\r\n"
						 + "����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�.\r\n"
						 + "����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.");
		
		int numN = scan.nextInt();
		int numDivFive = 0;
		int numDivFive2 = 0;
		int numI = 0;
		
		System.out.println("����̰� ����ؾ� �ϴ� kg�� " + numN + "kg�̰�,");
		
		if(numN % 5 == 0) {
			
			numDivFive = numN / 5;
			System.out.println("�ּ� ���������� ���� " + numDivFive + "�� �Դϴ�.");
			
		}else {
			
			do {
				
				numN = numN - 3;
				numI = numI + 1;
				
			} while (numN % 5 != 0 && numN > 5);
			
			if(numN == 0) {
				
				System.out.println("�ּ� ���������� ���� " + (numDivFive2 + numI) + "�� �Դϴ�.");
				System.out.println(numDivFive + numI);
				
			} else if(numN == 3) {
				
				numI = numI + 1;
				
				System.out.println("�ּ� ���������� ���� " + (numDivFive2 + numI) + "�� �Դϴ�.");
				System.out.println(numDivFive + numI);
				
			} else if(numN % 5 == 0) {
				
				numDivFive2 = numN / 5;
				
				System.out.println("�ּ� ���������� ���� " + (numDivFive2 + numI) + "�� �Դϴ�.");
				
			} else {
				
				System.out.println(-1);
				
			}
			
		}

	}

}
