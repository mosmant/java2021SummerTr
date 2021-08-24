package day30_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {
		LocalDate tarih = LocalDate.now(); // tarih isminde obje create ettik. trick : new keywordu kullanýlmaz. now bugunu kullanýr.
		// local olarak hesaplama yapmak için. saat dilimini sistemden alýr.
		System.out.println("Bugünün tarihi : " + tarih); // 2021-08-02

		System.out.println("Bugünden 21 gün sonrasý : " + tarih.plusDays(21)); // bugunden 21 gün sonrasý // 2021-08-23

		System.out.println("Bugünden 3 yýl sonrasý : " + tarih.plusYears(3)); // bugunden 3 yýl sonrasý // 2024-08-02
		
		System.out.println("Bugunden 3 gün 5 ay ve 2 yýl sonrasý : "+ tarih.plusDays(3).plusMonths(5).plusYears(2)); // 2024-01-05
		
		System.out.println("Bugunden 40 gün öncesi : "+ tarih.minusDays(40)); // bugunden 40 gün öncesi // 2024-01-05
		
		System.out.println("Bugünden 5 yýl öncesi 2 ay sonrasý 3 hafta öncesi : "+ tarih.minusYears(5).plusMonths(2).plusWeeks(3)); 
																				// 2016-10-23
		
		// LocalDate classýnda üretilen objelerin method chainleri homojen olmak zorunda deðil. 
		// yani sürekli artmak ya da sürekli azalmasý gerekmez. plus olunca artarken minus olunca azalýr. 
		// karýþýk olarakta kullanýlabilir. 
		
		System.out.println(tarih.getDayOfMonth()); // output : 2 ayýn 2. günü
		
		System.out.println(tarih.getDayOfWeek()); // output : MONDAY  haftanýn hangi günü
		
		System.out.println(tarih.getMonth()); // output : AUGUST
		
		System.out.println(tarih.getMonthValue()); // output : 8 deðer int
		
		LocalDate dogumGunu = LocalDate.of(1989, 4, 7);
		
		System.out.println("Doðum tarihi : "+dogumGunu); // 1989-04-07
		
		System.out.println("Hangi gün : "+dogumGunu.getDayOfWeek() ); // Hangi gün : FRIDAY
	
		System.out.println(tarih.isAfter(dogumGunu)); // bugunki tarih doðm günümden sonra mýdýr output : true
		
		System.out.println(tarih.isBefore(dogumGunu)); // bugunki tarih doðm günümden önce mýdýr output : true
		
		System.out.println("Bugün artýk yýl mýdýr : "+ tarih.isLeapYear()); // false
		

	}

}
