package Homework.Zad8;

import Homework.User;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Function;

//8. Utwórz instancję interfejsu Function.
//        • Jako parametr do funkcji przekaż String, natomiast zwracany powinien
//        być obiekt typu User.
//        • Funkcja powinna parsować przekazany String i na jego podstawie
//        tworzyć i zwracać obiekt typu User.
//        • Np.
//        • String text = „Jan,Nowak,18” zwróci Ci użytkownika z ustawionymi
//        wartościami dla poszczególnych pól.
public class Main
{
    public static void main(String[] args)
    {
        String text = "Andrzej,Nowak,16";

        Function<String, User> stringUserFunction = (String s) ->
        {
            String [] sa = s.split(",");
            return new User(sa[0], sa[1], Integer.parseInt(sa[2]));
        };
        User result = stringUserFunction.apply(text);
//        System.out.println(result.getName()+ " " + result.getLastName() + "   Wiek: "+  result.getWiek());
        System.out.println(result);



    }
}
