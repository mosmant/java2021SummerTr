package day21_MultiDimensionArrays;

import java.util.Arrays;

public class C01_MultiDimensionArrays01 {

	public static void main(String[] args) {
		// Multi Dimensional Array tüm elemanlarýný yazdýrma;
		
		int arr [][]={{1},{2,3,4},{5,6,7,8}};
		
		// bu MD arrayi nested for loop kullanareak yazdýrma yöntemi
		
		for (int i = 0; i < arr.length; i++) { // burada outer arrayin elementlerini oluþturmak için;
			
			for (int j = 0; j < arr[i].length; j++) { // burada arr[i] yaparak "inner arrayslarin uzunluklarý birbirinden farklý olabilir"
				// inner arrayýn elementlerinin buldurduk.
				System.out.print(arr[i][j]+" "); // burada da MD arrayi yazdýrdýk.
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(arr));

	}

}
