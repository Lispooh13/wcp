package chap5;

public class Age3 {
	public static void main(String[] args) {
		int age = 100;
		System.out.println("年齢は"+age+"歳");
		if(age < 18) {
			System.out.println("お断り");
		}else if(age >= 18 && age < 80){
			System.out.println("どうぞ");
		}else {
			System.out.println("どうぞどうぞ");
		}
	System.out.println("おしまい");
	}
}
