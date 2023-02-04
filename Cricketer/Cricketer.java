public class Cricketer{
	String name;
	String birthday;
	double height;
	String country;
	String role;
		
	public Cricketer(String name,String birthday,double height,String country)
	{
		this.name=name;
		this.birthday=birthday;
		this.height=height;
		this.country=country;
		
	}
	public void setRole(String role){
		this.role=role;
	}
	public String setRole(){
		return role;
	}
	public void print(){
		System.out.println("name is "+name);
		System.out.println("birthday is "+birthday);
		System.out.println("height is "+height);
		System.out.println("country is "+country);
		System.out.println("role is "+role);
	}
}