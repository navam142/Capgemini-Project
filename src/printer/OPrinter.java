package printer;

import java.util.List;

public class OPrinter extends AbstractCharacterPrinter {
    private static final int COLS = 7;

    public OPrinter() {
        pattern = List.of(
                " ***** ",
                "*      *",
                "*      *",
                "*      *",
                " ***** ");
    }


    public void printRow(int row) {

        for (int j = 1; j <= COLS; j++) {
            if ((row == 1 || row == 5) && j > 1 && j < COLS) {
                System.out.print("*");
            } else if ((j == 1 || j == COLS) && row > 1 && row < 5) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}
