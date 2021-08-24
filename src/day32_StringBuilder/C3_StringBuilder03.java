package day32_StringBuilder;

import java.util.Scanner;

public class C3_StringBuilder03 {

	public static void main(String[] args) {
		/*
		 * Bir c�mleyi parametre olarak kabul eden, StringBuilder kullanarak c�mleyi
		 * ters �eviren ve c�mlenin palindrom olup olmad���n� kontrol eden (b�y�k/k���k
		 * harf duyarl�l��� olmadan) bir Java program� yaz�n. (without case sensitivity)
		 * Eg : Mirror check
		 * 
		 * input : I love Java 
		 * 
		 * Output: "Reversed sentence : avaJ evol I . It is not a palindrome"
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen bir ifade giriniz: ");
		String str = scan.nextLine();
						
		StringBuilder sb1 = new StringBuilder();
		sb1.append(str) ;
		
		String strRev = sb1.reverse().toString();
		
		if (str.equalsIgnoreCase(strRev)) {
			System.out.println("girdi�iniz ifade palindoromedur : "+ strRev);
		}else {
			System.out.println("girdi�iniz ifade palindrome de�ildir : "+ strRev);
		}
		
		
		

	}

}
