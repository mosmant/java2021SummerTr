package day27_staticKeyword;

public class Counter {
	
	int count;
	static int stCount;
	public Counter () {
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
		
		System.out.println("count is : "+cs6.getCount());
		System.out.println("stCount is : "+cs6.getStCount());
		
		
		// output :
		// count is : 1  ===> cs6.count deðeri static olmadýðý için 1 olur. her seferinde default deðerden baþlar.
		// stCount is : 6	===> cs6.stcount deðeri static olduðu için her seferinde artacaðý için 6 olur
				
		// *** constructor her oluþturulduðunda çalýþýr.
	}
}