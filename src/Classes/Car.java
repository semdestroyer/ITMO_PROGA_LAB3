package Classes;

import Abstract.Object;

public class Car extends Object
{
    private int hp;


    @Override
    public String getName()
    {
     //   System.out.println(name);
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }
}
