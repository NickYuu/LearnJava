
public class Program {
	public static void main(String[] args) {
		類別名稱 g = null;
		System.out.println("開始");
		g = new 類別名稱();
		// fix #2 觀察下面 呼叫 "添加洗窗水" 物件方法的方式
		g.添加洗窗水(2);
		System.out.println("?????????????????");
		// fix #3 觀察下面 存取 "洗窗水存量" 物件狀態的方式
		System.out.println(g.洗窗水存量);
		System.out.println("#################");
	}
}

// fix #1 觀察下面資料型態的設計
class 類別名稱 {
	public double 洗窗水存量;// 狀態(又可稱呼資料)
	// 行為 (又可稱呼方法)

	public void 添加洗窗水(double 添加量) {
		double n = 洗窗水存量 + 添加量;
		if (n >= 0) {
			洗窗水存量 = n;
		}
	}
}