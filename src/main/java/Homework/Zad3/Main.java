package Homework.Zad3;
//3. Przygotuj prostą metodę która przyjmuje obiekt klasy User a następnie
//wyświetla informację o nim.
//• Dodaj do klasy User pole typu LocalDate które będzie przechowywało
//datę urodzenia użytkownika.
//• Dodaj także metodę zwracającą wiek użytkownika.
//• Utwórz instancję interfejsu Consumer do którego przekażesz
//użytkownika i po wywołaniu metody accept wyświetlone zostaną
//parametry.
import Homework.User;

import java.time.LocalDate;
import java.util.function.Consumer;

public class Main
{
    public static void main(String[] args) {

        User user = new User("Andrzej", "NOwak", LocalDate.of(2000, 11, 21));
//        user.howManyYear(user);
//        user.showUser(user);

        Consumer<User>consumer = (s) ->
        {
            s.showUser(user);
            s.howManyYear(user);
        };
            consumer.accept(user);
        }



}
