package test;
import java.util.*;

public class NumberMod {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� A,B,C�� �Է��ϼ���.");
		
		int numberA = scan.nextInt();
		int numberB = scan.nextInt();
		int numberC = scan.nextInt();
		
		System.out.println("���� (A+B)/C�� ������� " + (numberA + numberB)%numberC + "�Դϴ�.");
		System.out.println("���� (A/C + B/C)/C�� ������� " + (numberA%numberC + numberB%numberC)%numberC + "�Դϴ�.");
		System.out.println("���� (A*B)/C�� ������� " + (numberA * numberB)%numberC + "�Դϴ�.");
		System.out.println("���� (A/C * B/C)/C�� ������� " + (numberA%numberC * numberB%numberC)%numberC + "�Դϴ�.");
		
	}

}
