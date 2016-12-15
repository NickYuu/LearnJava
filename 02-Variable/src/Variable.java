
public class Variable {

	public static void main(String[] args) {
		
		int number = 5;
		double PI = 3.14;
		System.out.println(number);				// number 這個記憶體內的資料印出來
		System.out.println(PI);
		System.out.println(number + PI);
		
		// final 修飾詞 讓變數不能再修改
		final int number2 = 7;
		number = 9;
		System.out.println(number2);
		// number2 = 10;   // The final local variable number2 cannot be assigned.
		
		String name = "林書豪";
		char firstName = '林';
		
		System.out.printf(name + "firstName is %c", firstName);
		
		
		
	}

}
