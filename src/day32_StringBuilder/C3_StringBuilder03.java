package day32_StringBuilder;

import java.util.Scanner;

public class C3_StringBuilder03 {

	public static void main(String[] args) {
		/*
		 * Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi
		 * ters çeviren ve cümlenin palindrom olup olmadýðýný kontrol eden (büyük/küçük
		 * harf duyarlýlýðý olmadan) bir Java programý yazýn. (without case sensitivity)
		 * Eg : Mirror check
		 * 
		 * input : I love Java 
		 * 
		 * Output: "Reversed sentence : avaJ evol I . It is not a palindrome"
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir ifade giriniz: ");
		String str = scan.nextLine();
						
		StringBuilder sb1 = new StringBuilder();
		sb1.append(str) ;
		
		String strRev = sb1.reverse().toString();
		
		if (str.equalsIgnoreCase(strRev)) {
			System.out.println("girdiðiniz ifade palindoromedur : "+ strRev);
		}else {
			System.out.println("girdiðiniz ifade palindrome deðildir : "+ strRev);
		}
		
		
		

	}

}
