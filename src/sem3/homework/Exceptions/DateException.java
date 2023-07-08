package sem3.homework.Exceptions;
public class DateException extends RuntimeException{

    public DateException (String input){

        super(String.format("Некорректный формат даты Введено: [%s]", input));
    }

}