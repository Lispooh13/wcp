
public class fun619 {
	public static void main(String[] args) {
		int[] a = {2, 4, 1, 3, 5, 7, 2, 1, 4, 8};
		int sum;
		sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += a[i];
		}
		System.out.println("平均=" + (double)sum/10.0 );
	}
}
