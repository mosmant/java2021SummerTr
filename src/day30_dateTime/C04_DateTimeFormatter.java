package day30_dateTime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

	public static void main(String[] args) {
		LocalDate bugun = LocalDate.now();  // bunlarý oluþturdum formatlarýný düzenlemek için
		LocalDate date = LocalDate.of(2020, 11, 15);
		
		// istediðimiz gibi yazdýrmak için DateFormat ý kullanýyoruz.  FORMATLARI KULLANACAÐIZ.
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yy");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yy");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd$M$yyy");  // 3 yada 4 y yazmasý önemli deðil
		
		System.out.println(dtf.format(bugun));  // M büyük olacak - ay tek basamaklý *** 02/8/21
		System.out.println(dtf1.format(date));  // burada ay 2 basamaklý  *** 15/11/20
		System.out.println(dtf2.format(bugun));	// burada ayý isim olarak alýyor *** 02/Aðu/21
		System.out.println(dtf3.format(date));  // burada yýlý 4 basamklý yazdý *** 15$11$2020
		
		 /*
         * yy: YILIN SON iKi RAKAMI
         * yyyy : yýlýn tamamýný
         * y : yýlýn tamamýný
         * M : ay sýrasýný verir TEMMUZ için : 7
         * MM:  ay sýrasýný veriri TEMMUZ için : 07
         * MMM . ay isminin ilkuc harfini verir. JUL
         * MMMM : ay isminin tamamýný verir
         */
		
		
		// KAÇ YAÞINDAYIZ HESAPLAMA  ==> PERIOD methodu ile
		
		LocalDate dt=LocalDate.of(1989, 4, 7);
		System.out.println("Bugünün tarihi :"+ bugun);
		System.out.println("Benim doðum tarihim : "+ dt);
		Period yasim = Period.between(dt, bugun);
		System.out.println("Yaþým : "+yasim);//Yaþým : P32Y3M26D
		System.out.println("Kaç yýl : "+yasim.getYears()); // Kaç yýl : 32
		System.out.println("kaç ay : " +yasim.getMonths()); // kaç ay : 3
		System.out.println("kaç gün : "+yasim.getDays()); // kaç gün : 26
		
		
	}

}
