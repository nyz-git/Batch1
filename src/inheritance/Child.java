package inheritance;

class GrandParent{
	
	void print() {
		System.out.println("I am Grandparent");
	}
}


class Parent extends GrandParent {

	void display() {
		System.out.println("I am Parent");
	}
}

public class Child extends Parent {

	void show() {
		System.out.println("I am Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.show();
		c.display();
		c.print();

	}

}
