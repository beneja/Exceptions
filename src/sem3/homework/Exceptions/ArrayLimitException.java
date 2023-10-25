package sem3.homework.Exceptions;
public class ArrayLimitException extends RuntimeException{

    public ArrayLimitException (String input){

        super(String.format("В строке [%s] слишком много значений", input));
    }

}
