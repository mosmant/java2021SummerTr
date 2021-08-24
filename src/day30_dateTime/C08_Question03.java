package day30_dateTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class C08_Question03 {
    public static void main(String[] args) {
        //  TODO
        //      What is the output of the following code?
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
       
        Period p = Period.ofDays(1).ofYears(2); // of methodu en son eklenen parametre geçerlidir. .ofDays(1) geçerli deðildir.
        										// .ofYears sonda olduðu için geçerli olan budur. zincirin osn halkasý geçerli
        
        d = d.minus(p);							// 2015 - 2 yýl  = 2013 
        										// Günde deðiþiklik olmaz.
        
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); 
        
        System.out.println(d.format(f));  
        
 /*
            A. 5/9/13 11:22
            B. 5/10/13 11:22 ==> doðru seçenek bu. of methodu en son eklenen parametre geçerlidir.
            C. 5/9/14
            D. 5/10/14
            E. The code does not compile.
            F. A runtime exception is thrown.
*/
       
    }
}