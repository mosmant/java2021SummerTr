package day35_inharitance;

public class Isci extends Muhasebe {

	public static void main(String[] args) {

		Isci i1 = new Isci();

		i1.id = i1.idatama();
		i1.isim = "Osman";
		i1.soyisim = "Türker";
		i1.adres = "Kocaeli";
		i1.tel = "0546 123 12 12";
		i1.saatUcreti = 15;
		i1.statu = "Amele";
		i1.maas = i1.maasHesapla();

		System.out.println(i1.id + " " + i1.isim + " " + i1.soyisim + " " + i1.tel + " " + i1.adres + " "
				+ i1.saatUcreti + " " + i1.maas);

	}
}
