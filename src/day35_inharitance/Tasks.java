package day35_inharitance;

public class Tasks {
	/*
	1) Personel class olu�turunuz id(int), isim(String), soyisim(String),adres(String), tel(String), instance veriable bululundursun.
	bu class 1000 den ba�layarak id atayan bir method bar�nd�rs�n ===> burada mehmet hoca saya� olu�turdu static atad�.
 	
 	2) Muhasebe class olu�turunuz saatUcreti (int), stat�(String), maas(int) instance veriable bululundursun.
	bu classsaatucretini 8 ve 30 ile carparak maaas hesaplayan bir  method bar�nd�rs�n
	
	3)Memur class olu�turunuz iki memurun saat ucreti 20 tl ve 25  den maas�n�n  ve di�er bilgilerini yazd�r�n�z
	
	4)isci class olu�turunuz iki iscinim   saat ucreti 10 tl ve 15  den maas�n�n  ve di�er bilgilerini yazd�r�n�z
	Ahanda TRICK  :)
	
	Class'lar�n   parent-->child   ili�kisi
            	
            	personel-->Muhasebe
            	Muhasebe-->Memur
            	Muhasebe-->Isci
	 */
	
	/*
	 * 1)Java�da class�lar arasinda parent(Aile)-child(Cocuk) relationship(iliski) vardir.
	 
	 2)Parent Class�a �super class� da denir. Child Class�a �sub class� da denir.
	  
	 3)Ortak ozellikler parent class�a, specific uniqe ozellikler child class�a yazilir.
	  
	 4)Parent Child Relationship �reusability� (tekrarl� kullan�m), �maintenance� (tamir), �less code� (az kod), 
	 	�well organization� acilarindan faydalidir.
	  
	 5)Child classlar parent�lardaki her methodu ve variable�i kullanabilir ama parent class child�dakileri kullanamaz.
	  
	 6)Java �Multiple Inheritance��i desteklemez. Yani; Java�da bir Child Class�in 1�den fazla parent�i olamaz.
	  
	 7)Bir parent class, 1'den fazla child class ile olusturulan parent child relationship�e �Hierarchical Inheritance� denir.     
	  
	  
	 8)Child-Parent-Grandparent... seklinde olusturulan cok katli parent child relationshipe�e multi-level inheritance denir.
	  
	 9)�Object Class� butun classlarin parent class�idir. Java�da parent class�i olmayan tek class �Object Class�dir
	 */

}
