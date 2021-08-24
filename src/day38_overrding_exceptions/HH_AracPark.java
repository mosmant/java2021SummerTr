package day38_overrding_exceptions;
/* 
1- Arac isimli bir superclass olusturunuz, fields : renk, motor(private), model(protected) olsun.
2- Consructor ekleyiniz.get ve set metodlarý ve toString Metodunu ekleyiniz.
3- Bu sýnýftan  Otobus sýnýfýný üretiniz, otobusun ayrýca yolcuSayisi field ýný ekleyiniz.
4- Bir AracPark isimli içinde main olan bir sýnýf olusturunuz ve Otobus ten
  obj oluþturarak, Otobusun özelliklerinin tümünü ekrana yazdýrýnýz.
*/ 

public class HH_AracPark {

	public static void main(String[] args) {
		
		HH_Otobus obj1 = new HH_Otobus("Kýrmýzý", 5000, "Mercedes-Benz OM 470", 48);
		
		System.out.println("Java Turizm: "+obj1);

	}

}
