package day38_overrding_exceptions;
/* 
1- Arac isimli bir superclass olusturunuz, fields : renk, motor(private), model(protected) olsun.
2- Consructor ekleyiniz.get ve set metodlarý ve toString Metodunu ekleyiniz.
3- Bu sýnýftan  Otobus sýnýfýný üretiniz, otobusun ayrýca yolcuSayisi field ýný ekleyiniz.
4- Bir AracPark isimli içinde main olan bir sýnýf olusturunuz ve Otobus ten
  obj oluþturarak, Otobusun özelliklerinin tümünü ekrana yazdýrýnýz.
*/ 

public class HH_Arac {
	
	private String renk;
	private int motor;
	protected String model;
	
	public HH_Arac(String renk, int motor, String model) {
		setMotor(motor);
		setRenk(renk);
		setModel(model);
	}
	// burada getter setter methodlarýný kullanmak için this. variablellarý sildik.
	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	

}
