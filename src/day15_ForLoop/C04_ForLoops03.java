package day15_ForLoop;

import java.util.Scanner;

public class C04_ForLoops03 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar
		//3’un kati olan sayilari yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("lütfen 100den küçük bir pozitif bir tamsayi giriniz: ");
		
		int sayi = scan.nextInt();
		
		for (int i = 1; i < sayi; i++) {
			if (i%3==0) {
				System.out.print(i+" ");
			}
			
		}scan.close();

	}

}
