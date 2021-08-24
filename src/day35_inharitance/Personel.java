package day35_inharitance;

public class Personel {
	
	public static int sayac = 1000;  // burada static almamýzýn sebebi class variable olmasý.  
	// objeler create edersek her obje oluþtuðunda 1 artacak. bu konu static konusunda iþlendi.
	public int id;
	public String isim;
	public String soyisim;
	public String adres;
	public String tel;
	
	public int idatama() {
		this.id=sayac;
		sayac++;
		return id;
		
	}

}
