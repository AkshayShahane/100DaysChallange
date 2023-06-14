package Day_01;

public class Java8DefaultMethodDemo implements DemoInterface {

	public static void main(String[] args) {
		DemoInterface objDemoInterface=new Java8DefaultMethodDemo();
		objDemoInterface.modelName();
		DemoInterface.gears();
	}

	public void speed() {
		System.out.println("java");
	}

}
