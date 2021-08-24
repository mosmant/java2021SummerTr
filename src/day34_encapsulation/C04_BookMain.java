package day34_encapsulation;

import java.util.Scanner;

public class C04_BookMain {

	public static void main(String[] args) {
		C03_Book kitap = new C03_Book();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("son okudugunuz kitabi giriniz  : ");
		
		String kitap2 = scan.nextLine();
		kitap.setBookName("calikusu");
		kitap.setAuthorName(kitap2);
		
		System.out.println("1. kiatabim :" + kitap.getBookName() + " ikinci kiatabim : " + kitap.getAuthorName());

	}

}
