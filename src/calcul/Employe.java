package calcul;

public class Employe {

	private String name ; 
	private int age ;
	private String tel ;
	private String address ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employe(String name, int age, String tel, String address) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.address = address;
	}
	
}
