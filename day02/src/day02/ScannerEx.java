package day02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
	
//1.스캐너
		Scanner scan = new Scanner(System.in);

		System.out.print("할말>");
		String hello= scan.next();
		
		
		System.out.print("나이>");
		int age= scan.nextInt();
		
		System.out.print("키>");
		double height= scan.nextDouble();
		
		
		System.out.println("할말 :"+hello
				+"\n"+"나이 :"+ age+"살"+"\n"+"키 :"+height+"cm");
		
		
		//2. 스캐너 끄기
		scan.close();
		//이 클래스에서는 더이상 사용 못함 다시 못 열음
		
		
	}

}
