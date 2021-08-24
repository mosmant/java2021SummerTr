package day38_overrding_exceptions;
/* 
1- Arac isimli bir superclass olusturunuz, fields : renk, motor(private), model(protected) olsun.
2- Consructor ekleyiniz.get ve set metodlar� ve toString Metodunu ekleyiniz.
3- Bu s�n�ftan  Otobus s�n�f�n� �retiniz, otobusun ayr�ca yolcuSayisi field �n� ekleyiniz.
4- Bir AracPark isimli i�inde main olan bir s�n�f olusturunuz ve Otobus ten
  obj olu�turarak, Otobusun �zelliklerinin t�m�n� ekrana yazd�r�n�z.
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
	// burada getter setter methodlar�n� kullanmak i�in this. variablellar� sildik.
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
