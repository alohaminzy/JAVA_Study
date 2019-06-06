package test;
import java.util.*;

public class NumberMod {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 A,B,C를 입력하세요.");
		
		int numberA = scan.nextInt();
		int numberB = scan.nextInt();
		int numberC = scan.nextInt();
		
		System.out.println("정수 (A+B)/C의 결과값은 " + (numberA + numberB)%numberC + "입니다.");
		System.out.println("정수 (A/C + B/C)/C의 결과값은 " + (numberA%numberC + numberB%numberC)%numberC + "입니다.");
		System.out.println("정수 (A*B)/C의 결과값은 " + (numberA * numberB)%numberC + "입니다.");
		System.out.println("정수 (A/C * B/C)/C의 결과값은 " + (numberA%numberC * numberB%numberC)%numberC + "입니다.");
		
	}

}
