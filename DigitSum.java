package test;
import java.util.*;

public class DigitSum {

	public static void main(String[] args) {
		
		System.out.println("�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ض�.\r\n" 
						 + "������� N = 123�̸� 1 + 2 + 3 = 6.\r\n");
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();//���ڸ�
		
		String text = Integer.toString(num);//���ڷ� ��ȯ�ϰ�
		
		//System.out.println(text + text);//���ڷ� �� �� Ȯ��
		
		String[] splitText = text.split("");
		
		int i = splitText.length;
		//System.out.println(i);
		
		//System.out.println(splitText[2] + splitText[4]);//���ڷ� ���������� Ȯ�� 
		
		//int x = Integer.valueOf(splitText[i]);
		
		int sum = 0;//���� �� ���� ��
		
		for(i = 0; i < splitText.length; i++) {
			
			int x = Integer.valueOf(splitText[i]);//�迭�� �� �� ã�Ƽ�
			
			sum = sum + x;//���ض�.
			
		}
		
		System.out.println(sum);
		
		//System.out.println(x + x);//���ڷ� ��ȯ����� Ȯ��

	}

}
