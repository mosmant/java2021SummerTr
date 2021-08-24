package day15_ForLoop;

public class C02_ForLoop01 {

	public static void main(String[] args) {
		// for loop ta dikkat edilmesi gereken sorulmasý gereken 3 soru var...
		// 1- kaçtan baþlayacaðýz
		// 2- nereye kadar gideceðiz.
		// 3- her adýmda ne yapacaðýz ve deðiþken nasýl deðiþecek...

		// ** örnek 10'dan 20 ye kadar olan sayýlarý yazýdran bir for loop oluþturunuz.

		for (int i = 10; i <= 20; i++) {
			System.out.print(i + " ");

		}

		System.out.println("");
		// 100 ile 200 dahil aralarýndaki 10 ile bölünebilen yazýlarý yazdýrýn

		for (int i = 100; i < 201; i++) {
			if (i % 10 == 0) {
				System.out.print(+i + " ");
			}

		}
		// 50 den 20 ye kadar sýnýrlar dahil 3 er 3 er geri sayarak yazdýralým...
		System.out.println("");
		for (int i = 50; i <= 10; i -= 3) {
			System.out.print(i + " ");
		}
		/*
		// eðer deðiþkenimiz verilen artýþ veya azalýþla bitiþ koþuluna ulaþamýyorsa sonsuz loop oluþur ve 
		// sistem çökene kadar loop çalýþmaya devam eder. infinite loop
		for (int i = 10; i < 20; i--) {
			System.out.print(i + " ");
		}
		*/
		// 50 ile 100 arasýnda 3 ile bölünebilen yazýlarý yazdýrýn.
		System.out.println("");
		for (int i = 50; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}

		}
		// eðer baþlangýç deðeri koþulu saðlamýyorsa loop body hiç çalýþmadan loopun sonuna gider. yani loop iþlevsiz olur.
		// burada 10<0 bu ending cond. saðlamadýðý için bu for loop ölü doðuyor ve çalýþmýyor. useles loop
		for (int i = 10; i < 0; i++) {
			System.out.println(i+" ");
		}
		System.out.println("");
		System.out.println("son for loopun sonrasý");
	}

}
