package day03;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수>");
		int score = scan.nextInt();
		if(score>=90)
		{if(score==100) {System.out.println("최고점수");}
		else if(score>=95) {System.out.println("a+학점");}
		else System.out.println("a학점");;}
		else if(score>=80) {System.out.println("b학점");}
		else if(score>=70) {System.out.println("c학점");}
		else if(score>=60) {System.out.println("d학점");}
		else {System.out.println("f학점");};
		scan.close();
	}

}
