package day15_ForLoop;

import java.util.Scanner;

public class HW01_Faktoryel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("10'den kucuk bir sayi giriniz: ");
		int sayi = scan.nextInt();
		int faktoriyel = 1;

		System.out.print(sayi + "!="); // burasý 5!= yazabilmek için
		for (int i = 1; i <= sayi; i++) {

			faktoriyel = faktoriyel * i; // burasý sonucu bulduran for döngüsü
			System.out.print(i); // her döngüden sonra sayýyý yazdýracak. 
			if (i != sayi) {	//eðer sayý sayaca deðeri i ye eþit deðilse * yazdýracak. 
				System.out.print("*");
			}
		}
		System.out.println("=" + faktoriyel);
	scan.close();
	}

}
