package day22_23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_List06_fibonacci {

	public static void main(String[] args) {
		// 100'den buyuk ilk 20 fibonacci sayisini list olarak yazdirin
		
		
		List <Integer> fibonacci =new ArrayList<>();
		List <Integer> istenenSayilar = new ArrayList<>();
		
		
		fibonacci.add(0); // ilk 2 elementini kendim olu�turuyorum buna g�re di�erleri meydana geliyor.
		fibonacci.add(1);
		
		int count=1;
		int sayi=0;
		int i=1;
		
		do {  // bu k�s�m fibonacci list i olu�turuyor.
			sayi=fibonacci.get(i-1)+fibonacci.get(i);
			fibonacci.add(sayi);
			
			if (sayi>100) {  // buras� ise istenenSayiler list ini olu�turduk.
				istenenSayilar.add(sayi);
				count++;	// count u burada art�t�yorum. ��nk� 100 den sonras� i�in kullanaca��m.
			}		
			i++; // indexi burada art�rd�k.
			
		}while(count<=20); // count 20 soruda 100 den sonra 20 eleman� istiyor.
		
		System.out.println(istenenSayilar);
		System.out.println(fibonacci);
		
		
		
		
		
		
		
		
		

	}

}