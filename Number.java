package test;

import	java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� A�� �Է��ϼ���. ");
		
		int number_A = scan.nextInt();
		
		System.out.println("���� B�� �Է��ϼ���. "); 
		int number_B = scan.nextInt();
		
		System.out.println("���� A�� B�� ���� ���� " + (number_A + number_B) + "�Դϴ�.");
		System.out.println("���� A�� B�� �� ���� "  + (number_A - number_B) + "�Դϴ�.");
		System.out.println("���� A�� B�� ���� ���� " + (number_A * number_B) + "�Դϴ�.");
		System.out.println("���� A�� B�� ������ ���� " + (number_A / number_B) + "�Դϴ�.");

	}

}
