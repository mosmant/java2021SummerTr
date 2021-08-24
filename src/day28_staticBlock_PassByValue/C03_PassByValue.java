package day28_staticBlock_PassByValue;

public class C03_PassByValue {

	public static void main(String[] args) {

		double fiyat = 100; // ==> local variable - scope u main method...

		// fiyatta %10 indirim yapaca��m ve yeni fiyat� d�nd�rece�im.
		System.out.println("method call ile yazd�r�lan indirimli fiyat : " + indirimYap(fiyat)); // 90.0 portal gibi d���n. ge�i�i sa�layan method call
		// burada anlat�lmak istenen �ey bu portala variable �n kendisini mi yoksa de�erini mi g�nderece�ini belirlemek.
		// JAVA PASSBYVALUE oldu�u i�in DE�ERini g�nderir.
		// interview de sorduklar� zaman localler aras�nda ge�i� yap�ld���nda JAVA variablein kendisini de�il de�erini g�nderir.
		
		System.out.println("method �al��t�ktan sonra fiyat : " + fiyat); // 100.0 local variable - scope u main method...
	
		int zamYuzdesi = 15;
		zamYap(zamYuzdesi); // buradaki zam yuzdesi ile zamYap(int zamYuzdesi) method y�zdesi klon variable sadece de�erleri ayn�
	
	
	}
	

	private static void zamYap(int zamYuzdesi) {
		// Javaya bir method olu�turttu�umuzda Java bizim mainMethodda kulland���m�zda variable clone kopya bir variable olu�turur. 
		//bunun amac� kod takibini kolayla�tormakt�r. bu de�i�kenin ismini de�i�tirsek bile kodumuz problemsiz �al���r.
		
	}


	private static double indirimYap(double fiyat) { // ==> burada variable olu�turuldu. local variable scope u method.
		fiyat = fiyat * 90 / 100;
		System.out.println("methoddaki fiyat : " + fiyat); // 90.0 local variable scope u method.
		return fiyat; // local variable scope u method.
	}

}
