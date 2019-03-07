package Homework.Zad4;
//4. Wykorzystując klasę User z poprzedniego zadania napisz metodę, którą za pomocą
// interfejsu Predicate sprawdzi, czy osoba jest pełnotelnia.
import Homework.User;

import java.time.LocalDate;
import java.util.function.Predicate;

public class Main
{
    public static void main(String[] args) {
        User user = new User("Andrzej", "Nowak", LocalDate.of(2005, 11, 21));
        int old = user.howManyYear(user);
        Predicate<Integer>predicate = (value) -> value >= 18;
        boolean trueFalse = predicate.test(user.howManyYear(user));
        if (trueFalse == true)
        {
            System.out.println("Uytkownik jest pełnoletni");
        }
        else
            System.out.println(
                    "Nie jest peloletni"
            );
    }
}
