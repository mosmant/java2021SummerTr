package day30_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("aktüel tarih ve zaman : "+ ldt);
		
		LocalDate d = LocalDate.of(2016, 1, 10); // burada bir date oluþturdum adýna da "d" koydum
		System.out.println(d); // 2016-01-10
		
		LocalTime t = LocalTime.of(13, 30);      // burada bir tarih oluþturdum adýna da "t" koydum
		System.out.println(t); // 13:30
		
		LocalDateTime ldt1 = LocalDateTime.of(d, t);  // burada da date time oluþturdum bunlarý tanýmladýðým "d" ve "t" birleþtirdim.
		System.out.println(ldt1); //2016-01-10T13:30 ayrý ayrý zaman ve tarihi birleþtirdik.
		
		System.out.println(ldt.getHour()); // sistemde saat 22.04 olduðu için saati getirdi o da 22.

	}

}
