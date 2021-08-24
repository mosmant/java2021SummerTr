package day21_MultiDimensionArrays;

import java.util.Arrays;

public class C01_MultiDimensionArrays01 {

	public static void main(String[] args) {
		// Multi Dimensional Array t�m elemanlar�n� yazd�rma;
		
		int arr [][]={{1},{2,3,4},{5,6,7,8}};
		
		// bu MD arrayi nested for loop kullanareak yazd�rma y�ntemi
		
		for (int i = 0; i < arr.length; i++) { // burada outer arrayin elementlerini olu�turmak i�in;
			
			for (int j = 0; j < arr[i].length; j++) { // burada arr[i] yaparak "inner arrayslarin uzunluklar� birbirinden farkl� olabilir"
				// inner array�n elementlerinin buldurduk.
				System.out.print(arr[i][j]+" "); // burada da MD arrayi yazd�rd�k.
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(arr));

	}

}
