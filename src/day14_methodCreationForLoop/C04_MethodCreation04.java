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

		// mehmet MEHMET Mehmet MEHmet bu þekilde deðil hepsi standart olmalý
		// Mehmet Bulutluoz 1234 1234 1234 1234 þeklinde olacak

		// 1 ben methoda ne göndereceðim.
		// 2 method ne yapacak. return var mý? var cinsi string...
		// 3 method bize ne döndürecek..

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Ýsminizi yazýn:");
		String musteriIsmi = scan.next();
		musteriIsmi = ismiDuzelt(musteriIsmi); // burada atama yapmazsak sadece isim düzeltme iþlemi kalýcý olmaz.
												// sadece method çalýþýr.
		System.out.println("Lütfen soyÝsminizi yazýn:");
		String musteriSoyIsmi = scan.next();
		musteriSoyIsmi = ismiDuzelt(musteriSoyIsmi); // buradaki methodu kullanarak soyismini de düzeltebiliriz.
		System.out.println("Lütfen kredi kart numaranýzý arada boþluk olamdan yazýn:");
		String kkNo = scan.next();
		kkNo = kkNoDuzelt(kkNo);

		// buraya kadar herþey çalýþtý . burdan sonraki olayý yazdýrýp görmek için
		// yapýyoruz.
		
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
		// bu methodun amacý kullanýcýnýn ismin nasýl yazarsa yazsýn
		// ilk harf buyuk olsun baþta ve sonda boþluk varsa onlarý silsin.
		musteriIsmi = musteriIsmi.trim(); // burada atama yapmazsak kalýcý olmaz.
		musteriIsmi = musteriIsmi.substring(0, 1).toUpperCase() + // bu kýsým ilk harfi aldý ve büyük harfe çevirdi
				musteriIsmi.substring(1).toLowerCase(); // bu kýsýmda ilk harf harici küçük

		// müþteri isiminde yaptýðým deðiþiklikeri main methoda gönderebilmek için
		// return type ý voþd yerine
		// variable in data turune uygun bir þekilde döndürmeliyiz.
		return musteriIsmi;

	}

}
