package day35_inharitance;

public class Personel {
	
	public static int sayac = 1000;  // burada static almam�z�n sebebi class variable olmas�.  
	// objeler create edersek her obje olu�tu�unda 1 artacak. bu konu static konusunda i�lendi.
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
