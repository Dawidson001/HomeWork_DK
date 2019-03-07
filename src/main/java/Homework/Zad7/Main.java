package Homework.Zad7;
//7. Napisz implementację interejsu Supplier, która na podstawie obecnej daty wyświetli jaki mamy dziś dzień, np. currentData = 08.10.2018 -> Poniedziałek!
import java.time.LocalDate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        Supplier<String> supplier = () ->
        {
            LocalDate localDate = LocalDate.of(2018, 10, 12);
            return String.valueOf(localDate.getDayOfWeek() + " !");
        };
        System.out.println(supplier.get());



    }


}
