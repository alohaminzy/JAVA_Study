package test;

import java.util.*;

public class SplitText {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자나 숫자를 입력하세요. 10자리씩 끊어서 다음줄로 출력됩니다.");
		
		String text = scan.next();
		
		//System.out.println(text + text);//next() 메소드를 쓰면 문자로 바로 인식되는구나.
		
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
		
		System.out.print("\n");//출력은 입력한 값과 구분하기 쉽게 한줄띄우자.
		
		do {//처음에 한번은 실행해야지? 그래서 do while문으로 수정!
			
			System.out.println(text.substring(i,i+10));//문자를 어디서부터 어디까지 자르는 데 쓰는 함수가 뭘까? 드롭다운에서 찾다가 substring발견!
			
			i = i + 10;
			
		} while (i+10 < text.length());
		
		System.out.println(text.substring(i,text.length()));

	}

}
