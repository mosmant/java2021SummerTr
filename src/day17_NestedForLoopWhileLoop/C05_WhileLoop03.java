package day17_NestedForLoopWhileLoop;

import java.util.Scanner;

public class C05_WhileLoop03 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden
		// baslayip
		// bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
		// Kullanicinin hata yapmadigini farz edin.
		
		// ilk ve son harfi kullanýcýdan aldýk. mümkün olduðunca bunlarý deðiþtirmeyin.
		// kodun ilerleyen kýsýmlarýnda bunlarý kullanmanýz gerekebilir.
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen baþlagýç HARFÝ giriniz");
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		System.out.println("Lütfen bitiþ HARFÝ giriniz");
		char sonHarf = scan.next().toUpperCase().charAt(0);
		
		char harf = ilkHarf;
		
		while (harf<=sonHarf) {
			System.out.print(harf+" ");
			harf++;
		}
		scan.close();
	}

}
