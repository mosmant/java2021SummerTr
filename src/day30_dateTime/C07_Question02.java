package day30_dateTime;

import java.time.LocalDate;
import java.time.Month;

public class C07_Question02 {

	public static void main(String[] args) {
		//TODO
        // What is the output of the following code?
        LocalDate date = LocalDate.of(2018,Month.APRIL, 40);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth()); 
            /* 
            A. 2018 APRIL 4
            B. 2018 APRIL 30
            C. 2018 MAY 10
            
            D. Another date.
            E. The code does not compile.
            F. A runtime exception is thrown. ===>  burada RTE verir. çünkü mayýs ayý 40 gün çekmez.
            */

	}

}
