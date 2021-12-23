
public class fun608 {
	public static void main(String[] args) {
		int Sum1 = 0;
		int Sum2 = 0;
		for(int i = 1; i <= 10; i++) {
			Sum1 += i;
		}
		for(int j = 1; j>=-5; j--) {
			Sum2 +=j;
		}
		System.out.println("1から10までの合計は"+Sum1);
		//本当は整数値が0以下の場合は合計は0にしたい。？
		System.out.println("1から-5までの合計は"+Sum2);
	}
}
