package day30_dateTime;

import java.time.LocalDate;

public class C05_ComparingDateAndTime {

	public static void main(String[] args) {

		LocalDate bugun = LocalDate.now(); // bunlar� olu�turdum formatlar�n� d�zenlemek i�in
		
		LocalDate date = LocalDate.of(2020, 11, 15);
		LocalDate date1 = LocalDate.of(2021, 11, 15);
		
		// BUNLARIN FARKLARINI BULACA�IZ
		
		int fark = bugun.compareTo(date);
		int fark1 = bugun.compareTo(date1);
		System.out.println(bugun); // 2021-08-02
		System.out.println(date);  // 2020-11-15
		
		System.out.println(fark);  // output : 1   ==> kar��la�t�r�lan iki tarihin en b�y�k par�as�n�n fark�n� verir.
		System.out.println(fark1); // output : -3  ==> y�l ayn� oldu�u i�in aylara bakar. aralarda 3 ay var
		
		// bunlar�n kullan�m yerleri bilet kesim yerleri vs...
	}

}
