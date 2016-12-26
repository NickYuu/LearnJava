
import java.util.*;

public class Program {
	public static void main(String[] args) {
		Vector/* <Boolean> */ at2 = new Vector/* <Boolean> */ ();
		at2.addElement(true);
		// fix #1 觀察下ㄧ行
		at2.addElement(9);
		boolean p2 = false;
		// fix #6 將下ㄧ行 (Boolean) 註解 觀察會如何?
		p2 = /* 轉型 */ (Boolean) (at2.elementAt(0));
		System.out.println("@@@@@@@@");
		System.out.println(!p2);
		System.out.println("########");
		// fix #2 觀察下ㄧ行, 此程式有錯嗎?
		Vector<Boolean> at = new Vector<Boolean>();
		// fix #3 觀察下ㄧ行, 此程式有錯嗎?
		at.addElement(true);
		// fix #4 將下ㄧ行註解取消, 觀察會如何? 觀察完恢復成註解
		// at.addElement(9);
		boolean p = false;
		// fix #5 將下ㄧ行 (Boolean) 註解 觀察會如何?
		p = /* 不須轉型 */ (Boolean) (at.elementAt(0));
		System.out.println(!p);
		System.out.println("$$$$$$$$");
	}

}