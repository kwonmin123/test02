package encap.good;

public class Member {

	//getter, setter의 자동완성기능
	//alt shift s 혹은 쏘스
	private String id;
	private String pw;
	private String name;
	private String email;
	private String addr;
	private String phone;
	private String age;
	//생성자도 한번에 생성  가능

	public Member(String id, String pw, String name, String email, String addr, String phone, String age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.phone = phone;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	
	
}
