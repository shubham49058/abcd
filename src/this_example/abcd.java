package this_example;

public class abcd extends SuperExample{
	
	int a=30;
	public void show() {
		
		System.out.println(super.a);           // print the value of parent class a variable value
		
		System.out.println(a);				   // print the current class a valiable value
	}
	
	
	public static void main(String[] args) {
		abcd obj=new abcd();
		obj.show();
	}
	
}

