package day38_overrding_exceptions;
/* 
1- Arac isimli bir superclass olusturunuz, fields : renk, motor(private), model(protected) olsun.
2- Consructor ekleyiniz.get ve set metodlar� ve toString Metodunu ekleyiniz.
3- Bu s�n�ftan  Otobus s�n�f�n� �retiniz, otobusun ayr�ca yolcuSayisi field �n� ekleyiniz.
4- Bir AracPark isimli i�inde main olan bir s�n�f olusturunuz ve Otobus ten
  obj olu�turarak, Otobusun �zelliklerinin t�m�n� ekrana yazd�r�n�z.
*/ 

public class HH_AracPark {

	public static void main(String[] args) {
		
		HH_Otobus obj1 = new HH_Otobus("K�rm�z�", 5000, "Mercedes-Benz OM 470", 48);
		
		System.out.println("Java Turizm: "+obj1);

	}

}
