package encap.obj;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hotel ht=new Hotel();
		Chef chef=ht.getChef();
		chef.working();
		ht.getChef().working();
		//Chef ch= new Chef();
		//ch.working();
	
	
		//setter의 사용
		//Chef c =new Chef();
		//ht.setChef(c);
		ht.setChef(new Chef());
	}

}
