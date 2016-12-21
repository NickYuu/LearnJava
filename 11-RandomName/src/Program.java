
public class Program {

	public static void main(String[] args) {
		String r_name = "無名氏";
		//設計一個 3個 String元素的陣列, 
				  String [ ] objectName = new String [ 3 ];
		// 設好 3個元素的值為 3個人的名子:
		//  陳又行
		//  林迎旭 
		//  晨春林
				  objectName [ 0 ] = "陳又行";
				  objectName [ 1 ] = "林迎旭";
				  objectName [ 2 ] = "晨春林";
		// fix 練習 #1
		//  任意挑出一個元素,將其值印出來
		//  , 但此程式要寫在一個自己發明的類別方法 RPK 的身體內
				   r_name  = 類別名稱.RPK( objectName );
				  
				   System.out.println(r_name);

	}

}


class 類別名稱 {
	public static String RPK(String [] all) {
		
		int index = (int)(all.length * Math.random());
		
		return all[index];
	}
}
