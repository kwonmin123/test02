package day03;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		
		
		//수 x의 약수의 개수를 구하는 식
		Scanner scan= new Scanner(System.in);
		
		int a=scan.nextInt();
		
		int b=1;
		int c=0;
		while(b<=a) {	
		if(a%b==0) {
			++c;
		}
		
		b++;
		}
		System.out.println(c);
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		

	}

}
