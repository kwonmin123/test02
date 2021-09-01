package day03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
	
		
		Scanner scan =new Scanner(System.in);
		
		
		System.out.print("점수입력");

		int score = scan.nextInt();
		int point;
		point=score/10;
		
		switch(score/10) {
		
		case 9 :
			System.out.println("A");
			if(score>=95) {System.out.println("+");}
			
			
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			break;
		default :
			System.out.println("F");

			break;
		
			
		
		
		
		}
		
		scan.close();
		
		
		
		
		
	}

}
