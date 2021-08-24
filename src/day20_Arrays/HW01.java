package day20_Arrays;

import java.util.Arrays;

public class HW01 {

	public static void main(String[] args) {
		// Ödev : "java öðren, hayatý yaþa" tersten spilt yöntemi ile yazdýrýnýz.

		String str = "java öðren, hayatý yaþa"; // string olarak assign ettim.

		String bolunmusStr[] = str.split(" "); // split yöntemi ile array elementleri oluþturdum.
		System.out.println(Arrays.toString(bolunmusStr)); // burada bölünmüþ elementleri yazdýrdým.
		// burada böldüðüm arrayý tersten yeniden oluþturacaðým methoda atamak için
		// yaptým.
		bolunmusStr = strTersten(bolunmusStr); // burada bolunmus arrayimi tersten methoduna atadým.
		System.out.println(Arrays.toString(bolunmusStr)); // burada bi üstte atadýðým methodu yazdýrdým.
	}

	private static String[] strTersten(String bolunmusStr[]) { // tersten methodum bu

		String temp[] = new String[bolunmusStr.length]; // temporary yani geçici bir temp arrayi objesi oluþturdum.
														// deklare ettim uzunluðu ise bolunmus arrayimle ayný
		for (int i = 0; i < temp.length; i++) { // forloop oluþturdum i 0 dan baþladý bolunmus arrayimle ayný uzunluða
												// kadar koþula baðladým.
			temp[i] = bolunmusStr[bolunmusStr.length - 1 - i];
			/*
			 * burda oluþturduðum geçici arrayimin ilk elemaný 0. indexteki elemaný bölünmüþ
			 * arrayiminson elemaný olacak.
			 * 
			 */

		}

		return temp; // burada temp arrayi artýk benim yeni arrayim.methodumdan return olacak array
	}

}
