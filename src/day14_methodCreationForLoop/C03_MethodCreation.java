package day14_methodCreationForLoop;

import java.util.Scanner;

public class C03_MethodCreation {

	public static void main(String[] args) {
	 //Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre 
	 //- @ isareti icermiyorsa gecersiz email yazdirin
	 //- @gmail.com icermiyorsa �lutfen gmail adresinizi girin� yazdirin
	 //- @gmail.com ile bitmiyorsa �Yazimda bir sorun var, maili kontrol ediniz�
	 //- bu sorunlardan hi�birisi yoksa "mailiniz ba�ar�yla kaydedildi.
		
	 // 1 ben methoda ne g�nderece�im.
	 // 2 method ne yapacak. return var m�. yoksa void yapal�m ve syso kullanal�m
	 // 3 method bize ne d�nd�recek..	
		
		Scanner scan = new Scanner (System.in);
		System.out.println("l�tfen mail adresi giriniz.");
		String email = scan.nextLine();
		
		mailKontroEt(email);
		
		scan.close();
	}

	public static void mailKontroEt(String email) {
		if (!email.contains("@")) {
			System.out.println("gecersiz email");
		}else if (!email.contains("@gmail.com")) {
			System.out.println("gecersiz email");
		}else if (!email.endsWith("@gmail.com")) {
			System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
		}else {
			System.out.println("mailiniz ba�ar�yla kaydedildi");
		}
		
	}

}
