package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C03_Exceptions03_HH {

	public static void main(String[] args) {
		
		try {// burada dosyanýn yerinde mi yoksa deðil mi diye kontrol ediyoruz.
			FileInputStream fis = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\java2021SummerTr\\src\\day39_exceptions\\file");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace(); // bu mesaj çok uzun olduðu için kullanmadýk
			
		}
		
		System.out.println("****ARADIÐIN FILE YERÝNDE****");
		System.out.println("kod buraya kadar geldiyse kod saðlýklý þekilde buraya gelmiþtir. yani run olmuþtur.");
	}

}
