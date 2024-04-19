package polymorphismExamples;

public class OverloadingExample {

	int a,b;
	public void assign() {
		System.out.println("This is non parameter method");
	}
	public void assign(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	public void assign(double a,double b) {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		OverloadingExample obj=new OverloadingExample();
		obj.assign();
		obj.assign(5, 7);
		obj.assign(5.0, 6.0);
	}
	
}
