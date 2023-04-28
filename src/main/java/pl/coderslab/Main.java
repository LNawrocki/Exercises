package pl.coderslab;

public class Main {
    public static void main(String[] args) {

        int[] intTab = {1, 2};
        String[] strTab = {"aaa", "bbb", "ccc"};
        String[][] strArr = {
                {"a1", "a2", "a3"},
                {"b1", "b2", "b3"},
                {"c1", "c2", "c3"}};
        int[][] intArr = {
                {11, 12, 13},
                {21, 22, 23},
                {31, 32, 33}};


        Lntool.printIntTable(intTab);
        System.out.println();
        Lntool.printStringTable(strTab);
        System.out.println();
        Lntool.printStringArr(strArr);
        System.out.println();
        Lntool.printIntArr(intArr);

    }
}