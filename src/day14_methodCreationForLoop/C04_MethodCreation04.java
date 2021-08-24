package day14_methodCreationForLoop;

import java.util.Scanner;

public class C04_MethodCreation04 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak
		// kredi karti numarasini alin.
		// Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde,
		// KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
		// duzelten 2 method yazin,
		// ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun.

		// mehmet MEHMET Mehmet MEHmet bu �ekilde de�il hepsi standart olmal�
		// Mehmet Bulutluoz 1234 1234 1234 1234 �eklinde olacak

		// 1 ben methoda ne g�nderece�im.
		// 2 method ne yapacak. return var m�? var cinsi string...
		// 3 method bize ne d�nd�recek..

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen �sminizi yaz�n:");
		String musteriIsmi = scan.next();
		musteriIsmi = ismiDuzelt(musteriIsmi); // burada atama yapmazsak sadece isim d�zeltme i�lemi kal�c� olmaz.
												// sadece method �al���r.
		System.out.println("L�tfen soy�sminizi yaz�n:");
		String musteriSoyIsmi = scan.next();
		musteriSoyIsmi = ismiDuzelt(musteriSoyIsmi); // buradaki methodu kullanarak soyismini de d�zeltebiliriz.
		System.out.println("L�tfen kredi kart numaran�z� arada bo�luk olamdan yaz�n:");
		String kkNo = scan.next();
		kkNo = kkNoDuzelt(kkNo);

		// buraya kadar her�ey �al��t� . burdan sonraki olay� yazd�r�p g�rmek i�in
		// yap�yoruz.
		
		System.out.println(musteriIsmi+" "+musteriSoyIsmi+ "\n"+kkNo);
		scan.close();
	}

	public static String kkNoDuzelt(String kkNo) {

		kkNo = kkNo.replace(" ", "");
		kkNo = kkNo.substring(0, 4) + " " + kkNo.substring(4, 8) + " " + kkNo.substring(8, 12) + " "
				+ kkNo.substring(12);
		return kkNo;
	}

	public static String ismiDuzelt(String musteriIsmi) {
		// bu methodun amac� kullan�c�n�n ismin nas�l yazarsa yazs�n
		// ilk harf buyuk olsun ba�ta ve sonda bo�luk varsa onlar� silsin.
		musteriIsmi = musteriIsmi.trim(); // burada atama yapmazsak kal�c� olmaz.
		musteriIsmi = musteriIsmi.substring(0, 1).toUpperCase() + // bu k�s�m ilk harfi ald� ve b�y�k harfe �evirdi
				musteriIsmi.substring(1).toLowerCase(); // bu k�s�mda ilk harf harici k���k

		// m��teri isiminde yapt���m de�i�iklikeri main methoda g�nderebilmek i�in
		// return type � vo�d yerine
		// variable in data turune uygun bir �ekilde d�nd�rmeliyiz.
		return musteriIsmi;

	}

}
