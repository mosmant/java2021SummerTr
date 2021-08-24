package day14_methodCreationForLoop;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
		// Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin
		// ve sayilarin toplamini yazdirin.
		// Kullanici toplamak istedigi sayi adedini 4�den buyuk girerse �Cok sayi girdiniz, ben toplayamam� yazdirin.
		// say�lar� methodda almaya karar verdik.
		// methodlarda sorular
		// 1 ben methoda ne g�nderece�im.
		// 2 method ne yapacak. bu soruda kullan�c�dan 2 say� alacak ve onu yazd�racak.gibi...
		// 3 method bize ne d�nd�recek..
		
		
		
		Scanner scan= new Scanner (System.in);
		System.out.print("Ka� say� toplamak istesiniz:");
		int sayiAdedi = scan.nextInt();
		
		if (sayiAdedi<2) {
			System.out.println("toplama i�lemi i�in en az 2 say� giriniz.");
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
		Scanner scan= new Scanner (System.in); // main methodda kullan�lan scanner objesi sadece main mthodu 
		System.out.println("l�tfen 4 tam say� giriniz");// methodda kullan�lan scanner objesi methodda i�e yarar.
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		int sayi3= scan.nextInt();
		int sayi4= scan.nextInt();
		
		System.out.println("d�rt say� girmeyi tercih ettiniz \ngirdi�iniz d�rt say�n�n toplam�:" + (sayi1+sayi2+sayi3+sayi4));
		scan.close();
	}

	private static void ucSayiTopla() {
		Scanner scan= new Scanner (System.in); // main methodda kullan�lan scanner objesi sadece main mthodu 
		System.out.println("l�tfen 3 tam say� giriniz");// methodda kullan�lan scanner objesi methodda i�e yarar.
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		int sayi3= scan.nextInt();
		System.out.println("�� say� girmeyi tercih ettiniz \ngirdi�iniz 3 say�n�n toplam�:" + (sayi1+sayi2+sayi3));
		scan.close();
	}

	public static void ikiSayiTopla() {
		Scanner scan= new Scanner (System.in); // main methodda kullan�lan scanner objesi sadece main mthodu 
		System.out.println("l�tfen 2 tam say� giriniz");// methodda kullan�lan scanner objesi methodda i�e yarar.
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		
		System.out.println("iki say� girmeyi tercih ettiniz \ngirdi�iniz iki say�n�n toplam�:" + (sayi1+sayi2));
		scan.close();
	}
	

}
