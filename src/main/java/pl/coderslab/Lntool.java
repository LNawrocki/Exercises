package pl.coderslab;

public class Lntool {

    public boolean writeLineToFile() {

        return true;
    }
    public static String tableElementsToString() {

        return "true";
    }

    public boolean writeWordToFile() {

        return true;
    }

    public static void printStringTable(String[] strTab) {
        for (String s : strTab) {
            System.out.println(s);
        }
    }

    public static void printIntTable(int[] intTab ) {
        for (int i : intTab) {
            System.out.println(i);
        }
    }

    public static void printStringArr(String[][] strArr) {
        for (String[] strings : strArr) {
            for (int j = 0; j < strings.length; j++) {
                System.out.print(strings[j]);
                if (j != strings.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printIntArr(int[][] intArr ) {
        for (int[] ints : intArr) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j]);
                if (j != ints.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
