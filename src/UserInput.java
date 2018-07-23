import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);//creating scanner class object
		
		System.out.println("Enter roll no : ");
		int roll = sc.nextInt();
		
		System.out.println("Enter Name :");
		String name = sc.next();
		
		System.out.println("Enter percentage : ");
		float p = sc.nextFloat();
		
		System.out.println(roll);
		System.out.println(name);
		System.out.println(p);
	}

}
