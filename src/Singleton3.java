
public class Singleton3 {

	private Singleton3() {
	}

	public static Singleton3 s1; //can be final as well

	static {
		s1 = new Singleton3();
	}

}
