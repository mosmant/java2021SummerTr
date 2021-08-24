package day17_NestedForLoopWhileLoop;

import java.util.Scanner;

public class C01_NestedForLoop02 {

	public static void main(String[] args) {
		// Soru 13 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim tablosu olusturun. Ornek,kullanici 3 girerse,
		// 1 2 3
		// 2 4 6
		// 3 6 9
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen pozitif bir tam sayý giriniz.");
		
		int rakam = scan.nextInt();
		
		for (int satirNo = 1; satirNo <= rakam; satirNo++) {  // satýr oluþturuyoruz
			for (int i = 1; i <= rakam; i++) {				  // satýrlarý dolduruyorum
				System.out.print(satirNo*i+" ");			  // burasý da doldurduðumuz satýrlarýn valuelarýný oluþtruyoruz.
			}
			System.out.println("");							  // burada 1 satýr alta geçiyoruz.(bunu yapmazsak her veriyi yan yana yazdýrýr.
		}
	}

}
