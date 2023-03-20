package Util;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.next();
    }

    public static int getInt() {
        return scanner.nextInt();
    }
}
