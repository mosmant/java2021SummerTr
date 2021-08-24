package day30_dateTime;

import java.time.LocalDate;

public class C05_ComparingDateAndTime {

	public static void main(String[] args) {

		LocalDate bugun = LocalDate.now(); // bunları oluşturdum formatlarını düzenlemek için
		
		LocalDate date = LocalDate.of(2020, 11, 15);
		LocalDate date1 = LocalDate.of(2021, 11, 15);
		
		// BUNLARIN FARKLARINI BULACAĞIZ
		
		int fark = bugun.compareTo(date);
		int fark1 = bugun.compareTo(date1);
		System.out.println(bugun); // 2021-08-02
		System.out.println(date);  // 2020-11-15
		
		System.out.println(fark);  // output : 1   ==> karşılaştırılan iki tarihin en büyük parçasının farkını verir.
		System.out.println(fark1); // output : -3  ==> yıl aynı olduğu için aylara bakar. aralarda 3 ay var
		
		// bunların kullanım yerleri bilet kesim yerleri vs...
	}

}
