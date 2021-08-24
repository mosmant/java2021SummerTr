package day18_DoWhileLoopScope;

import java.util.Scanner;

public class C02_DoWhileLoop01 {

	public static void main(String[] args) {
		//// Kullanicidan iki pozitif sayi isteyin
		// kullanici negatif sayi girdiginde
		// girilen negatif sayilari yok sayip, yeniden deger isteyin
		// kullanici dogru giris yaptiginda "well done" ve sayilarin carpini yazdirin

		/*
		 * Fark : While Loop, dongunun baþlangýcýnda kosulu kontrol eder ve kosul
		 * saglanirsa body icindeki kodlari calistirir. 
		 * Do-while loop’ta ise , kosul body icerisindeki kodlar 1 kere calistiktan sonra kontrol edilir.
		 * 
		 * Sonuc : Bir while loop’daki kosul yanlýssa, loop hic caismaz ‘do-wile loop’ta ise , kosul yanlissa kodlar 1 kere calisir
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen iki pozitif tamsayi giriniz");

		int sayi1 = 5;			// bunlarý yazmaya gerek yok artýk. bunlar while loopta ilk koþulu saðlamak için yazdýk.
		int sayi2 = 10;

		do {

			sayi1 = scan.nextInt();
			sayi2 = scan.nextInt();
			if (sayi1 > 0 && sayi2 > 0) {
				System.out.println("well done \ngirilen sayilarin carpimi : " + (sayi1 * sayi2));
			} else {
				System.out.println("lutfen pozitif iki sayi giriniz");
			}

		} while (!(sayi1 > 0 && sayi2 > 0));

		scan.close();

	}

}
