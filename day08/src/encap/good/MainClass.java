package encap.good;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate me = new MyDate();
		me.setMonth(3);
		me.setDay(7);
		me.setYear(2020);
		me.setSsn("900000658413577");
		System.out.printf("생일 : %d년  %d월 %d일\n",me.getYear(),me.getMonth(),me.getDay());
		System.out.println("주민번호 : "+me.getSsn());
	}

}
