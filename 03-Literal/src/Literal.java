
public class Literal {

	public static void main(String[] args) {
		System.out.println(1234128181281L); 	// int後面寫L/l 轉型為 long
		float fv = 7.89f; 						// 加f/F 不加為Double
		System.out.println(fv);

		// fix #1 將下ㄧ行註解取消, 如何印出 45600000000 的值
		// System.out.println( 45600000000 );
		// fix #2 將下兩行註解取消, 有問題嗎, 若有問題怎麼辦?
		// float FV = 7.89;
		// System.out.println(FV);
		// fix #3 觀察下ㄧ行
		System.out.println("It's a problem");
		char p;
		// fix #4 修改下ㄧ行 如何設變數 p 的值為 '
		p = 'x';
		System.out.println(p);
		// fix #5 將下ㄧ行註解取消, 有問題嗎, 若有問題怎麼辦?
		// 如何印出 "autoexec.bat" 的值
		// System.out.println(""autoexec.bat"");
		
		System.out.println();

	}

}
