package day21_MultiDimensionArrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays04 {

	public static void main(String[] args) {
		// Soru 4) Asagidaki multi dimensional array�in ic array�lerindeki tum
		// elemanlarin toplamini birer birer bulan ve herbir sonucu yeni bir array�in
		// elemani yapan ve yeni array�i ekrana yazdiran bir program yaziniz

		// { {1,2,3}, {4,5}, {6,7} }

		// Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output:{6,9,13}


		int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7 } };
		int toplamlarArrayi[] = new int[arr.length]; // toplamlar i�in yeni bir array declare ettik. assign ederken arr
														// arrayinin outer uzunlu�unu yazd�k.

		for (int i = 0; i < arr.length; i++) {
			int elementlerToplami = 0;// bu �ekilde elemanlar toplam�n� her eleman�n loopunda 0 al�r�z. yani i=0
										// oldu�unda inner arrayslar�n ayr� ayr� toplam�n� hesap edecek.
			for (int j = 0; j < arr[i].length; j++) {
				elementlerToplami += arr[i][j]; // burada her outer arerays i�in toplay�p atayacakt�r.

			}
			toplamlarArrayi[i] = elementlerToplami; // burada outer for loop i�inde yazd�rd�k.her elementin de�erini
													// burada assign eetik.
		}
		System.out.println(Arrays.toString(toplamlarArrayi)); // burada arrays methodu ile yeni arrayimizi yazd�rd�k
	}

}
