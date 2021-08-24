package day17_NestedForLoopWhileLoop;

import java.util.Scanner;

public class C06_WhileLoop04 {

	public static void main(String[] args) {
		// Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen pozitif bir tamsayi giriniz: ");
		int sayi= scan.nextInt();
		int i= sayi;  // burada sayý deðerini i deðerine atamamýzýn nedeni iþlem yaptýkça baþlangç deðerinin deðiþmesini istemememizdendir.
		int rakamlarTop=0;
		int rakam=0;
		
		while (i>0) {
			rakam = i%10;  // burada sayi ayni 
			rakamlarTop+=rakam;
			i/=10;    // fakat burda artk sayý deðiþti.
			
		}// burada baþlangýçtaki sayýyý kullandýk. burada basit oldu ama diðer kýsýmlarda daha önemli bir hal alacak.
		System.out.println("girdiðiniz "+sayi+" rakamlarý toplamý : "+ rakamlarTop);
		
		scan.close();
	}

}
