package lang.print.gaps.task4;

import javax.swing.plaf.synth.SynthStyle;

public class FormulaCreator {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        double res = (9 * (a * a) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);
        System.out.println(res);
    }
}
