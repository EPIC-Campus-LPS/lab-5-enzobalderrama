package packageName;

import java.util.Scanner;

public class Part3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i = 0; i < 9; i++) {
			int num = scan.nextInt();
			arr[i] = num;
			
		}
		int row1 = arr[0] + arr[1] + arr[2];
		int row2 = arr[3] + arr[4] + arr[5];
		int row3 = arr[6] + arr[7] + arr[8];
		int col1 = arr[0] + arr[3] + arr[6];
		int col2 = arr[1] + arr[4] + arr[7];
		int col3 = arr[2] + arr[5] + arr[8];
		int dia1 = arr[0] + arr[4] + arr[8];
		int dia2 = arr[2] + arr[4] + arr[6];
		if (row1 == row2 && row2 == row3 && col1 == col2 && col2 == col3 && dia1 == dia2) {
			System.out.println("This array is a magic square.");
		}
		else {
			System.out.println("This array is not a magic square.");
		}
	}

}
