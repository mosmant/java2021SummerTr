package day17_NestedForLoopWhileLoop;

import java.util.Scanner;

public class C01_NestedForLoop02 {

	public static void main(String[] args) {
		// Soru 13 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim tablosu olusturun. Ornek,kullanici 3 girerse,
		// 1 2 3
		// 2 4 6
		// 3 6 9
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("L�tfen pozitif bir tam say� giriniz.");
		
		int rakam = scan.nextInt();
		
		for (int satirNo = 1; satirNo <= rakam; satirNo++) {  // sat�r olu�turuyoruz
			for (int i = 1; i <= rakam; i++) {				  // sat�rlar� dolduruyorum
				System.out.print(satirNo*i+" ");			  // buras� da doldurdu�umuz sat�rlar�n valuelar�n� olu�truyoruz.
			}
			System.out.println("");							  // burada 1 sat�r alta ge�iyoruz.(bunu yapmazsak her veriyi yan yana yazd�r�r.
		}
	}

}
