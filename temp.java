import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int n = sc.nextInt();

        System.out.println("\nIterative approach:");
        printPascalIterative(n);

        System.out.println("\nRecursive approach:");
        printPascalRecursive(n);

        sc.close();
    }

    public static void printPascalIterative(int n) {
        for(int i = 0; i < n; i++){
            int space = n - i - 1;

            for(int j = 0; j < space; j++){
                System.out.print(" ");
            }

            int value = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }

    public static void printPascalRecursive(int n) {
        for(int i = 0; i < n; i++){
            printSpaces(n - i - 1);
            printRow(i, 0);
            System.out.println();
        }
    }

    private static void printSpaces(int count) {
        if(count == 0) return;
        System.out.print(" ");
        printSpaces(count - 1);
    }

    private static void printRow(int row, int col) {
        if(col > row) return;
        System.out.print(binomialCoeff(row, col) + " ");
        printRow(row, col + 1);
    }

    private static int binomialCoeff(int n, int k) {
        if(k == 0 || k == n) return 1;
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }
}
