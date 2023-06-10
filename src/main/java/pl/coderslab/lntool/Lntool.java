package pl.coderslab.lntool;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Lntool {


//    OPEN FROM FILE    *************************************

//    File file = new File("readFile.txt");
//    StringBuilder reading = new StringBuilder();
//    try {
//        Scanner scan = new Scanner(file);
//        while (scan.hasNextLine()) {
//            reading.append(scan.nextLine() + "\n");
//        }
//    } catch (FileNotFoundException e) {
//        System.out.println("Brak pliku.");
//    }
//    System.out.println(reading.toString());

//    -----------------------------------------------------

//    Path path1 = Paths.get("path1.txt");
//    try {
//        for (String line : Files.readAllLines(path1)) {
//            System.out.println(line);
//        }
//    } catch (IOException e) {
//        e.printStackTrace();
//    }



//    WRITE TO FILE  ************************************************

//    try (PrintWriter printWriter = new PrintWriter("writeFile.txt")) {
//        printWriter.println("first line");
//        printWriter.println("second line");
//    } catch (FileNotFoundException ex) {
//        System.out.println("Błąd zapisu do pliku.");
//    }

//try (FileWriter fileWriter = new FileWriter("writeFile.txt", true)){
//        fileWriter.append("first line\n");
//        fileWriter.append("second line\n");
//    } catch (IOException ex) {
//        System.out.println("Błąd zapisu do pliku.");
//    }


//    Path path1 = Paths.get("path1.txt");
//    try {
//        Files.writeString(path1, "some text");   StandardOpenOption.APPEND
//    } catch (IOException ex) {
//        System.out.println("Nie można zapisać pliku.");
//    }


//    z egzamnu
//
//    public static void create(int max) {
//    int n = getInt("Input number of partcipants: ");
//    try (FileWriter fileWriter = new FileWriter("exam.txt", false)) {
//        for (int i = 1; i <= n; i++) {
//            fileWriter.append(getLogin("Podaj login: ")).append(" ");
//            fileWriter.append(String.valueOf(getInt("Podaj ilość punktów: "))).append("\n");
//        }
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//    File file = new File("exam.txt");
//    try (Scanner scanner = new Scanner(file); FileWriter fileWriter = new FileWriter("exam_passed.txt", false)) {
//        while (scanner.hasNextLine()) {
//            String[] elements = scanner.nextLine().split(" ");
//            if (Integer.parseInt(elements[1]) >= max * 0.60) {
//                fileWriter.append(elements[0]).append(" ").append(elements[1]).append("\n");
//            }
//        }
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//}

public static boolean writeStringListToFile(String writeStr1, String writeStr2, String pathFile) {
    Path path = Paths.get(pathFile);
    List<String> outList = new ArrayList<>();
    outList.add(writeStr1);
    outList.add(writeStr2);
    try {
        Files.write(path, outList); //StandardOpenOption.APPEND
    } catch (IOException ex) {
        System.out.println("Nie można zapisać pliku.");
    }
    return true;
}


//    public static String tableElementsToString() {
//
//
//        return "true";
//    }
//
//    public static boolean writeWordToFile() {
//
//        return true;
//    }

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
