package sem2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inputNotEmptyString {
    public static void main(String[] args) {
        System.out.println(input());
    }
    public static String input() {
        String str;
        Scanner sn = new Scanner(System.in);
        str = sn.nextLine();
        if (str.isEmpty()) throw new InputMismatchException("пустые строки вводить нельзя");
        return str;
    }
}
