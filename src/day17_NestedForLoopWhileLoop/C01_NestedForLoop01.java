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
		System.out.println("Lütfen bir rakam giriniz.");
		int rakam = scan.nextInt();
		
		// mesela kullanýcý 5 girmiþ olsun.
		for (int satirNo = 1; satirNo <= rakam; satirNo++) {
						// alt satýra geçmek için.
			for (int i = 1; i <= satirNo; i++) {
				System.out.print("* ");
			}
			System.out.println("");	
		}
		

	}

}
