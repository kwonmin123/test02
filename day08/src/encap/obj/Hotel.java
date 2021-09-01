package encap.obj;

public class Hotel {

	private String name;
	private Chef chef; 
	private Employee empl;
	public Hotel() {
		this.chef = new Chef();
		this.empl = new Employee();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Chef getChef() {
		return chef;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public Employee getEmpl() {
		return empl;
	}
	public void setEmpl(Employee empl) {
		this.empl = empl;
	}
	
	
	
}
