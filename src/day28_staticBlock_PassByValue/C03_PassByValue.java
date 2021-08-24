package day28_staticBlock_PassByValue;

public class C03_PassByValue {

	public static void main(String[] args) {

		double fiyat = 100; // ==> local variable - scope u main method...

		// fiyatta %10 indirim yapacaðým ve yeni fiyatý döndüreceðim.
		System.out.println("method call ile yazdýrýlan indirimli fiyat : " + indirimYap(fiyat)); // 90.0 portal gibi düþün. geçiþi saðlayan method call
		// burada anlatýlmak istenen þey bu portala variable ýn kendisini mi yoksa deðerini mi göndereceðini belirlemek.
		// JAVA PASSBYVALUE olduðu için DEÐERini gönderir.
		// interview de sorduklarý zaman localler arasýnda geçiþ yapýldýðýnda JAVA variablein kendisini deðil deðerini gönderir.
		
		System.out.println("method çalýþtýktan sonra fiyat : " + fiyat); // 100.0 local variable - scope u main method...
	
		int zamYuzdesi = 15;
		zamYap(zamYuzdesi); // buradaki zam yuzdesi ile zamYap(int zamYuzdesi) method yüzdesi klon variable sadece deðerleri ayný
	
	
	}
	

	private static void zamYap(int zamYuzdesi) {
		// Javaya bir method oluþturttuðumuzda Java bizim mainMethodda kullandýðýmýzda variable clone kopya bir variable oluþturur. 
		//bunun amacý kod takibini kolaylaþtormaktýr. bu deðiþkenin ismini deðiþtirsek bile kodumuz problemsiz çalýþýr.
		
	}


	private static double indirimYap(double fiyat) { // ==> burada variable oluþturuldu. local variable scope u method.
		fiyat = fiyat * 90 / 100;
		System.out.println("methoddaki fiyat : " + fiyat); // 90.0 local variable scope u method.
		return fiyat; // local variable scope u method.
	}

}
