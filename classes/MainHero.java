package classes;

import java.util.Objects;

import utilities.Hero;
import utilities.MainHeroInterface;
import utilities.Home;
import utilities.Location;

public class MainHero extends Hero implements MainHeroInterface {
    private final String name;
    private Location currentPosition;
    private boolean Afraid = false;
    private final Home home;

    public Location getHome() {
        return home;
    }

    public boolean getAfraid() {
        return Afraid;
    }

    public void setAfraid(boolean t) {
        this.Afraid = t;
    }

    public Location getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Location currentPosition) {
        this.currentPosition = currentPosition;
    }

    public MainHero(String name, Location currentPosition, Home home) {
        super(name, currentPosition);
        this.name = name;
        this.home = home;
        this.currentPosition = home;
    }


    public String getName() {
        return name;
    }

    @Override
    public void inviteToHike(MainHero whoIsAsked, Hike hike) {
        System.out.println(this.name + " хочет спросить " + whoIsAsked.getName() + ": \"Что ты завтра собираешься делать?" +
                " Если ничего, то давай сходим в " + hike.getName() + "?\"");
        hike.appendHeroInInvited(whoIsAsked);
    }

    @Override
    public void isAfraid() {
        if (!Afraid) {
            System.out.println(this.name + " не боялся.");
        } else {
            System.out.println(this.name + " испугался.");
        }
    }

    @Override
    public void shareFeelings(MainHero h) {
        if (this.Afraid) {
            System.out.println(this.name + " сказал персонажу " + h.name + ", что ему страшно.");
        }
    }

    @Override
    public void beIndifferent(MainHero h) {
        System.out.println(this.name + " сказал персонажу " + h.name + ", что его это не особо волнует.");
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", currentPosition=" + currentPosition +
                ", Afraid=" + Afraid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MainHero)) return false;
        MainHero mainHero = (MainHero) o;
        return Afraid == mainHero.Afraid && Objects.equals(getName(), mainHero.getName())
                && Objects.equals(getCurrentPosition(), mainHero.getCurrentPosition())
                && getHome() == mainHero.getHome();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCurrentPosition(), Afraid, getHome());
    }
}