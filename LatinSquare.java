import java.util.Arrays;

public class LatinSquare {
    public static void main(String[] args) {
        int n = 4;
        
        int[][] square1 = generateLatinSquare(n);
        int[][] square2 = generateOrthogonalLatinSquare(square1, n);

        System.out.println("First One :");
        printSquare(square1);

        System.out.println("Second One :");
        printSquare(square2);
    }

    public static int[][] generateLatinSquare(int n) {
        int[][] square = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square[i][j] = (i + j) % n + 1;
            }
        }
        return square;
    }

    public static int[][] generateOrthogonalLatinSquare(int[][] square1, int n) {
        int[][] square2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square2[i][j] = (i + 2 * j) % n + 1;
            }
        }
        return square2;
    }

    public static void printSquare(int[][] square) {
        for (int[] row : square) {
            System.out.println(Arrays.toString(row));
        }
    }
}
