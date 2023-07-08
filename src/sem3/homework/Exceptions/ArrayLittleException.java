package sem3.homework.Exceptions;
public class ArrayLittleException extends RuntimeException{

    public ArrayLittleException (String input){

        super(String.format("В строке [%s] заполнены не все поля", input));
    }

}