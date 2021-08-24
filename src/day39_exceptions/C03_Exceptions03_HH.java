package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C03_Exceptions03_HH {

	public static void main(String[] args) {
		
		try {// burada dosyan�n yerinde mi yoksa de�il mi diye kontrol ediyoruz.
			FileInputStream fis = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\java2021SummerTr\\src\\day39_exceptions\\file");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace(); // bu mesaj �ok uzun oldu�u i�in kullanmad�k
			
		}
		
		System.out.println("****ARADI�IN FILE YER�NDE****");
		System.out.println("kod buraya kadar geldiyse kod sa�l�kl� �ekilde buraya gelmi�tir. yani run olmu�tur.");
	}

}
