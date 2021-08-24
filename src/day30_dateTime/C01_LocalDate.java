package day30_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {
		LocalDate tarih = LocalDate.now(); // tarih isminde obje create ettik. trick : new keywordu kullan�lmaz. now bugunu kullan�r.
		// local olarak hesaplama yapmak i�in. saat dilimini sistemden al�r.
		System.out.println("Bug�n�n tarihi : " + tarih); // 2021-08-02

		System.out.println("Bug�nden 21 g�n sonras� : " + tarih.plusDays(21)); // bugunden 21 g�n sonras� // 2021-08-23

		System.out.println("Bug�nden 3 y�l sonras� : " + tarih.plusYears(3)); // bugunden 3 y�l sonras� // 2024-08-02
		
		System.out.println("Bugunden 3 g�n 5 ay ve 2 y�l sonras� : "+ tarih.plusDays(3).plusMonths(5).plusYears(2)); // 2024-01-05
		
		System.out.println("Bugunden 40 g�n �ncesi : "+ tarih.minusDays(40)); // bugunden 40 g�n �ncesi // 2024-01-05
		
		System.out.println("Bug�nden 5 y�l �ncesi 2 ay sonras� 3 hafta �ncesi : "+ tarih.minusYears(5).plusMonths(2).plusWeeks(3)); 
																				// 2016-10-23
		
		// LocalDate class�nda �retilen objelerin method chainleri homojen olmak zorunda de�il. 
		// yani s�rekli artmak ya da s�rekli azalmas� gerekmez. plus olunca artarken minus olunca azal�r. 
		// kar���k olarakta kullan�labilir. 
		
		System.out.println(tarih.getDayOfMonth()); // output : 2 ay�n 2. g�n�
		
		System.out.println(tarih.getDayOfWeek()); // output : MONDAY  haftan�n hangi g�n�
		
		System.out.println(tarih.getMonth()); // output : AUGUST
		
		System.out.println(tarih.getMonthValue()); // output : 8 de�er int
		
		LocalDate dogumGunu = LocalDate.of(1989, 4, 7);
		
		System.out.println("Do�um tarihi : "+dogumGunu); // 1989-04-07
		
		System.out.println("Hangi g�n : "+dogumGunu.getDayOfWeek() ); // Hangi g�n : FRIDAY
	
		System.out.println(tarih.isAfter(dogumGunu)); // bugunki tarih do�m g�n�mden sonra m�d�r output : true
		
		System.out.println(tarih.isBefore(dogumGunu)); // bugunki tarih do�m g�n�mden �nce m�d�r output : true
		
		System.out.println("Bug�n art�k y�l m�d�r : "+ tarih.isLeapYear()); // false
		

	}

}
