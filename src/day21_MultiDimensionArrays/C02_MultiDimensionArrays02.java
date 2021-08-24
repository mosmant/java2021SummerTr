package day21_MultiDimensionArrays;



public class C02_MultiDimensionArrays02 {

	public static void main(String[] args) {
		// Soru 1 ) Asagidaki multi dimensional array�in tum elemanlarinin carpimini
		// ekrana yazdiran bir method yaziniz.
		// { {1,2,3}, {4,5,6} }

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };  // bu bizim array
		int carpim = 1;									// �arp�m i�leminin etkisiz eleman�
		for (int i = 0; i < arr.length; i++) {			// outer array in elementlerini itarate eder
			for (int j = 0; j < arr[i].length; j++) {
				
				carpim *= arr[i][j];
			}
		}
		System.out.println("t�m elementlerin �arp�m� : "+ carpim);
	}

}
