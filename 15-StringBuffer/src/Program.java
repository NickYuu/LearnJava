public class Program {
	public static void main(String[] args) {
		StringBuffer S1 = new StringBuffer("Java");
		String 字串 = " 是個流行的語言";
		int 字元位置 = 0;
		// java.lang.StringBuffer類別
		System.out.println(S1.charAt(字元位置));
		System.out.println(S1.length());
		S1.append(字串);
		System.out.println(S1);
		System.out.println(S1.length());
		char 字元 = 'k';
		S1.setCharAt(字元位置, 字元);
		System.out.println(S1);
		System.out.println("????????????????");
		// fix 練習 #1 觀察下ㄧ行
		StringBuffer we = new StringBuffer("頭周成光尾");
		System.out.println(we);
		// fix 練習 #2 把一個字串的內容變成頭尾顛倒
		we.reverse();
		System.out.println("################");
		System.out.println(we);// "尾光成周頭"
		System.out.println("$$$$$$$$$$$$$$$$");
	}

}
