package day15_ForLoop;

import java.util.Scanner;

public class Hw04 {

	public static void main(String[] args) {
		// Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama
		// gore
		// asagidaki sekli cizdirin

		// 1- ka�tan ba�layaca��z  ==> 1 den ba�layacak
		// 2- nereye kadar gidece�iz. ==> tan�mlanan say�ya kadar say� dahil.
		// 3- her ad�mda ne yapaca��z ve de�i�ken nas�l de�i�ecek... 

		Scanner scan = new Scanner(System.in);

		int sayi = scan.nextInt();
		System.out.println("l�tfen bir say� giriniz.");
		for (int i = 1; i <= sayi; i++) { 			// std for loop yazd�m.
			System.out.println(); 					// sat�r olu�turdum
			for (int j = 1; j <= i; j++) { 			// burada da y�ld�zlar� d�ng�deki i say�s�na g�re sat�rlara yanyana
													// yazd�rd�m.
				System.out.print("*");
			}
		}
		scan.close();

	}

}
