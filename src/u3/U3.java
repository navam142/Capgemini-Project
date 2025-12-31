package u3;

import util.Constants;

public class U3 {

    public static String[] getOPattern(int size) {
        String[] pattern = new String[size];

        // Create the pattern
        for (int i = 0; i < size; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    row.append("* ");
                } else {
                    row.append("  ");
                }
            }
            pattern[i] = row.toString();
        }

        return pattern;
    }

    public static String[] getPPattern(int size) {
        String[] pattern = new String[size];

        // Create the pattern
        for (int i = 0; i < size; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < size / 2 + 1; j++) {
                if (i == 0 || i == size / 2 || j == 0 || (i < size / 2 && j == size / 2)) {
                    row.append("* ");
                } else {
                    row.append("  ");
                }
            }
            pattern[i] = row.toString();
        }

        return pattern;
    }

    public static String[] getSPattern(int size) {
        String[] pattern = new String[size];

        // Create the pattern
        for (int i = 0; i < size; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < size; j++) {
                if ((i == 0 && j != size - 1) || (i == size - 1 && j != 0) || (i == size / 2 && j > 0 && j < size - 1) || (j == 0 && i < size / 2) || (j == size - 1 && i > size / 2)) {
                    row.append("* ");
                } else {
                    row.append("  ");
                }
            }
            pattern[i] = row.toString();
        }

        return pattern;
    }

    public static void printOops() {
        int rows = Constants.ROWS;
        String[] oPattern = getOPattern(rows);
        String[] pPattern = getPPattern(rows);
        String[] sPattern = getSPattern(rows);

        for (int i = 0; i < rows; i++) {
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
    }
}
