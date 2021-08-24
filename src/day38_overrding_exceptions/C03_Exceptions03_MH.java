package day38_overrding_exceptions;

public class C03_Exceptions03_MH {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// try catch blogundaki e nin gorevi 
		
		int sayi1=10;
		int sayi2=0;
		
		C01_Exceptions01_MH exp=new C01_Exceptions01_MH(); 
		// esitligin solundaki Exceptions01 hem class adi hem de exp objesi icin data turu
		
		try {
		System.out.println(sayi1/sayi2);
		} catch (ArithmeticException e) { // int a, String str, Object obj1 gibi...
		// ArithmeticException java'da bir class ve e objesi icin data turu
		// e ise ArithmeticException class'indan olusturdugumuz objenin adi
		// o zaman ismi e olmak zorunda degiliz ama genelde e kullanilir	
			System.out.println("sayiyi sifira bolemezsin"); // bizim kullaniciya vermek istedigimiz mesaj
			System.out.println(e); // java.lang.ArithmeticException: / by zero
		// bu durumda hem java'ya sorunu yazmasi icin firsat vermis
		// hem de aplicayion'i bloke etmemis oluruz
			System.out.println(e.getMessage()); // / by zero

			e.printStackTrace(); 
			/*
			 	java.lang.ArithmeticException: / by zero
				at day38_exceptions.Exceptions03.main(Exceptions03.java:15)
			 
			 */
		}
		
		System.out.println("Kod bloke olmamisssss");
	}

}