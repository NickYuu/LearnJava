
public class StaticMethod {

	static int ty;
	
	public static void main(String[] args) {
		/*
		static void 方法名稱（參數）{
		}
		static String 方法名稱（參數）{
			return "hello";
		}
		*/
		System.out.println(give4or5());
		
	}
	
	static Integer give4or5() {
		ty = 0;											// Static Method 只能使用 static的變數
		Integer num = (int)(Math.random() * 10) + 1;
		num = (num%2 == 0) ? 4 : 5;
		return num;
	}
	
}
