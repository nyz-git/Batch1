import java.util.Scanner;

public class SumOfOddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the "+i+" element");
			arr[i] = sc.nextInt();
		}
		
		int even =0;
		int odd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2==0) {
				even+=arr[i];
			} else {
				odd+=arr[i];
			}
		}
		
		System.out.println("Sum of even no :"+even);
		System.out.println("Sum of odd no :"+odd);
	}

}
