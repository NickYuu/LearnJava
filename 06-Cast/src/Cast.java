
public class Cast {

	public static void main(String[] args) {
		double RD  = Math.random();
        System.out.println(RD);
        System.out.println("RD is" + RD);
        
        int Lucky  ;
        //fix #2  如何修改下ㄧ行, 讓 RD * 10 的直還是可以存到 Lucky
        //fix 練習ㄧ #1 將下ㄧ行註解取消, 有問題嗎?
        Lucky = (int)(RD * 10);
        System.out.println(Lucky);
        System.out.println();
        
        
	}

}
