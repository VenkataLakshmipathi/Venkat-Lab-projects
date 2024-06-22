package javafullstack;
	import java.util.Scanner;
	public class TransposeMatrix {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);
	        int[][] matrix = new int[3][4];//3*4 matrix
	        System.out.println("Enter the elements of a 3x4 matrix:");//input from the user
	        for (int i = 0; i < 3; i++) {//row
	            for (int j = 0; j < 4; j++) {//column
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println("before Matrix:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	        int[][] transpose = new int[4][3]; // Calculate the transpose of the matrix
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 4; j++) {
	                transpose[j][i] = matrix[i][j];
	            }
	        }
	        System.out.println("Transpose of the Matrix:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(transpose[i][j] + " ");
	            }
	            System.out.println();
	        }

	    }
	}