package day17_NestedForLoopWhileLoop;

import java.util.Scanner;

public class C05_WhileLoop03 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden
		// baslayip
		// bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
		// Kullanicinin hata yapmadigini farz edin.
		
		// ilk ve son harfi kullan�c�dan ald�k. m�mk�n oldu�unca bunlar� de�i�tirmeyin.
		// kodun ilerleyen k�s�mlar�nda bunlar� kullanman�z gerekebilir.
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen ba�lag�� HARF� giriniz");
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		System.out.println("L�tfen biti� HARF� giriniz");
		char sonHarf = scan.next().toUpperCase().charAt(0);
		
		char harf = ilkHarf;
		
		while (harf<=sonHarf) {
			System.out.print(harf+" ");
			harf++;
		}
		scan.close();
	}

}
