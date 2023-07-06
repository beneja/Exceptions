package sem2;

import java.util.Scanner;

public class inputFloat {
    public static void main(String[] args) {
        System.out.println("Введите дробное число в пределах от 3.4E+38 до 1.40E-45");
        System.out.println(inputFloat());
    }

    public static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {

                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("неверный ввод");
            }
        }
    }
}
