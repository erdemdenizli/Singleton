
public class Singleton2 {

	private Singleton2() {
	}
	
	private static final Singleton2 s1 = new Singleton2();

	public static Singleton2 getInstance() {
		return s1;
	}

}
