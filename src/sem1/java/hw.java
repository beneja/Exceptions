package sem1.java;

public class hw {
    private static void checkArrays(Integer[] a, Integer[] b) throws RuntimeException {
        if (a == null || b == null) {
            throw new RuntimeException("Передан null массив");
        }
        if (a.length == 0 || b.length == 0) {
            throw new IllegalArgumentException("Размер массива не может быть равен нулю");
        }
        if (a.length != b.length) {
            throw new IllegalArgumentException("Массивы не равны");
        }
    }

    public static Integer[] subtraction(Integer[] array1, Integer[] array2) {
        checkArrays(array1, array2);
        Integer[] result = new Integer[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] - array2[i];
        }
        return result;
    }

    public static Integer[] division(Integer[] array1, Integer[] array2) {
        checkArrays(array1, array2);
        Integer[] result = new java.lang.Integer[array1.length];
        try {
            for (int i = 0; i < array1.length; i++) {
                result[i] = array1[i] / array2[i];
            }
        } catch (ArithmeticException e) {
            throw new RuntimeException("Деление на ноль");
        }

        return result;

    }
}
