package day21_MultiDimensionArrays;

public class C03_MultiDimensionalArrays03 {

	public static void main(String[] args) {
		// Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son
		// elemanlarin carpimini ekrana yazdiran bir program yaziniz 
		// { {1,2,3}, {4,5}, {6} }
		
		int arr [][]= { {1,2,3}, {4,5}, {6} };
		int carpim = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length-1; j < arr[i].length; j++) { // son elementleri bulabilmek için 
				// baþlangýcý 0 deðil de inner arrayin son elementini bulmak için (lenght-1) yazarýz.
				// sonuncu elementte 1 kez for loop döner.
				carpim *= arr[i][j];
			}
			
		}System.out.println(carpim);
		
		
	}

}
