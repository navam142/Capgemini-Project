package u2;
import printer.AbstractCharacterPrinter;
import printer.OPrinter;
import printer.PPrinter;
import printer.SPrinter;

import java.util.*;

import java.util.ArrayList;

public class U2 {

    static List<List<String>> result = new ArrayList<>();

    public static void display(List<String> pattern) {
        for (String s : pattern) {
            System.out.print(s);
            if (pattern.indexOf(s) != pattern.size() - 1)
                System.out.println();
        }
    }

    public static void getPattern() {
        AbstractCharacterPrinter o = new OPrinter();
        AbstractCharacterPrinter p = new PPrinter();
        AbstractCharacterPrinter s = new SPrinter();


        result.add(o.getPattern());
        result.add(o.getPattern());
        result.add(p.getPattern());
        result.add(s.getPattern());
    }

    public static void printOops() {
        getPattern();
        for (List<String> pattern : result) {
            display(pattern);
        }
    }

}
