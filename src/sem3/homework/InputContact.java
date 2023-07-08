package sem3.homework;

import sem3.homework.Exceptions.StringInputException;

import java.util.Scanner;

public class InputContact {
    private static Scanner scanner = new Scanner(System.in);
    public String input() {
        String value;
        while(true) {
            while (true) {
                try {
                    value = inputString("Введите фамилию, имя, отчество, дату рождения, телефон(7 цифр) и пол через пробел.\n" +
                            "для обозначения пола используйте буквы f или m\n" +
                            ">> ");
                    return value;

                } catch (StringInputException e) {
                    System.out.print("\033[H\033[J");
                    System.out.println("Строка не должна быть пустой");
                }
            }
        }
    }
    public static String inputString(String invite) throws StringInputException {
        String result;
        System.out.print(invite);
        result = scanner.nextLine();
        if (result.isEmpty())
            throw new StringInputException("Строка не должна быть пустой");
        return result;
    }
}
