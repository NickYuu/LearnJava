
public class Loop {

	public static void main(String[] args) {

		System.out.println("----for----");
		for (int i = 0; i < 10; i += 1) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n----while----");
		int j = 0;
		while (j < 10) {
			System.out.print(j + " ");
			j += 1;
			if (j == 5) {
				System.out.println("\nGot five...");
				break;
			}
		}
		
		System.out.println("----do-while----");
		int number;
		do {
			number = (int)(Math.random() * 10);
			System.out.print(number + " ");
		} while (number != 9);
		
		System.out.println("\n----9 x 9----");
		for (int i = 1; i < 10; i += 1) {
			for (int k = 1; k < 10; k += 1) {
				if (k == 9) {
					System.out.printf("%d x %d = %02d", k, i, i*k);
					break;
				}
				System.out.printf("%d x %d = %02d || ", k, i, i*k);
			}
			System.out.println("");
		}
		
		System.out.println("----break & continue----");
		int randomNum;
		while (true) {
			randomNum = (int)(Math.random() * 50);
			if (randomNum % 2 == 0) {
				continue;
			}
			if (randomNum == 11 || randomNum == 21 || randomNum == 31|| randomNum == 41) {
				System.out.println("Got " + randomNum);
				break;
			}
			System.out.println(randomNum);
		}
		
	}

}
