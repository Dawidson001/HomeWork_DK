package Homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


//        String przykald = "Lubie:Placki:;)";
//        String [] przyklad1 = przykald.split(":");
//        System.out.println(przyklad1[1]);

        LocalDate localDate =  LocalDate.of(2000, 11, 12);

        System.out.println(localDate.getYear());

    }

}
