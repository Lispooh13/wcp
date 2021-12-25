
public class fun614 {
	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<=5*2-(i*2)-2; k++) {
				System.out.print("*");
				//0,1,2,3,4,5,6,7,8で計9回出力
			}
			System.out.println();
		}
	}
}
