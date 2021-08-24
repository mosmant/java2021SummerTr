package day14_methodCreationForLoop;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
		// Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin
		// ve sayilarin toplamini yazdirin.
		// Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.
		// sayýlarý methodda almaya karar verdik.
		// methodlarda sorular
		// 1 ben methoda ne göndereceðim.
		// 2 method ne yapacak. bu soruda kullanýcýdan 2 sayý alacak ve onu yazdýracak.gibi...
		// 3 method bize ne döndürecek..
		
		
		
		Scanner scan= new Scanner (System.in);
		System.out.print("Kaç sayý toplamak istesiniz:");
		int sayiAdedi = scan.nextInt();
		
		if (sayiAdedi<2) {
			System.out.println("toplama iþlemi için en az 2 sayý giriniz.");
		}else if (sayiAdedi == 2 ) {
			ikiSayiTopla();
		}else if (sayiAdedi == 3 ) {
			ucSayiTopla();
		}else if (sayiAdedi == 4 ) {
			dortSayiTopla();
		}else {
			System.out.println("Cok sayi girdiniz, ben toplayamam");
		}scan.close();
		
	}

	private static void dortSayiTopla() {
		Scanner scan= new Scanner (System.in); // main methodda kullanýlan scanner objesi sadece main mthodu 
		System.out.println("lðtfen 4 tam sayý giriniz");// methodda kullanýlan scanner objesi methodda iþe yarar.
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		int sayi3= scan.nextInt();
		int sayi4= scan.nextInt();
		
		System.out.println("dört sayý girmeyi tercih ettiniz \ngirdiðiniz dört sayýnýn toplamý:" + (sayi1+sayi2+sayi3+sayi4));
		scan.close();
	}

	private static void ucSayiTopla() {
		Scanner scan= new Scanner (System.in); // main methodda kullanýlan scanner objesi sadece main mthodu 
		System.out.println("lðtfen 3 tam sayý giriniz");// methodda kullanýlan scanner objesi methodda iþe yarar.
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		int sayi3= scan.nextInt();
		System.out.println("üç sayý girmeyi tercih ettiniz \ngirdiðiniz 3 sayýnýn toplamý:" + (sayi1+sayi2+sayi3));
		scan.close();
	}

	public static void ikiSayiTopla() {
		Scanner scan= new Scanner (System.in); // main methodda kullanýlan scanner objesi sadece main mthodu 
		System.out.println("lðtfen 2 tam sayý giriniz");// methodda kullanýlan scanner objesi methodda iþe yarar.
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		
		System.out.println("iki sayý girmeyi tercih ettiniz \ngirdiðiniz iki sayýnýn toplamý:" + (sayi1+sayi2));
		scan.close();
	}
	

}
