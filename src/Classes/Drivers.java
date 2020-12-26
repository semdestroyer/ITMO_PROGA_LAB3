package Classes;

import Abstract.Driver;
import Abstract.Person;
import Enums.State;
import Enums.Status;

public class Drivers extends Driver
{

    public Drivers(String name) {
        super(name);
    }

    @Override
    public void onSeeRepairing() {

    }

    @Override
    public void getSeeRepairing() {

    }

    @Override
    public void setSeeRepairing() {

    }

    @Override
    public void drive() {

    }

    @Override
    public String getName() {
      //  System.out.println(name);
        return name;
    }

    @Override
    public void setName(String name) {

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
    public void setStatus(Status s) {
        s = status;
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




}
