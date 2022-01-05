package chap4;

public class Discount {
	public static void main(String[] args) {
		int FirstPrice = 1000;
		double Discount = FirstPrice * 0.7;
		int result = (int)Discount;
//		小数点以下切り捨て
		System.out.println(result);
	}
}
