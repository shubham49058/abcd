package polymorphismExamples;

public class OverridingExample extends Override {

	
	public void sum(int i,int j) {
		System.out.println("Multiply "+i*j);
		System.out.println("Plus "+i+j);
		System.out.println("devide "+i/j);
		
	}
	
	public static void main(String[] args) {
		OverridingExample obj=new OverridingExample();
		obj.sum(10, 20);
		
		
	}
}
