package day31_varargs;

public class C01_Varargs01 {

	public static void main(String[] args) {
		// VARARGS UYGULAMALARI
		// verilen iki sayýnýntoplamýný bulan bir method yazýnýz.
		// verilen 3 sayýný toplamýný bulan bir method yazýnýz.
		
		int sayi1 = 17;
		int sayi2 = 20;
		int sayi3 = 35;
		
		ikisayitopla(sayi1,sayi2);
		ucsayitopla(sayi1,sayi2,sayi3);
		topla(17,20,35);
	}

	private static void ucsayitopla(int sayi1,int sayi2,int sayi3) {
		System.out.println("3 sayýnýn toplamý : "+(sayi1+sayi2+sayi3));
		
	}

	private static void ikisayitopla(int sayi1,int sayi2) {
		
		System.out.println("2 sayýnýn toplamý : "+(sayi1+sayi2));
		
	}
	public static void topla(int...sayi) {
		int toplam = 0;
		
		for (int i : sayi) {
			toplam+=i;
		}
		System.out.println("toplam : "+ toplam);
	}

}
