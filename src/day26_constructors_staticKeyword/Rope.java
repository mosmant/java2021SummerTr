package day26_constructors_staticKeyword;
public class Rope {
	// bu soru Oracle sýnavýndan bir soru. kaç tane CTE var ve output ne olur gibi sorular.
	// bu soruda 1 adet CTE var output climb();methodu silinirse swing swing olur .

	public static void swing() {
		System.out.println("swing ");
	}

	public void climb() {
		System.out.println("climb ");
	}

	public static void play() {
		swing();
		//climb(); // CTE
	}

	public static void main(String[] args) {

		Rope rope = new Rope();
		rope.play();
		Rope rope2 = null;
		rope2.play();
	}
}