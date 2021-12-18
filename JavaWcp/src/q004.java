
public class q004 {
	public static void main(String[] args) {
	//1~100までの奇数の和
		int oddSum = 0;
		for(int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				oddSum += i;
			}
		}
		System.out.println(oddSum);
	}
}
