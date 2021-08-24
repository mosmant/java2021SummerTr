package day22_23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C04_List04 {

	public static void main(String[] args) {
		// verilen bir array'de tekrar eden elementleri silip
		// tekrarsiz yeni bir array haline getirin
		
		int arr[]= {2,3,5,7,3,5,2,6,3,1,4,2,3,8,5,10}; // length =13
		
		
		List<Integer> sayilar = new ArrayList<>(); // yeni bir liste aktaraca��z. onun i�in yeni list olu�turduk.
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if (!sayilar.contains(arr[i])) {	// arr arrays�ndeki elemanlar� i�eriyor mu. i�ermiyorsa listeme eklemeliyim
				
				sayilar.add(arr[i]);		// buras� ekleme k�sm�.
				
			}
			
		}
		
		System.out.println(sayilar); // liste olarak tekrarsiz elementlerden olusuyor
		Collections.sort(sayilar);		// burada s�ralad�k.
		System.out.println("list olarak tekrarsiz sayilar: " + sayilar);  
		
		// yeni bir array olusturup bu elementleri yeni array'e eklemeliyiz
		// yeni array'in length'i 7 olacak
		
		int yeniArr[]= new int[sayilar.size()];
		
		for (int i = 0; i < yeniArr.length; i++) {
			
			yeniArr[i]=sayilar.get(i);
			
		}
		
		System.out.println("Tekrarsiz array : " + Arrays.toString(yeniArr));
		
		
		
		
		
		
	}

}