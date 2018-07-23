
class Father {

	public Father() {
		System.out.println("hjhjFather Con");
	}
}

public class Son extends Father {

	public Son() {
		super();
		System.out.println("Son con");

	}

	public static void main(String[] args) {
		new Son();
	}

}
