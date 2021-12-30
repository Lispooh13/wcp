package chap1;

public class main {
	public static void main(String[] args) {
		Person x;
		Person y;
		
		x = new Person();
		y = new Person();
		
		x.name = "太郎";
		x.age = 5;
		
		y.name ="次郎";
		y.name = 100;
		
		x.jump();
		y.jump();
		
		x.walk();
		y.walk();
	}
}
