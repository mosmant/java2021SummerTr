package day17_NestedForLoopWhileLoop;

import java.util.Scanner;

public class C01_NestedForLoop01 {

	public static void main(String[] args) {
		// Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
		// asagidaki sekli cizdirin
		// *
		// * *
		// * * *
		// * * * *
		
		Scanner scan= new Scanner (System.in);
		System.out.println("L�tfen bir rakam giriniz.");
		int rakam = scan.nextInt();
		
		// mesela kullan�c� 5 girmi� olsun.
		for (int satirNo = 1; satirNo <= rakam; satirNo++) {
						// alt sat�ra ge�mek i�in.
			for (int i = 1; i <= satirNo; i++) {
				System.out.print("* ");
			}
			System.out.println("");	
		}
		

	}

}
