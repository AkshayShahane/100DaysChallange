package Day_02;

public class Java8staticMethodInInterface implements StaticMethodDemoInterface {

	@Override
	public void walk() {
		System.out.println("Can Walk");
	}

	@Override
	public void eat() {
		System.out.println("Can eat");

	}

	@Override
	public void sleep() {
		System.out.println("Can Sleep");

	}

	public static void main(String[] args) {
		StaticMethodDemoInterface.wakeup();
	}
}
