package day35_inharitance;

public class Memur extends Muhasebe {
	public static void main(String[] args) {

		Memur m1 = new Memur();
		

		m1.id = m1.idatama();
		m1.isim = "Osman";
		m1.soyisim = "Türker";
		m1.adres = "Kocaeli";
		m1.tel = "0546 123 12 12";
		m1.saatUcreti = 25;
		m1.statu = "Muhendis";
		m1.maas = m1.maasHesapla();
		
		System.out.println(m1.id + " " + m1.isim + " " + m1.soyisim + " " + m1.tel + " " + m1.adres + " "
				+ m1.saatUcreti + " " + m1.maas);
		
		Memur m2 = new Memur();
		m2.id = m2.idatama();
		m2.isim = "Cemile";
		m2.soyisim = "Türker";
		m2.adres = "Kocaeli";
		m2.tel = "0546 122 12 12";
		m2.saatUcreti = 20;
		m2.statu = "Ogretim";
		m2.maas = m2.maasHesapla();
		
		System.out.println(m2.id + " " + m2.isim + " " + m2.soyisim + " " + m2.tel + " " + m2.adres + " "
				+ m2.saatUcreti + " " + m2.maas);
		
		
		
		
		
		
		

	}
}
