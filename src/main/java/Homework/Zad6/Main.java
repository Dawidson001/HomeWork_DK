package Homework.Zad6;
//// Utwórz dostawcę obiektów klasy User z losowo wypełnionymi polami.
//        • Zdefiniuj listę np. 5 imion i nazwisk.
//        • Dodaj metodę która będzie tworzyła i zwracała użytkownika z losowymi
//        danymi (w tym także wiek).
//                                                                                                      • Po wywołaniu funkcji get() dostawca powinien zwracać użytkownika z
//                                                                                                          losowymi polami.
//        • Utwórz kilku użytkowników i wyświetl ich.

import Homework.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
Random generator = new Random();
    public static void main(String[] args) {
        Random generator = new Random();
        List<User> userList = Arrays.asList(new User("Andrzej", "Nowak"), new User("Darek", "Bialy"), new User("Krystian", "Wojtkiewicz"), new User("Robert", "Niewiadomo"), new User("Alicja", "Pulje"));
        userList.stream()
                .forEach((User)->
                {
                    int liczba1 = generator.nextInt(5);
                    int liczba2 = generator.nextInt(5);
                     int liczba3 = generator.nextInt(100);

                    User user = new User(userList.get(liczba1).getName(), userList.get(liczba2).getLastName(), liczba3);
                    System.out.println(user);
                });
//
//        Main main = new Main();
//        main.addUser();
//
//    }
//
//    public void addUser()
//    {
//        List<User> userList = Arrays.asList(new User("Andrzej", "Nowak"), new User("Darek", "Bialy"), new User("Krystian", "Wojtkiewicz"), new User("Robert", "Niewiadomo"), new User("Alicja", "Pulje"));
//        int liczba1 = generator.nextInt(5);
//        int liczba2 = generator.nextInt(5);
//        int liczba3 = generator.nextInt(100);
//        User user = new User(userList.get(liczba1).getName(), userList.get(liczba2).getLastName(), liczba3);
//        System.out.println(user);
    };
}