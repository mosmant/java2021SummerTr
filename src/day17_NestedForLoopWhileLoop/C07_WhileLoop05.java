package day17_NestedForLoopWhileLoop;

import java.util.Scanner;

public class C07_WhileLoop05 {

	public static void main(String[] args) {
		// Kullan�c�dan toplamak �zere sayi isteyiniz.
		// Toplam 200 oluncaya kadar say� istemeye devam edin.
		// Toplam 200 � ge�ti�inde kullan�c�n�n ka� say� giridi�i ve bu say�lar�n
		// toplam�n�n ka� oldu�unu yazd�r�n.

		// ** for loopta bir i�lem yapabilmek i�in tekrar say�s�n� bilmek laz�m
		// ** while loopta ad�m say�s� �nemli de�il bitirme ko�ulu �nemlidir.

		Scanner scan = new Scanner(System.in);

		int sayi = 0;
		int toplam = 0;
		int sayac = 0;

		while (toplam < 200) {
			System.out.print("L�tfen toplamak i�in bir tamsayi giriniz: ");
			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;
		}// toplam bu k�s�mdan sonra 200 � gececek.
		System.out.println("toplam "+sayac+" adet sayi girdiniz.\nRakamlar toplam� : "+toplam);

	}		// *** e�er ad�m say�s� bilinemiyor veya �ng�r�lemiyorsa for loop de�il de while loop kullanmak daha mantiklidir.
			// e�er ad�mlar belli ise for loop kullanmak daha mantikli olabilir.iki sat�r yazmaktan veya de�i�imi unutup sonsuz loopa girmekten kurtulmu� oluruz.

}
