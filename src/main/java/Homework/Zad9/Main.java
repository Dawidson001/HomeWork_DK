package Homework.Zad9;


import java.time.LocalDate;
import java.util.function.Function;

//9. Utwórz instancję interfejsu Function
//• Jako parametr do funkcji przekaż String, natomiast zwracany powinien
//być obiekt typu LocalDate.
public class Main
{
    public static void main(String[] args) {
        String text = "2012-12-11";

        Function<String, LocalDate> stringLocalDateFunction = (String s) ->
        {

            return LocalDate.parse(s);
        };
        LocalDate result = stringLocalDateFunction.apply(text);
        System.out.println(result);

    }

}
