
public class Switch01 {
	public static void main (String[] args) {
		int val = 2;
//		変数や値に対しての単純な分岐のときはswitch文の方がわかりやすい
		switch (val) {
		case 3:
			System.out.println("よくできました!");
//			break : switch文を終了する
			break;
		case 2:
			System.out.println("ふつうでした!");
			break;
		default:
			System.out.println("がんばろう!");
		}
	}

}
