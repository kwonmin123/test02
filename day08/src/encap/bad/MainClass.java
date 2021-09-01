package encap.bad;

public class MainClass {

	public static void main(String[] args) {
		// 멤버변수가 퍼블릭이라면 잘못된 값이 저장될수 있음
		MyDate me =new MyDate();
		
		me.year=2021;
		me.day=12;
		me.month=100;
		me.ssn= "이게머임";
	}

}
