package Classes;

import Abstract.Person;
import Enums.State;
import Enums.Status;
import Interfaces.Repairs;

public class Mechanics extends Person implements Repairs
{
    public Mechanics(String name) {
        super(name);
    }

    @Override
    public String getName() {
  //      System.out.println(name);
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void walk() {

    }

    @Override
    public void see(Person p) {

    }

    @Override
    public void stop() {

    }

    @Override
    public void seat() {

    }

    @Override
    public void setStatus(Status s)
    {
        this.status = s;
    }
    @Override
    public Status getStatus()
    {
        return status;
    }

    @Override
    public void setState(State s) {

    }

    @Override
    public State getState() {
        return state;
    }


    @Override
    public void fix() {
        System.out.print(getName() + "чинят");
    }

    @Override
    public void checkFixingProgress(int hp) {
        System.out.print(getName() + " починили на " + hp + "%");
    }
}
