package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_Exceptions04_HH {

	public static void main(String[] args) {
		// outer try block dosya yerinde mi diye kontrol etti
		try {// burada dosyanýn yerinde mi yoksa deðil mi diye kontrol ediyoruz.
			FileInputStream fis = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\java2021SummerTr\\src\\day39_exceptions\\file");
			// fis objesi file dosyasýnýn pathini input ediyor.
			// try catch i neden kullanýyoruz. ya dosyayý yerinde bulamazsak diyoruz.
		
		int i =0;
		
		// inner try catch block file dosyasýnýn içinde okudu 
		try {
			while ((i=fis.read())!=-1) { // burada fis dosyasýndaki tüm characterleri okuyor. -1 ise hiçliðin ascii deðeridir.
				// (i=fis.read())!=-1 deðilse while loop u çalýþtýr diyor.
				// hocam eger bi char degeri bulmazsa sonuç -1 olacak ya Zeki Önder cevabý:)
				System.out.print((char)i);
			}
			
		} catch (IOException e) { // burada I input O output exceptions ý temsil eder.
			System.out.println(e.getMessage());
			e.printStackTrace();// bu mesaj uzun çok kullanýlýr handle kolaylýðý saðlar.
		}
		
		}
		
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("\n");
			
			e.printStackTrace(); 
			
		}
	}

}
