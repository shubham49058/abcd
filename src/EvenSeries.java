
public class EvenSeries {

	public void series(int n) {
		if(n<=100) {
		System.out.print(n+" ");
		n=n+2;
		series(n);
		}
		
	}
	public static void main(String[] args) {
		EvenSeries obj=new EvenSeries();
		obj.series(2);
	}
}
