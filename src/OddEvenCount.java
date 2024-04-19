
public class OddEvenCount {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,6,8,9,10,11,13};
		int oddCount=0;
		int evenCount=0;
		for (int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				evenCount+=1;
			}
			else
				oddCount+=1;
		}
		System.out.println("Count of odd numbers: "+oddCount);
		System.out.println("Count of even numbers: "+evenCount);
	}
}
