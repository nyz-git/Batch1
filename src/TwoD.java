import java.util.Scanner;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and cols");
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int mat1[][] = new int[rows][cols];
		int mat2[][] = new int[rows][cols];
		int mat3[][] = new int[rows][cols];

		// inserting elements into mat1 array
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter the [" + i + "][" + j + "] element");
				mat1[i][j] = sc.nextInt();
			}
		}

		// inserting elements into mat2 array
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter the [" + i + "][" + j + "] element");
				mat2[i][j] = sc.nextInt();
			}
		}

		// addition
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				mat3[i][j] = mat1[i][j] + mat2[i][j];

			}
		}

		// printing
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(mat3[i][j] + " ");
			}
			System.out.println();
		}

	}

}
