
public class program {

	public static void main(String[] args) {
		// 大樂透 從 1 到 49 選任選 6 個號碼
		// 假設6個號碼如下:
		// 48
		// 7
		// 19
		// 35
		// 26
		// 22
		int[] numbers = { 48, 7, 19, 35, 26, 22 };
		System.out.println("?????????????????????????????????");
		for (int i = 0; i < numbers.length; i++) {
			int j = numbers[i];
			System.out.print(j + "  ");
		}
		System.out.println();
		System.out.println("#################################");
		// fix 練習 #1 從 小 到 大 印出這 6 個號碼:

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j + 1] < numbers[j]) {
					swap(numbers, j + 1, j);
				}
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("結束");

	}

	private static void swap(int[] array, int indexA, int indexB) {
		int tmp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = tmp;
	}

}
