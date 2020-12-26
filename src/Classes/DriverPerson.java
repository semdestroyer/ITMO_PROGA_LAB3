package Classes;

import Abstract.Driver;
import Abstract.Person;
import Enums.State;
import Enums.Status;
import Interfaces.ArrivingObject;
import Interfaces.Drive;

public class DriverPerson extends Driver implements ArrivingObject, Drive
{
    public DriverPerson(String name) {
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
        System.out.println(getName() + " приехал");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " подъехал");
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
    public void onExit() {

    }

    @Override
    public void seat() {

    }

    @Override
    public void setStatus(Status s) {

    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public void setState(State s) {

    }

    @Override
    public State getState() {
        String out;
        switch (this.state)
        {
            case SAD: out = "взгрустнул"; break;
            case ANGRY: out = "рассердился"; break;
            case SCARE: out = "испугался"; break;
            case HAPPY: out = "обрадовался"; break;
            default: out = "рассердился"; break;

        }
        System.out.println(getName() + out);
        return this.state;
    }

    @Override
    public void whenNear() {
        System.out.println("подъезжает");
    }

    @Override
    public void onArrive() {
        System.out.println("приехал");
    }
}
