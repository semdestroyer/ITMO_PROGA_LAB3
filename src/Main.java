import Abstract.Person;
import Classes.*;

import java.util.ArrayList;

public class Main
{
    public static void main(String args[])
    {
        ArrayList<Person> persons = new ArrayList<Person>();

        Garage g = new Garage();
        g.setName("Гараж");
        Car c = new Car();
        c.setName("Машина");
        c.getName();
        persons.add(new Drivers("Шоферы"));
        persons.add(new Baby("Малышки"));
        persons.add(new DriverPerson("Бублик"));

        for (Person p:persons)
        {
            if (p.getName() == "Малышки")
            {
                p.walk();
                for (Person p2:persons)
                {
                    if (p2.getName() == "Бублик") {
                        p.see(p2);
                        DriverPerson dp = (DriverPerson) p2;
                        dp.drive();
                    }
                }
            }
            p.getName();
        }



    }


}
