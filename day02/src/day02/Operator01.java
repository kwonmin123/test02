package day02;

public class Operator01 {
public static void main(String[] args) {
	
	//단한연산자
	//부호연산자
	int a= +3;
	int b= -a;
	int c= -b;
	System.out.println(c);
	//증감연산자++,--
	int d= 1;
	
	int e= ++d;
	int f= --d;
//전위는 먼저 증가시키고 그다으멩 대입
	System.out.println("e의값은"+e);
	System.out.println("f의값은"+f);
	
	int g= d++;
	int h= d--;
	System.out.println("g의값은"+g);
	System.out.println("h의값은"+h);
	System.out.println("h의값은"+h);

	//후위는 먼저 값대입하고 증가
	int x=1;
	int result = (x++)+(x++)+10;
//같은항에 여러번사용하는 경우, 증가된 형태로 계산됨	
	System.out.println(result);

			System.out.println("-----------------------");
	
			
			
			int op = 8;
			int opq = op++;	
			System.out.println(opq);
			System.out.println(op);
	//비트반전연산자~
	byte tt =10; //0000_1010
	System.out.println(~tt);
	System.out.println(~tt+1);
	
	//1111_0101
	boolean bool =true;
	System.out.println(!bool);
	System.out.println(!!bool);
	
	System.out.println(!!!!bool);
	
	
	
}
}
