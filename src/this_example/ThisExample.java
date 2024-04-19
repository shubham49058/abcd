package this_example;

public class ThisExample {

	String name;        //instane variable
	int age;			//instance variable

	/*
	  ThisExample(String name,int age) { this.name=name; this.age=age; }						//CONSTRUCTOR                                                                                     //constructor
	 */
	public void addData(String name, int age) {
		this.name=name;      							//this keyword used to tell the compiler to assign on instance variable
		this.age=age;
	}
	public void showdata() {
		System.out.println("Name is: "+this.name+" Age is: "+this.age);
	}
	public static void main(String[] args) {
		ThisExample obj=new ThisExample();
		obj.addData("Satish shah", 24);
		obj.showdata();
	}
	
}
