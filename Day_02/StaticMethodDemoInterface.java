package Day_02;

public interface StaticMethodDemoInterface {

	public void walk();
	public void eat();
	public void sleep();
	
	public static void wakeup() {
		System.out.println("Early Wakeup");
	}
}
