package Classes;

import Abstract.Object;

public class Garage extends Object
{

    @Override
    public String getName() {
      //  System.out.println(name);
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
