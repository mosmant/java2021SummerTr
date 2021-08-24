package day27_staticKeyword;

public class StaticMember {
	static int x ;
	int y;
	
	StaticMember(){
	x+=2;
	y++;
 }
    static int getSquare() {
	return x * x ;
}
public static void main(String[] args) {
	
	StaticMember sm1=new StaticMember();

	StaticMember sm2=new StaticMember();
	
	int z =sm1.getSquare();
	
	System.out.println("-x"+z+"-y"+sm2.y);
	
	// output :
	// -x16-y1 ===>-x ve -y String'dir. de�i�im olmaz x de�eri staticdir 16 de�erini al�r.
	// y de�eri non-static oldu�u i�in sm2 de ald��� de�eri al�r.
			
	
   }

}
