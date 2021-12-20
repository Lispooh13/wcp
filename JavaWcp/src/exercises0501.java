
public class exercises0501 {
	public static void main(String[] args) {
		//10個の数値を2倍にして表示
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for(int n = 0; n < array.length; n++) {
			int result = array[n]*2;
			System.out.println(result);
		}
	}
}
