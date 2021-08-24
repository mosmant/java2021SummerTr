package day35_inharitance;

public class Tasks {
	/*
	1) Personel class oluþturunuz id(int), isim(String), soyisim(String),adres(String), tel(String), instance veriable bululundursun.
	bu class 1000 den baþlayarak id atayan bir method barýndýrsýn ===> burada mehmet hoca sayaç oluþturdu static atadý.
 	
 	2) Muhasebe class oluþturunuz saatUcreti (int), statü(String), maas(int) instance veriable bululundursun.
	bu classsaatucretini 8 ve 30 ile carparak maaas hesaplayan bir  method barýndýrsýn
	
	3)Memur class oluþturunuz iki memurun saat ucreti 20 tl ve 25  den maasýnýn  ve diðer bilgilerini yazdýrýnýz
	
	4)isci class oluþturunuz iki iscinim   saat ucreti 10 tl ve 15  den maasýnýn  ve diðer bilgilerini yazdýrýnýz
	Ahanda TRICK  :)
	
	Class'larýn   parent-->child   iliþkisi
            	
            	personel-->Muhasebe
            	Muhasebe-->Memur
            	Muhasebe-->Isci
	 */
	
	/*
	 * 1)Java’da class’lar arasinda parent(Aile)-child(Cocuk) relationship(iliski) vardir.
	 
	 2)Parent Class’a “super class” da denir. Child Class’a “sub class” da denir.
	  
	 3)Ortak ozellikler parent class’a, specific uniqe ozellikler child class’a yazilir.
	  
	 4)Parent Child Relationship “reusability” (tekrarlý kullaným), “maintenance” (tamir), “less code” (az kod), 
	 	“well organization” acilarindan faydalidir.
	  
	 5)Child classlar parent’lardaki her methodu ve variable’i kullanabilir ama parent class child’dakileri kullanamaz.
	  
	 6)Java “Multiple Inheritance”’i desteklemez. Yani; Java’da bir Child Class’in 1’den fazla parent’i olamaz.
	  
	 7)Bir parent class, 1'den fazla child class ile olusturulan parent child relationship’e “Hierarchical Inheritance” denir.     
	  
	  
	 8)Child-Parent-Grandparent... seklinde olusturulan cok katli parent child relationshipe’e multi-level inheritance denir.
	  
	 9)“Object Class” butun classlarin parent class’idir. Java’da parent class’i olmayan tek class “Object Class”dir
	 */

}
