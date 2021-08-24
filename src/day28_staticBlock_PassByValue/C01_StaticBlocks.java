package day28_staticBlock_PassByValue;

public class C01_StaticBlocks {
	
	static int sayi =10;
	
	static {  // static block herþeyden önce çalýþýr. MAÝN METHODDAN BÝLE ÖNCE ÇALIÞIR.
		System.out.println("1. static block çalýþtý");
		sayi=20;
	}
	static {  //static block LAR YUKARIDAN AÞAÐI DOÐRU ÇALIÞIR.
		System.out.println("1,5. static block çalýþtý");
		sayi=25;
	}
	static {  // static block LAR YUKARIDAN AÞAÐI DOÐRU ÇALIÞIR.
		System.out.println("2. static block çalýþtý");
		sayi=30;
	}
	public static void main(String[] args) {
		
		System.out.println("main methodun ilk satýrýnda sayi : "+ sayi);  // output 10,20,25,30,1000

	}
	static {  // static block LAR YUKARIDAN AÞAÐI DOÐRU ÇALIÞIR.
		System.out.println("main methodun altýndaki static block çalýþtý");
		sayi=1000;
	}

}
