package encap.bad;

public class MyDate {
	
	public int year;
	public int day;
	public int month;
	public String ssn; // 주민번호
	
	
	public void info() {
		System.out.printf("생일 : %d년  %d월 %d일\n",year, month,day);
		System.out.println("주민번호 : "+ssn);
	}
	

}
