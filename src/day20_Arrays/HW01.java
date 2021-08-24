package day20_Arrays;

import java.util.Arrays;

public class HW01 {

	public static void main(String[] args) {
		// �dev : "java ��ren, hayat� ya�a" tersten spilt y�ntemi ile yazd�r�n�z.

		String str = "java ��ren, hayat� ya�a"; // string olarak assign ettim.

		String bolunmusStr[] = str.split(" "); // split y�ntemi ile array elementleri olu�turdum.
		System.out.println(Arrays.toString(bolunmusStr)); // burada b�l�nm�� elementleri yazd�rd�m.
		// burada b�ld���m array� tersten yeniden olu�turaca��m methoda atamak i�in
		// yapt�m.
		bolunmusStr = strTersten(bolunmusStr); // burada bolunmus arrayimi tersten methoduna atad�m.
		System.out.println(Arrays.toString(bolunmusStr)); // burada bi �stte atad���m methodu yazd�rd�m.
	}

	private static String[] strTersten(String bolunmusStr[]) { // tersten methodum bu

		String temp[] = new String[bolunmusStr.length]; // temporary yani ge�ici bir temp arrayi objesi olu�turdum.
														// deklare ettim uzunlu�u ise bolunmus arrayimle ayn�
		for (int i = 0; i < temp.length; i++) { // forloop olu�turdum i 0 dan ba�lad� bolunmus arrayimle ayn� uzunlu�a
												// kadar ko�ula ba�lad�m.
			temp[i] = bolunmusStr[bolunmusStr.length - 1 - i];
			/*
			 * burda olu�turdu�um ge�ici arrayimin ilk eleman� 0. indexteki eleman� b�l�nm��
			 * arrayiminson eleman� olacak.
			 * 
			 */

		}

		return temp; // burada temp arrayi art�k benim yeni arrayim.methodumdan return olacak array
	}

}
