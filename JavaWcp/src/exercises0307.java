
public class exercises0307 {
	public static void main(String[] args) {
		int score = 60;
		if (score >= 60) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		
		if(score >= 80) {
			System.out.println("たいへんよくできました");
		}else if(score >= 60) {
			System.out.println("よくできました");
		}else {
			System.out.println("残念でした");
		}
		
		if(score >= 80) {
			System.out.println("優");
		}else if(score >= 70){
			System.out.println("良");
		}else if(score >= 60){
			System.out.println("可");
		}else {
			System.out.println("不可");
		}
	}
}
