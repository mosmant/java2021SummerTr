package day15_ForLoop;

import java.util.Scanner;

public class Hw04 {

	public static void main(String[] args) {
		// Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama
		// gore
		// asagidaki sekli cizdirin

		// 1- kaçtan baþlayacaðýz  ==> 1 den baþlayacak
		// 2- nereye kadar gideceðiz. ==> tanýmlanan sayýya kadar sayý dahil.
		// 3- her adýmda ne yapacaðýz ve deðiþken nasýl deðiþecek... 

		Scanner scan = new Scanner(System.in);

		int sayi = scan.nextInt();
		System.out.println("lütfen bir sayý giriniz.");
		for (int i = 1; i <= sayi; i++) { 			// std for loop yazdým.
			System.out.println(); 					// satýr oluþturdum
			for (int j = 1; j <= i; j++) { 			// burada da yýldýzlarý döngüdeki i sayýsýna göre satýrlara yanyana
													// yazdýrdým.
				System.out.print("*");
			}
		}
		scan.close();

	}

}
