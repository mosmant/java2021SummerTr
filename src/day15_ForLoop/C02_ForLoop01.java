package day15_ForLoop;

public class C02_ForLoop01 {

	public static void main(String[] args) {
		// for loop ta dikkat edilmesi gereken sorulmas� gereken 3 soru var...
		// 1- ka�tan ba�layaca��z
		// 2- nereye kadar gidece�iz.
		// 3- her ad�mda ne yapaca��z ve de�i�ken nas�l de�i�ecek...

		// ** �rnek 10'dan 20 ye kadar olan say�lar� yaz�dran bir for loop olu�turunuz.

		for (int i = 10; i <= 20; i++) {
			System.out.print(i + " ");

		}

		System.out.println("");
		// 100 ile 200 dahil aralar�ndaki 10 ile b�l�nebilen yaz�lar� yazd�r�n

		for (int i = 100; i < 201; i++) {
			if (i % 10 == 0) {
				System.out.print(+i + " ");
			}

		}
		// 50 den 20 ye kadar s�n�rlar dahil 3 er 3 er geri sayarak yazd�ral�m...
		System.out.println("");
		for (int i = 50; i <= 10; i -= 3) {
			System.out.print(i + " ");
		}
		/*
		// e�er de�i�kenimiz verilen art�� veya azal��la biti� ko�uluna ula�am�yorsa sonsuz loop olu�ur ve 
		// sistem ��kene kadar loop �al��maya devam eder. infinite loop
		for (int i = 10; i < 20; i--) {
			System.out.print(i + " ");
		}
		*/
		// 50 ile 100 aras�nda 3 ile b�l�nebilen yaz�lar� yazd�r�n.
		System.out.println("");
		for (int i = 50; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}

		}
		// e�er ba�lang�� de�eri ko�ulu sa�lam�yorsa loop body hi� �al��madan loopun sonuna gider. yani loop i�levsiz olur.
		// burada 10<0 bu ending cond. sa�lamad��� i�in bu for loop �l� do�uyor ve �al��m�yor. useles loop
		for (int i = 10; i < 0; i++) {
			System.out.println(i+" ");
		}
		System.out.println("");
		System.out.println("son for loopun sonras�");
	}

}
