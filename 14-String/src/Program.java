
public class Program {
    public static void main(String[] args) {
        // fix 練習  #1  觀察此程式的執行情形
        String S1 = "Java" ; // 字串物件可以此特殊例子來產生
        String S2 = new String("Java") ;
        int 字元位置 = 0;
        //		java.lang.String類別
        System.out.println(S1.charAt(字元位置));
        System.out.println(S1.length());
        System.out.println(S1.toUpperCase());
        System.out.println(S1);
        System.out.println(S1.toLowerCase());
        System.out.println(S1);
        int 第一個想要的Index = 2;
        int 第一個不想要的Indexs = 4;
        System.out.println(S1.substring(第一個想要的Index,第一個不想要的Indexs));
        System.out.println(S1);
        int n = 862;
        //數字轉成字串："" + n
        String str = "tbd";
        str = "" + n;
        System.out.println(str);
        int bk = -9;
        //字串轉成數字：Integer.parseInt("98")
        bk = Integer.parseInt(str);
        System.out.println(bk + 1);
        System.out.println(Double.parseDouble("-762.5")+1);
        // fix 練習  #2  觀察下ㄧ行
        String we = "  周成光  ";
        System.out.println("????????????????");
        System.out.println("@" + we + "@");
        // fix 練習  #3 把 we所參考到的一個頭尾有空白的字串  的頭尾空白清除
        
        System.out.println("################");
        System.out.println("@" + we + "@");
        System.out.println("$$$$$$$$$$$$$$$$");
    }
    
}
