package day27_staticKeyword;

public class Countr {
	int count =0;
	Countr(){
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		
		Countr c1 = new Countr(); // output 1 olacaktýr. obje oluþtururken constructor tanýmladýðýmýz anda cons. çalýþýr.
		Countr c2 = new Countr(); // output 1 olacaktýr. obje oluþtururken constructor tanýmladýðýmýz anda cons. çalýþýr.
		Countr c3 = new Countr(); // output 1 olacaktýr. obje oluþtururken constructor tanýmladýðýmýz anda cons. çalýþýr.

	}

}
