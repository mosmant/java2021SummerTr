package day38_overrding_exceptions;
/* 
1- Arac isimli bir superclass olusturunuz, fields : renk, motor(private), model(protected) olsun.
2- Consructor ekleyiniz.get ve set metodlarý ve toString Metodunu ekleyiniz.
3- Bu sýnýftan  Otobus sýnýfýný üretiniz, otobusun ayrýca yolcuSayisi field ýný ekleyiniz.
4- Bir AracPark isimli içinde main olan bir sýnýf olusturunuz ve Otobus ten
  obj oluþturarak, Otobusun özelliklerinin tümünü ekrana yazdýrýnýz.
*/ 

public class HH_Otobus extends HH_Arac {
	
	int yolcuSayisi;

	public HH_Otobus(String renk, int motor, String model, int yolcuSayisi) {  //
		super(renk, motor, model);  // bu fieldslarý super classtan aldý HH_Arac clasýndan
		this.yolcuSayisi = yolcuSayisi;
	}
	
	// toString methodu object clasýndan geldi. source ===> generate to toString e basarak istediðimiz þeyleri method gibi yazdýrýrýz.
	// toString methodunu kullandýk. constructor verilerini aþaðýdaki þekilde olur 
	// Java Turizm: HH_Otobus [yolcuSayisi=48, model=Mercedes-Benz OM 470Kýrmýzý5000Mercedes-Benz OM 470]
	@Override // object class ýndan override ettik
	public String toString() {
		return "HH_Otobus [yolcuSayisi=" + yolcuSayisi + ", model=" + model + "," + getRenk() + ","+ getMotor() + "]";
	}
	
	//burada to string methodunu hangi classtan veri alacaksak ona yazdýk .to string methodunu çaðýrmaya gerek yoktur. yazdýrýr.

}
