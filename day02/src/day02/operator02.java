package day02;

public class operator02 {
	
	
	public static void main(String[] args) {
		

	int i = 7/3; //2
	int j = 7%3;
	int k =11*11;
	
	System.out.println(i);
	System.out.println(j);
	System.out.println(k);
	System.out.println(i==j);
	System.out.println(i!=j);
	System.out.println(i<j);
	System.out.println(i<=j);
	System.out.println(i>j);
	System.out.println(i>=j);
	System.out.println(k%2==0); //짝수인가 false
	System.out.println(k%2==1); //짝수인가 ? flase
	System.out.println(k%2!=1);
	
	//비트연산자
	int a = 5; //0000  0101 
	int b = 3; //0000  0011
	System.out.println(a&b);  //0000 0001
	System.out.println(a|b);  //0000 0111
	System.out.println(a^b);  //0000 0110
	//비트  쉬프트
	int c =1023;
	System.out.println(c>>7);
	System.out.println(c);
	// 오버해서 밀면 숫자 사라짐

	
	
	
	}

}
