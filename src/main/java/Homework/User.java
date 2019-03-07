package Homework;

import java.time.LocalDate;

public class User
{
    private String name;
    private String lastName;
    private LocalDate localDate;
    private int wiek;

    public User(String name, String lastName, int wiek) {
        this.name = name;
        this.lastName = lastName;
        this.wiek = wiek;
    }

    public User(String name, String lastName, LocalDate localDate) {
        this.name = name;
        this.lastName = lastName;
        this.localDate = localDate;
    }


    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public int getWiek() {
        return wiek;
    }

    public void showUser (User user) {

        System.out.println(getName() + " " + getLastName() + " " + getLocalDate());
}
    public Integer howManyYear (User user)
    {
        System.out.print("Użytkownik ma : ");
        System.out.println(2019 - user.getLocalDate().getYear() + " lat");
        return 2019 - user.getLocalDate().getYear();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
