package day03;

import java.util.Scanner;

public class BreakEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* 무한 반복문
		 * -반복문의 횟수를 정확히 모를때, while(true)문장을 사용한다
		 * -특정조건에서 반복문을 탈출하는 형태
		 * 
		 */
//		
//		
//		
//		int i=0;
//		while(true) {
//			System.out.println(i);
//			
//			if(i==15) break;
//			i++;
//		}
		Scanner scan=new Scanner(System.in);
		
		
		 while(true) {
			 
			 System.out.println("4 + 3 = ?");
			 System.out.print(">");
			 int answer=scan.nextInt();
			 if(answer==7) {System.out.println("정답입니다!");
		 	break;}
		 	else {		 	System.out.println("틀렸습니다 다시써주세요");
		 	}
			 
		 }
		 
		
		
		scan.close();
		
	}

}
