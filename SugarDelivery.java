package test;
import java.util.*;

public class SugarDelivery {

	public static void  main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("상근이는 요즘 설탕공장에서 설탕을 배달하고 있다.\r\n"
						 + "상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.\r\n" 
						 + "설탕공장에서 만드는 설탕은 봉지에 담겨져 있다.\r\n"
						 + "봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.\r\n" 
						 + "상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다.\r\n"
						 + "예를 들어, 18킬로그램 설탕을 배달해야 할 때,\r\n"
						 + "3킬로그램 봉지 6개를 가져가도 되지만,\r\n"
						 + "5킬로그램 3개와 3킬로그램 1개를 배달하면,\r\n"
						 + "더 적은 개수의 봉지를 배달할 수 있다.\r\n" 
						 + "상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때,\r\n"
						 + "봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.\r\n"
						 + "상근이가 배달하는 봉지의 최소 개수를 출력한다.\r\n"
						 + "만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.");
		
		int numN = scan.nextInt();
		int numDivFive = 0;
		int numDivFive2 = 0;
		int numI = 0;
		
		System.out.println("상근이가 배달해야 하는 kg은 " + numN + "kg이고,");
		
		if(numN % 5 == 0) {
			
			numDivFive = numN / 5;
			System.out.println("최소 설탕봉지의 수는 " + numDivFive + "개 입니다.");
			
		}else {
			
			do {
				
				numN = numN - 3;
				numI = numI + 1;
				
			} while (numN % 5 != 0 && numN > 5);
			
			if(numN == 0) {
				
				System.out.println("최소 설탕봉지의 수는 " + (numDivFive2 + numI) + "개 입니다.");
				System.out.println(numDivFive + numI);
				
			} else if(numN == 3) {
				
				numI = numI + 1;
				
				System.out.println("최소 설탕봉지의 수는 " + (numDivFive2 + numI) + "개 입니다.");
				System.out.println(numDivFive + numI);
				
			} else if(numN % 5 == 0) {
				
				numDivFive2 = numN / 5;
				
				System.out.println("최소 설탕봉지의 수는 " + (numDivFive2 + numI) + "개 입니다.");
				
			} else {
				
				System.out.println(-1);
				
			}
			
		}

	}

}
