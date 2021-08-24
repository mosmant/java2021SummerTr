package day14_methodCreationForLoop;

import java.util.Scanner;

public class C03_MethodCreation {

	public static void main(String[] args) {
	 //Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre 
	 //- @ isareti icermiyorsa gecersiz email yazdirin
	 //- @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
	 //- @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
	 //- bu sorunlardan hiçbirisi yoksa "mailiniz baþarýyla kaydedildi.
		
	 // 1 ben methoda ne göndereceðim.
	 // 2 method ne yapacak. return var mý. yoksa void yapalým ve syso kullanalým
	 // 3 method bize ne döndürecek..	
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lðtfen mail adresi giriniz.");
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
			System.out.println("mailiniz baþarýyla kaydedildi");
		}
		
	}

}
