package classes;

import utilities.*;

import java.util.Objects;

public class Tiger extends MainHero {


    public Tiger(String name, Location currentPosition, Home home) {
        super(name, currentPosition, home);
    }

    public boolean jumpsForward() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "home=" + this.getHome().getLocationName() +
                '}';
    }
}
