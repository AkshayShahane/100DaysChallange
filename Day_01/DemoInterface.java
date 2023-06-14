package Day_01;

public interface DemoInterface {
	
	public void speed();

	public default void modelName() {
		System.out.println("default method demo");
	}
	
	public static void gears() {
		System.out.println("Gears are 4");
	}
}
