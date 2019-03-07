package Homework.Zad5;
//5. Napisz implementację interfejsu Predicate, która sprawdzi czy podana data odnosi się do wydarzenia z przeszłości, tzn. data < obecnadata
import Homework.User;

import java.time.LocalDate;
import java.util.function.Predicate;

public class Main
{
    public static void main(String[] args) {

        User user = new User("Andrzej", "Nowak", LocalDate.of(2005, 11, 21));

//        Predicate<LocalDate>userPredicate  = (value) -> value < LocalDate.of(LocalDate.now());
//        System.out.println(userPredicate.test(user.getLocalDate()));

    }
}
