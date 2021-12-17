
public class q006 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for(int n = 0; n < 5-(i+1); n++) {
				System.out.println("");
			}
			for(int k=0; k<(i+1)*2-1; k++) {
				System.out.println("*");
			}
			System.out.println("\n");
		}
	}
}
