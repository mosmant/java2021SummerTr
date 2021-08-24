package day30_dateTime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

	public static void main(String[] args) {
		LocalDate bugun = LocalDate.now();  // bunlar� olu�turdum formatlar�n� d�zenlemek i�in
		LocalDate date = LocalDate.of(2020, 11, 15);
		
		// istedi�imiz gibi yazd�rmak i�in DateFormat � kullan�yoruz.  FORMATLARI KULLANACA�IZ.
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yy");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yy");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd$M$yyy");  // 3 yada 4 y yazmas� �nemli de�il
		
		System.out.println(dtf.format(bugun));  // M b�y�k olacak - ay tek basamakl� *** 02/8/21
		System.out.println(dtf1.format(date));  // burada ay 2 basamakl�  *** 15/11/20
		System.out.println(dtf2.format(bugun));	// burada ay� isim olarak al�yor *** 02/A�u/21
		System.out.println(dtf3.format(date));  // burada y�l� 4 basamkl� yazd� *** 15$11$2020
		
		 /*
         * yy: YILIN SON iKi RAKAMI
         * yyyy : y�l�n tamam�n�
         * y : y�l�n tamam�n�
         * M : ay s�ras�n� verir TEMMUZ i�in : 7
         * MM:  ay s�ras�n� veriri TEMMUZ i�in : 07
         * MMM . ay isminin ilkuc harfini verir. JUL
         * MMMM : ay isminin tamam�n� verir
         */
		
		
		// KA� YA�INDAYIZ HESAPLAMA  ==> PERIOD methodu ile
		
		LocalDate dt=LocalDate.of(1989, 4, 7);
		System.out.println("Bug�n�n tarihi :"+ bugun);
		System.out.println("Benim do�um tarihim : "+ dt);
		Period yasim = Period.between(dt, bugun);
		System.out.println("Ya��m : "+yasim);//Ya��m : P32Y3M26D
		System.out.println("Ka� y�l : "+yasim.getYears()); // Ka� y�l : 32
		System.out.println("ka� ay : " +yasim.getMonths()); // ka� ay : 3
		System.out.println("ka� g�n : "+yasim.getDays()); // ka� g�n : 26
		
		
	}

}
