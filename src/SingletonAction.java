
public class SingletonAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Singleton1 a1 = Singleton1.s1;
		 Singleton1 a2 = Singleton1.s1;
		 
		 System.out.println(a1);
		 System.out.println(a2);
		 
		 System.out.println("*************");
		 
		 Singleton2 b1 = Singleton2.getInstance();
		 Singleton2 b2 = Singleton2.getInstance();
		 
		 System.out.println(b1);
		 System.out.println(b2);
		 
		 System.out.println("*************");
		 
		 Singleton3 c1 = Singleton3.s1;
		 Singleton3 c2 = Singleton3.s1;
		 
		 System.out.println(c1);
		 System.out.println(c2);
		 

		 
		
		
	}

}
