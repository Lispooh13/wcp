
public class fun613 {
	public static void main(String[] args) {
		//正三角形
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int k =0; k<=2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
