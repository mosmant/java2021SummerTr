package day39_exceptions;

import java.util.Scanner;

public class C01_Exceptions01_HH {

	public static void main(String[] args) {

		// kullan�c�dan alaca��n�z 2 tam say�n�n b�l�m�n� yazd�r�n�z.

		Scanner scan = new Scanner(System.in);

		int count = 1;
		while (count <= 3) {
			System.out.printf("2 tam say� giriniz: ");
			int sayi1 = scan.nextInt();
			int sayi2 = scan.nextInt();

			try {
				System.out.println("b�len: " + sayi1 / sayi2);
			} catch (ArithmeticException e) {
				System.err.println("b�lme i�leminde b�len 0 olamaz...");

				System.out.println(e.getMessage()); // / by zero handle edilecek veridir.
				e.printStackTrace(); // bu method hatan�n uzun halini verir bize. sat�r hatan�n ad�n� vs k�sacas�
										// hatan�n detay�n� verdi...
			}
			count++;
		}

		System.out.println("kod buraya kadar geldiyse kod sa�l�kl� �ekilde buraya gelmi�tir. yani run olmu�tur.");

	}

}
