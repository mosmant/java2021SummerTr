package day31_varargs;

public class C03_Varargs03 {

	public static void main(String[] args) {
		// verilen int lerden ilki haric tum sayilari toplayan ve
		// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin.
		
		toplam(10,15,20,25,30);
		toplam(10,30,11,21,1212,3213);
		
		

	}

	private static void toplam(int i, int ... j) {
		int toplam = 0;
		for (int each : j) {
			toplam += each;
		}
		System.out.println("iþlem sonucu : "+(i*toplam));
	}

}
