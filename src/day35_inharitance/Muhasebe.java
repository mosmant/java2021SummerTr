package day35_inharitance;

public class Muhasebe extends Personel {

	public int saatUcreti;
	public String statu;
	public int maas;

	public int maasHesapla() {
		maas = 8 * 30 * saatUcreti;

		return maas;

	}

}
