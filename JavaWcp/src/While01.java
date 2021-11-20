
public class While01 {
    public static void main(String[] args) {
        int number = 1;
     // while文：ループ開始
        while (number < 50) {
        	// ブロック処理
            number *= 2;
            System.out.println("While01 = " + number);
        }
    }
}
