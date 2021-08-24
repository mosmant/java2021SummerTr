package day27_staticKeyword;

public class Counter1 {
	
	int count;
	static int stCount;
	public Counter1 () {
		count++;
		stCount++;
		
	}
	public int getCount() {
		return count;
	}
	public static int getStCount() {
		return stCount;
	}
	
	public static void main(String[] args) {
		
		Counter cs1=new Counter ();
		Counter cs2=new Counter ();
		Counter cs3=new Counter ();
		Counter cs4=new Counter ();
		Counter cs5=new Counter ();
		Counter cs6=new Counter ();
		
		System.out.println("count is : "+cs1.getCount());
		System.out.println("stCount is : "+cs1.getStCount());
		
		// output :
		// count is : 1  ===> cs6.count de�eri static olmad��� i�in 1 olur. her seferinde default de�erden ba�lar.
		// stCount is : 6	===> cs6.stcount de�eri static oldu�u i�in her seferinde artaca�� i�in 6 olur
	}
}