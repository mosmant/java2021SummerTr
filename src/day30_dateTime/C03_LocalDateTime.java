package day30_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("akt�el tarih ve zaman : "+ ldt);
		
		LocalDate d = LocalDate.of(2016, 1, 10); // burada bir date olu�turdum ad�na da "d" koydum
		System.out.println(d); // 2016-01-10
		
		LocalTime t = LocalTime.of(13, 30);      // burada bir tarih olu�turdum ad�na da "t" koydum
		System.out.println(t); // 13:30
		
		LocalDateTime ldt1 = LocalDateTime.of(d, t);  // burada da date time olu�turdum bunlar� tan�mlad���m "d" ve "t" birle�tirdim.
		System.out.println(ldt1); //2016-01-10T13:30 ayr� ayr� zaman ve tarihi birle�tirdik.
		
		System.out.println(ldt.getHour()); // sistemde saat 22.04 oldu�u i�in saati getirdi o da 22.

	}

}
