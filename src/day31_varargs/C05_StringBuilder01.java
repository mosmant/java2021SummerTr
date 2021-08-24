package day31_varargs;

public class C05_StringBuilder01 {

	public static void main(String[] args) {
		String str = "sabah nur";

		concat(str); // burada yaptýðýmýz iþlemle soyad ekledim
		System.out.println(str);// burada Stringe ekleme yapamayýz immutable olduðu için.

		/*
		 * 1) String Class’i immutable(Degistirilemez)dir. Java mutable Stringler
		 * uretebilmemiz icin StringBuilder class’i uretmistir. 2) Java’da StringBuilder
		 * ile hemen hemen ayni isi yapan birde StringBuffer clasi vardir.
		 * “StringBuffer” Class’i StringBuilder Class’indan daha once uretilmistir.
		 * “StringBuffer” yavas calisan bir class’dir, “StringBuilder” ise hizli
		 * calisir. “StringBuffer” “synchronize” islemlerini yapabilir, ama
		 * “StringBuilder” yapamaz. 3) Ayni anda bir cok isin yapilmasina “multi
		 * threading” denir. “multi” = Cok, “thread”= Yapilan islerin herbiri Multi
		 * threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina
		 * “synchronization” denir.
		 * 
		 * 
		 * String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun
		 * degildir. Bunun iki sebebi vardir: 1) Java pass-by-value kullanir 2) String
		 * Class'i immutable Class'dir.
		 */

	}

	private static void concat(String str) {
		System.out.println(str + " daðtekin");

	}

}
