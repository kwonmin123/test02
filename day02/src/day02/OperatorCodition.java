package day02;

public class OperatorCodition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  double R = Math.random();
int r= (int)(R*10);
  
double d= Math.random()*10;
int result= (int)d+1;

  
  System.out.println(R);//0~1미만 double형 랜덤값
  System.out.println(r);//0~1미만 double형 랜덤값
  
  System.out.println(result);

	//result 가 3의 배수인지 판별
  
  String ran = result%3== 0? "3의배수입니다":"3의배수가 아닙니다";
	System.out.println(ran);
	}

}
