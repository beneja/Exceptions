package sem3.homework.Exceptions;
public class SexException extends RuntimeException{

    public SexException (String input){

        super(String.format("Пол должен указываться 'm' или 'f', введено: [%s]", input));
    }

}
