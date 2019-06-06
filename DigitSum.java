package test;
import java.util.*;

public class DigitSum {

	public static void main(String[] args) {
		
		System.out.println("자연수 N이 주어지면, N의 각 자릿수의 합을 구해라.\r\n" 
						 + "예를들어 N = 123이면 1 + 2 + 3 = 6.\r\n");
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();//숫자를
		
		String text = Integer.toString(num);//문자로 변환하고
		
		//System.out.println(text + text);//문자로 된 것 확인
		
		String[] splitText = text.split("");
		
		int i = splitText.length;
		//System.out.println(i);
		
		//System.out.println(splitText[2] + splitText[4]);//문자로 떨어졌는지 확인 
		
		//int x = Integer.valueOf(splitText[i]);
		
		int sum = 0;//더한 값 담을 곳
		
		for(i = 0; i < splitText.length; i++) {
			
			int x = Integer.valueOf(splitText[i]);//배열의 값 다 찾아서
			
			sum = sum + x;//더해라.
			
		}
		
		System.out.println(sum);
		
		//System.out.println(x + x);//숫자로 변환됬는지 확인

	}

}
