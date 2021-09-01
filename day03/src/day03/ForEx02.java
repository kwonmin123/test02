package day03;

public class ForEx02 {

	public static void main(String[] args) {
		// for문을 이용하여 소수판별.. count 이용
		// 소수는 약수의 개수가 2개임
		int count=0;
		int a= (int)((Math.random()*100));
		
		//a가 소수인지 아닌지 판별 어케할까요?
		
		for (int b=1; b<a;b++) {
			
			if(a%b==0) {
			count++;	
				
			}
			
			
			
		}
		System.out.println(count==1? a+"는소수":a+"는 소수가 아닙니다");
		
		

		
		
		
	}

}
