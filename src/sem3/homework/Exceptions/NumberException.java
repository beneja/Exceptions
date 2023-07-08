package sem3.homework.Exceptions;
public class NumberException extends RuntimeException{
    
        public NumberException (String input){

        super(String.format("Некорректный формат номера, Введено: [%s]", input));
    }
}
