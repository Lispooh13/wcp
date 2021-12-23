
public class fun607 {
	public static void main(String[] args) {
		int f0, f1,fn;
		
		f0 = 0;
		System.out.println(f0);
		f1 = 1;
		System.out.println(f1);
		
		for(int i = 2; i <= 10; i++) {
			//iは2回目から10回目のループという意味か！
			fn = f0 + f1;
			System.out.println(fn);
			f0 = f1;
			f1 = fn;
		}
	}
}
