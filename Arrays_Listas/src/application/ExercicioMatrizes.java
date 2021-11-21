package application;

import java.util.Scanner;

public class ExercicioMatrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int x = 0; x < m; x++) {
			for (int y = 0; y < n; y++) {
				mat[x][y] = sc.nextInt();
			}
		}
		
		int seek = sc.nextInt();
		
		for (int x = 0; x < m; x++) {
			for (int y = 0; y < n; y++) {
				if (mat[x][y] == seek) {
					System.out.printf("Position %d,%d:%n", x, y);
					if (y > 0) {
						System.out.println("Left: " + mat[x][y - 1]);
					}
					if (x > 0) {
						System.out.println("Up: " + mat[x - 1][y]);
					}
					if (y + 1 < n) {
						System.out.println("Right: " + mat[x][y + 1]);
					}
					if (x + 1 < m) {
						System.out.println("Down: " + mat[x + 1][y]);
					}
				}
			}
		}
		
		sc.close();

	}

}
