
public class Abc {

	public Abc(){
		System.out.println("Constructor called");
	}
	
	Abc(int a,double d ){
		System.out.println(a+" "+d);
	}
	
	public static void main(String[] args) {
	
		System.out.println("Start");
		Abc a = new Abc();//creating an object which calls the constr
		System.out.println("end");
		new Abc(7,8.9);// calling constr with has 2 parameter i.e int and double
	}

}
