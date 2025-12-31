package printer;

import java.util.List;

public class PPrinter extends AbstractCharacterPrinter {

    public PPrinter() {
        pattern = List.of(
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
        );
    }

    private static final int cols = 7;

    public void printRow(int row) {
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
}
