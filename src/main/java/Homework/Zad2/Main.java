package Homework.Zad2;
//2. Napisz implementację interfejsu Consumer która przyjmie czas w postaci obiektu String w formacie, np "08:20" i
// wyświetli poniższą wiadomość:
//Godzina: 08
//Minuty: 20
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        String godizna = "18:20";



        Consumer<String> consumer = (s) ->
        {
          String [] a = s.split(":");
            System.out.println("Godzina: "  + a[0]);
            System.out.println("Minuta: "  + a[1]);

        };
        trimValue(consumer, godizna);
    }

    static void trimValue(Consumer<String> trimAction, String s) {
        trimAction.accept(s);
    }
}