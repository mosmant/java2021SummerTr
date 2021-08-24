package day17_NestedForLoopWhileLoop;

public class C04_WhileLoop02 {

	public static void main(String[] args) {
		// Soru 2 ) For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve
		// 90’na tam bolunebilen sayilari yazdirin.

		int i = 100;
		System.out.println("while ile");
		while (i < 1000) {
			if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println("");
		System.out.println("for ile");
		for (int j = 100; j < 1000; j++) {
			if (j % 15 == 0 && j % 20 == 0 && j % 90 == 0) {
				System.out.print(j + " ");
			}

		}

	}
}
