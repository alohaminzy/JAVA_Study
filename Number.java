package test;

import	java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 A를 입력하세요. ");
		
		int number_A = scan.nextInt();
		
		System.out.println("정수 B를 입력하세요. "); 
		int number_B = scan.nextInt();
		
		System.out.println("정수 A와 B를 더한 값은 " + (number_A + number_B) + "입니다.");
		System.out.println("정수 A와 B를 뺀 값은 "  + (number_A - number_B) + "입니다.");
		System.out.println("정수 A와 B를 곱한 값은 " + (number_A * number_B) + "입니다.");
		System.out.println("정수 A와 B를 나눈한 값은 " + (number_A / number_B) + "입니다.");

	}

}
