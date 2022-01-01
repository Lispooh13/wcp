package chap1;

public class main {
	public static void main(String[] args) {
		Person x;
		Person y;
		Person z;
		
		x = new Person();
		y = new Person();
		z = new Person();
		
		x.name = "太郎";
		x.age = 5;
		
		y.name = "次郎";
		y.age = 100;
		
		z.name = "花子";
		z.age = 10;
		
		x.jump();
		y.jump();
		z.jump();
		
		x.walk();
		y.walk();
		z.walk();
		
		x.run();
		y.run();
		z.run();
		
	}
}
