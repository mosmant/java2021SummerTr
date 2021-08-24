package day15_ForLoop;

import java.util.Scanner;

public class HW01_Faktoryel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("10'den kucuk bir sayi giriniz: ");
		int sayi = scan.nextInt();
		int faktoriyel = 1;

		System.out.print(sayi + "!="); // buras� 5!= yazabilmek i�in
		for (int i = 1; i <= sayi; i++) {

			faktoriyel = faktoriyel * i; // buras� sonucu bulduran for d�ng�s�
			System.out.print(i); // her d�ng�den sonra say�y� yazd�racak. 
			if (i != sayi) {	//e�er say� sayaca de�eri i ye e�it de�ilse * yazd�racak. 
				System.out.print("*");
			}
		}
		System.out.println("=" + faktoriyel);
	scan.close();
	}

}
