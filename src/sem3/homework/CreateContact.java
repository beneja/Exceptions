package sem3.homework;

import sem3.homework.Exceptions.*;
public class CreateContact {
    public Contact create(String str) {
        String[] array = str.split(" ");
        if (array.length > 6) {
            throw new ArrayLimitException(str);
        }
        if (array.length < 6) {
            throw new ArrayLittleException(str);
        }
        if (array[3].length() != 10) {
            throw new DateException(array[3]);
        }
        if (array[4].length() != 7) {
            throw new NumberException(array[4]);
        }
        if (!array[5].equals("m") && !array[5].equals("f")) {
            throw new SexException(array[5]);
        }
        return new Contact(array[0], array[1], array[2], array[3], array[4], array[5]);
    }
}
