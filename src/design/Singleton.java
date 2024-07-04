package design;

//public class Singleton {
//	
//	private static Singleton instance;
//	private Singleton() {};
//	
//	synchronized public static Singleton getSingleton() {
//		if(instance==null)
//			instance = new Singleton();
//		return instance;
//	}
//}

public class Singleton{

	private static Singleton instance;
	
	private Singleton() {};
	
	synchronized public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}