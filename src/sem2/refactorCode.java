package sem2;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class refactorCode {


    public static void main(String[] args) throws Exception {
        //code 1
        try {
            int a = inputInt();
            int b = inputInt();
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        //code 2
        int[] intArray = new int[9];
        intArray[8] = 8;
        try {
            int d = 0;
            double[] catchedRes1 = new double[0];
            catchedRes1[0] = (double) intArray[8] / d;

            System.out.println("catchedRes1 = " + Arrays.toString(catchedRes1));
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + Arrays.toString(e.getStackTrace()));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

    }
    //code 3
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {

                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("неверный ввод");
            }
        }
    }
}

