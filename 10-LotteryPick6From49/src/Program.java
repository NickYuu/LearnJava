
public class Program {

	public static void main(String[] args) {
		// 大樂透電腦自動選號 從 1 到 49 選 6 個不同的號碼
		// 註: 可利用 Math.random(), 此方法傳回 double值
		
		int [] balls = new int [49];
		for (int i = 1; i <= balls.length; i++) {
			balls[i-1] = i;
		}
		//System.out.println(balls);
		int ballLength = balls.length;
		for (int i = 0; i < 6; i++) {
			int random = (int)(Math.random() * ballLength);
			System.out.println(balls[random]);
			int temp = balls[random];
			balls[random] = balls[ballLength -1];
			balls[ballLength - 1] = temp;
			ballLength -= 1;
		}
		
		System.out.println("------call by reference------");
		
		int [] scores1 = {90, 88, 37, 76};
		int [] scores2 = scores1;
		scores2[0] = 99;
		
		System.out.println(scores1[0]);
		
		
	}

}
