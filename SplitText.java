package test;

import java.util.*;

public class SplitText {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڳ� ���ڸ� �Է��ϼ���. 10�ڸ��� ��� �����ٷ� ��µ˴ϴ�.");
		
		String text = scan.next();
		
		//System.out.println(text + text);//next() �޼ҵ带 ���� ���ڷ� �ٷ� �νĵǴ±���.
		
		String[] split = text.split("");
		
		//System.out.println(split[2]);
		
//		for(int i = 9; i < split.length; i+=10) {
//			
//			
//			
//			
//			
//		}
		
		int i = 0;
		
		System.out.print("\n");//����� �Է��� ���� �����ϱ� ���� ���ٶ����.
		
		do {//ó���� �ѹ��� �����ؾ���? �׷��� do while������ ����!
			
			System.out.println(text.substring(i,i+10));//���ڸ� ��𼭺��� ������ �ڸ��� �� ���� �Լ��� ����? ��Ӵٿ�� ã�ٰ� substring�߰�!
			
			i = i + 10;
			
		} while (i+10 < text.length());
		
		System.out.println(text.substring(i,text.length()));

	}

}
