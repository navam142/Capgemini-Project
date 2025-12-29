package utility;

public class CharacterPrinter {

    static void printO(int row) {
        int cols = 7;

        for (int j = 1; j <= cols; j++) {
            if ((row == 1 || row == 5) && j > 1 && j < cols) {
                System.out.print("*");
            } else if ((j == 1 || j == cols) && row > 1 && row < 5) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    static void printP(int row) {
        int cols = 6;

        for (int j = 1; j <= cols; j++) {
            if (row == 1 && j < cols) {
                System.out.print("*");
            } else if (row == 3 && j < cols) {
                System.out.print("*");
            } else if (j == 1) {
                System.out.print("*");
            } else if (j == cols && row == 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    static void printS(int row) {
        int cols = 6;

        for (int j = 1; j <= cols; j++) {
            if (row == 1 && j < cols) {
                System.out.print("*");
            } else if (row == 3 && j < cols) {
                System.out.print("*");
            } else if (row == 5 && j < cols) {
                System.out.print("*");
            } else if (j == 1 && row < 3) {
                System.out.print("*");
            } else if (j == cols && row > 3) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {
            printO(row);
            System.out.print("  ");
            printO(row);
            System.out.print("  ");
            printP(row);
            System.out.print("  ");
            printS(row);
            System.out.println();
        }
    }
}
