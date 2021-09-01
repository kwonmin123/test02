package day03;

public class WhileEx03 {

	public static void main(String[] args) {
		// 어떤랜덤한 100꺼자의 정수가 소수인지 판별

		
		int a=(int)(Math.random()*101);
		int i=2;
		while(a%i!=0) {
			i++;
			
		}
	System.out.println(a==i? a+"는 소수입니다":a+"는 소수가 아닙니다");
	
	}

}
