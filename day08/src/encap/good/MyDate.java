package encap.good;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn;
	
	public void setDay(int a) {
		if(a>0&&a<32) {
			day=a;
		} else System.out.println("잘못된 날짜입니다");;
		
	}
	public int getDay(){
		return day;
	}
	public void setMonth(int a) {
		if(a>0&&a<12) {
			month=a;
		} else System.out.println("잘못된 달입니다");;
		
	}
	public int getMonth(){
		return month;
	}
	public void setYear(int a) {
		if(a>0&&a<2022) {
			year=a;
		} else System.out.println("잘못된 년도입니다");;
		
	}
	public int getYear(){
		return year;
	}
	public void setSsn(String a) {
		if(a.length()>0&&a.length()<13) {
			ssn=a;
		} else System.out.println("잘못된 주민번호입니다");;
		
	}
	public String getSsn(){
		return ssn;
	}
	
	
	
	
	
}
