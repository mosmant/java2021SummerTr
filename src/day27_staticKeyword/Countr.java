package day27_staticKeyword;

public class Countr {
	int count =0;
	Countr(){
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		
		Countr c1 = new Countr(); // output 1 olacaktır. obje oluştururken constructor tanımladığımız anda cons. çalışır.
		Countr c2 = new Countr(); // output 1 olacaktır. obje oluştururken constructor tanımladığımız anda cons. çalışır.
		Countr c3 = new Countr(); // output 1 olacaktır. obje oluştururken constructor tanımladığımız anda cons. çalışır.

	}

}
