package day17_NestedForLoopWhileLoop;

import java.util.Scanner;

public class C06_WhileLoop04 {

	public static void main(String[] args) {
		// Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.print("L�tfen pozitif bir tamsayi giriniz: ");
		int sayi= scan.nextInt();
		int i= sayi;  // burada say� de�erini i de�erine atamam�z�n nedeni i�lem yapt�k�a ba�lang� de�erinin de�i�mesini istemememizdendir.
		int rakamlarTop=0;
		int rakam=0;
		
		while (i>0) {
			rakam = i%10;  // burada sayi ayni 
			rakamlarTop+=rakam;
			i/=10;    // fakat burda artk say� de�i�ti.
			
		}// burada ba�lang��taki say�y� kulland�k. burada basit oldu ama di�er k�s�mlarda daha �nemli bir hal alacak.
		System.out.println("girdi�iniz "+sayi+" rakamlar� toplam� : "+ rakamlarTop);
		
		scan.close();
	}

}
