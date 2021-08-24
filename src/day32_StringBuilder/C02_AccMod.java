package day32_StringBuilder;

public class C02_AccMod {

	public static void main(String[] args) {
		C01_AccMod obj1 = new C01_AccMod(); // C01 class�ndan obj1 ocjesi create ettik.

		// obje olu�turarak eri�ime a��lan verileri almak i�in kulland�k.

		System.out.println(obj1.defaultAge); // out. : 15
		System.out.println(obj1.protectedAge); // out. : 32
		System.out.println(obj1.publicAge); // out. : 61

		// soru �u peki private accsess modifier i olan bir veriyi buraya nas�l getirir.

		C03_AccMod name = new C03_AccMod();

		System.out.println(name.defaultName); // out. : murat bey
		System.out.println(name.protectedName); // out. : hakan tetik
		System.out.println(name.publicName); // out. : dayanch bey

		/*
		 * Eri�im alanlar� : 
		 * 1- Class �n i�i 
		 * 2- Paketin i�i 
		 * 3- Projenin i�i (yani di�er paketler) 
		 * 
		 * Public : Projenin her taraf�ndan eri�ilebilir, yani di�er
		 * paketlerden bile. (Class, field, properties, metodlarda, constructor)
		 * 
		 * default: Yani hi� bir �ey yaz�lmazsa, yani di�er ad� friendly : sadece
		 * paketin i�indekiler eri�ebilir. (Class, field,properties metodlarda,
		 * constructor) 
		 * private: Sadece i�inde bulundu�u s�n�f tan
		 * eri�ilebilir.(field,properties, metodlarda) 
		 * 
		 * 1) "private" class member'lar sadece icinde bulunduklari class'larda kullanilabilirler. 
		 * Baska class'lardan "private" class memler'lari (field,properties, metodlarda,
		 * constructor)kullanmak mumkun degildir.
		 * 
		 * 2) Baska package'lerden object olusturursaniz object olusturulan class'i
		 * import etmeniz gerekir.
		 * 
		 * 3) Baska package'lerden default class memberlara ulasamazsiniz. Ayni
		 * package'de iseniz ulasabilirsiniz. "default" ile "package private" es
		 * anlamlidir.
		 * 
		 * 4) public class member'lara herkes her yerden ulasabilir(farkli java projesi
		 * disinda).
		 * 
		 * 5) "protected" class member'lara ayni package icindeyseniz ulasabilirsiniz.
		 * Farkli package'de iseniz iki durum var : 
		 * 
		 * a)Child class iseniz
		 * ulasabilirsiniz. 
		 * b)Child class degil iseniz ulasamazsiniz.
		 * 
		 * 6) Class'larda da access modifier kullanilir. Ama sadece "public" ve
		 * "default" kullanilir. Class olustururken "private" veya "protected" access
		 *  modifier kullanilmaz.
		 * 
		 */

	}

}
