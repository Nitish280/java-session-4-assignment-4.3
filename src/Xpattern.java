
public class Xpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;

		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				if (j == i || j == 6 - i) {
					System.out.print("x");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
