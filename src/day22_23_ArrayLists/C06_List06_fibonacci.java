package day22_23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_List06_fibonacci {

	public static void main(String[] args) {
		// 100'den buyuk ilk 20 fibonacci sayisini list olarak yazdirin
		
		
		List <Integer> fibonacci =new ArrayList<>();
		List <Integer> istenenSayilar = new ArrayList<>();
		
		
		fibonacci.add(0); // ilk 2 elementini kendim oluþturuyorum buna göre diðerleri meydana geliyor.
		fibonacci.add(1);
		
		int count=1;
		int sayi=0;
		int i=1;
		
		do {  // bu kýsým fibonacci list i oluþturuyor.
			sayi=fibonacci.get(i-1)+fibonacci.get(i);
			fibonacci.add(sayi);
			
			if (sayi>100) {  // burasý ise istenenSayiler list ini oluþturduk.
				istenenSayilar.add(sayi);
				count++;	// count u burada artýtýyorum. çünkü 100 den sonrasý için kullanacaðým.
			}		
			i++; // indexi burada artýrdýk.
			
		}while(count<=20); // count 20 soruda 100 den sonra 20 elemaný istiyor.
		
		System.out.println(istenenSayilar);
		System.out.println(fibonacci);
		
		
		
		
		
		
		
		
		

	}

}