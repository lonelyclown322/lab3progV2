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
        if (this == o) return true;
        if (!(o instanceof MainHero)) return false;
        MainHero mainHero = (MainHero) o;
        return this.getAfraid() == mainHero.getAfraid() && Objects.equals(getName(), mainHero.getName())
                && Objects.equals(getCurrentPosition(), mainHero.getCurrentPosition())
                && getHome() == mainHero.getHome();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCurrentPosition(), getAfraid(), getHome());
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "home=" + this.getHome().getLocationName() +
                '}';
    }
}
