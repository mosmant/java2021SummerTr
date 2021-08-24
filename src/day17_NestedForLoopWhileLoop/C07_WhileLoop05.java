package day17_NestedForLoopWhileLoop;

import java.util.Scanner;

public class C07_WhileLoop05 {

	public static void main(String[] args) {
		// Kullanýcýdan toplamak üzere sayi isteyiniz.
		// Toplam 200 oluncaya kadar sayý istemeye devam edin.
		// Toplam 200 ü geçtiðinde kullanýcýnýn kaç sayý giridiði ve bu sayýlarýn
		// toplamýnýn kaç olduðunu yazdýrýn.

		// ** for loopta bir iþlem yapabilmek için tekrar sayýsýný bilmek lazým
		// ** while loopta adým sayýsý önemli deðil bitirme koþulu önemlidir.

		Scanner scan = new Scanner(System.in);

		int sayi = 0;
		int toplam = 0;
		int sayac = 0;

		while (toplam < 200) {
			System.out.print("Lütfen toplamak için bir tamsayi giriniz: ");
			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;
		}// toplam bu kýsýmdan sonra 200 ü gececek.
		System.out.println("toplam "+sayac+" adet sayi girdiniz.\nRakamlar toplamý : "+toplam);

	}		// *** eðer adým sayýsý bilinemiyor veya öngörülemiyorsa for loop deðil de while loop kullanmak daha mantiklidir.
			// eðer adýmlar belli ise for loop kullanmak daha mantikli olabilir.iki satýr yazmaktan veya deðiþimi unutup sonsuz loopa girmekten kurtulmuþ oluruz.

}
