package day39_exceptions;

import java.util.Scanner;

public class C01_Exceptions01_HH {

	public static void main(String[] args) {

		// kullanýcýdan alacaðýnýz 2 tam sayýnýn bölümünü yazdýrýnýz.

		Scanner scan = new Scanner(System.in);

		int count = 1;
		while (count <= 3) {
			System.out.printf("2 tam sayý giriniz: ");
			int sayi1 = scan.nextInt();
			int sayi2 = scan.nextInt();

			try {
				System.out.println("bölen: " + sayi1 / sayi2);
			} catch (ArithmeticException e) {
				System.err.println("bölme iþleminde bölen 0 olamaz...");

				System.out.println(e.getMessage()); // / by zero handle edilecek veridir.
				e.printStackTrace(); // bu method hatanýn uzun halini verir bize. satýr hatanýn adýný vs kýsacasý
										// hatanýn detayýný verdi...
			}
			count++;
		}

		System.out.println("kod buraya kadar geldiyse kod saðlýklý þekilde buraya gelmiþtir. yani run olmuþtur.");

	}

}
