package day38_overrding_exceptions;
/* 
1- Arac isimli bir superclass olusturunuz, fields : renk, motor(private), model(protected) olsun.
2- Consructor ekleyiniz.get ve set metodlar� ve toString Metodunu ekleyiniz.
3- Bu s�n�ftan  Otobus s�n�f�n� �retiniz, otobusun ayr�ca yolcuSayisi field �n� ekleyiniz.
4- Bir AracPark isimli i�inde main olan bir s�n�f olusturunuz ve Otobus ten
  obj olu�turarak, Otobusun �zelliklerinin t�m�n� ekrana yazd�r�n�z.
*/ 

public class HH_Otobus extends HH_Arac {
	
	int yolcuSayisi;

	public HH_Otobus(String renk, int motor, String model, int yolcuSayisi) {  //
		super(renk, motor, model);  // bu fieldslar� super classtan ald� HH_Arac clas�ndan
		this.yolcuSayisi = yolcuSayisi;
	}
	
	// toString methodu object clas�ndan geldi. source ===> generate to toString e basarak istedi�imiz �eyleri method gibi yazd�r�r�z.
	// toString methodunu kulland�k. constructor verilerini a�a��daki �ekilde olur 
	// Java Turizm: HH_Otobus [yolcuSayisi=48, model=Mercedes-Benz OM 470K�rm�z�5000Mercedes-Benz OM 470]
	@Override // object class �ndan override ettik
	public String toString() {
		return "HH_Otobus [yolcuSayisi=" + yolcuSayisi + ", model=" + model + "," + getRenk() + ","+ getMotor() + "]";
	}
	
	//burada to string methodunu hangi classtan veri alacaksak ona yazd�k .to string methodunu �a��rmaya gerek yoktur. yazd�r�r.

}
