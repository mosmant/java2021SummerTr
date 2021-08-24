package day40_exceptions;

public class OrnekSoru {

	public static void main(String[] args) {
		/*
		'ortalama' isminde bir method olu�turun ve int v  - int f  isminde 2 adet parametresi olsun.
		int v = vize
		int f = final
		E�er  vize 100 den b�y�k, veya final 100'den b�y�k, veya vize 0'dan k���k, veya final 0'dan k���k ise,
		Sistem ArithmeticException hatas� versin ve "Notlar 0-100 aras�nda olmal�" mesaj�n� d�nd�rs�n.
		Di�er durumlarda ise,
		vizenin y�zde 40 �n�, finalin y�zde 60 �n� als�n ve toplas�n.(ortalama =)
		vizeye 120, finale 80 girin.
		Program�n �al��mas�n� sa�lay�n. (handle edin)
		 */
		try {
			ortalama(120,80);
		} catch (Exception e) {
			System.out.println(e); 				// java.lang.ArithmeticException: Notlar 0 ile 100 aras�nda olmal�d�r.
			System.out.println(e.getMessage()); // Notlar 0 ile 100 aras�nda olmal�d�r.
		}
		

	}

	private static void ortalama(int v,int f) {
		// try/ catch metodu kullanmazsak kod bloke olur.
		// Exception in thread "main" java.lang.ArithmeticException: Notlar 0 ile 100 aras�nda olmal�d�r.
		// at day40_exceptions.OrnekSoru.ortalama(OrnekSoru.java:25)
		// at day40_exceptions.OrnekSoru.main(OrnekSoru.java:18)
		
		if (v>100 || v<0 || f>100 || f<0) {
			throw new ArithmeticException("Notlar 0 ile 100 aras�nda olmal�d�r.");
		}else {
			System.out.println("Ortalama : "+((v*40)/100)+((f*60)/100));
		}
		
		
	}

}
