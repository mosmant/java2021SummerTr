package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_Exceptions04_HH {

	public static void main(String[] args) {
		// outer try block dosya yerinde mi diye kontrol etti
		try {// burada dosyan�n yerinde mi yoksa de�il mi diye kontrol ediyoruz.
			FileInputStream fis = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\java2021SummerTr\\src\\day39_exceptions\\file");
			// fis objesi file dosyas�n�n pathini input ediyor.
			// try catch i neden kullan�yoruz. ya dosyay� yerinde bulamazsak diyoruz.
		
		int i =0;
		
		// inner try catch block file dosyas�n�n i�inde okudu 
		try {
			while ((i=fis.read())!=-1) { // burada fis dosyas�ndaki t�m characterleri okuyor. -1 ise hi�li�in ascii de�eridir.
				// (i=fis.read())!=-1 de�ilse while loop u �al��t�r diyor.
				// hocam eger bi char degeri bulmazsa sonu� -1 olacak ya Zeki �nder cevab�:)
				System.out.print((char)i);
			}
			
		} catch (IOException e) { // burada I input O output exceptions � temsil eder.
			System.out.println(e.getMessage());
			e.printStackTrace();// bu mesaj uzun �ok kullan�l�r handle kolayl��� sa�lar.
		}
		
		}
		
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("\n");
			
			e.printStackTrace(); 
			
		}
	}

}
