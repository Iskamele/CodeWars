package Kyu8.T01_ParseNiceIntFromCharProblem;

public class NewCharProblem {
    public static int howOld(final String herOld) {
        return Integer.parseInt(herOld.replaceAll("[^0-9]", ""));
    }
}
