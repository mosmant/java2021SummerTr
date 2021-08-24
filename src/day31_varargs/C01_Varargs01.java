package day31_varargs;

public class C01_Varargs01 {

	public static void main(String[] args) {
		// VARARGS UYGULAMALARI
		// verilen iki say�n�ntoplam�n� bulan bir method yaz�n�z.
		// verilen 3 say�n� toplam�n� bulan bir method yaz�n�z.
		
		int sayi1 = 17;
		int sayi2 = 20;
		int sayi3 = 35;
		
		ikisayitopla(sayi1,sayi2);
		ucsayitopla(sayi1,sayi2,sayi3);
		topla(17,20,35);
	}

	private static void ucsayitopla(int sayi1,int sayi2,int sayi3) {
		System.out.println("3 say�n�n toplam� : "+(sayi1+sayi2+sayi3));
		
	}

	private static void ikisayitopla(int sayi1,int sayi2) {
		
		System.out.println("2 say�n�n toplam� : "+(sayi1+sayi2));
		
	}
	public static void topla(int...sayi) {
		int toplam = 0;
		
		for (int i : sayi) {
			toplam+=i;
		}
		System.out.println("toplam : "+ toplam);
	}

}
