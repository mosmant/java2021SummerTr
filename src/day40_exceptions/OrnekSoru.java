package day40_exceptions;

public class OrnekSoru {

	public static void main(String[] args) {
		/*
		'ortalama' isminde bir method oluþturun ve int v  - int f  isminde 2 adet parametresi olsun.
		int v = vize
		int f = final
		Eðer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
		Sistem ArithmeticException hatasý versin ve "Notlar 0-100 arasýnda olmalý" mesajýný döndürsün.
		Diðer durumlarda ise,
		vizenin yüzde 40 ýný, finalin yüzde 60 ýný alsýn ve toplasýn.(ortalama =)
		vizeye 120, finale 80 girin.
		Programýn çalýþmasýný saðlayýn. (handle edin)
		 */
		try {
			ortalama(120,80);
		} catch (Exception e) {
			System.out.println(e); 				// java.lang.ArithmeticException: Notlar 0 ile 100 arasýnda olmalýdýr.
			System.out.println(e.getMessage()); // Notlar 0 ile 100 arasýnda olmalýdýr.
		}
		

	}

	private static void ortalama(int v,int f) {
		// try/ catch metodu kullanmazsak kod bloke olur.
		// Exception in thread "main" java.lang.ArithmeticException: Notlar 0 ile 100 arasýnda olmalýdýr.
		// at day40_exceptions.OrnekSoru.ortalama(OrnekSoru.java:25)
		// at day40_exceptions.OrnekSoru.main(OrnekSoru.java:18)
		
		if (v>100 || v<0 || f>100 || f<0) {
			throw new ArithmeticException("Notlar 0 ile 100 arasýnda olmalýdýr.");
		}else {
			System.out.println("Ortalama : "+((v*40)/100)+((f*60)/100));
		}
		
		
	}

}
