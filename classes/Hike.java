package classes;

import java.util.Arrays;

public class Hike {
    private final MainHero[] heroes = new MainHero[100];

    private final MainHero[] invitedHeroes = new MainHero[100];

    private int quantity;

    private int invitedQuantity;

    private final String name;

    public Hike(MainHero[] heroes, String name) {
        quantity = heroes.length;
        this.name = name;
        for (int i = 0; i < heroes.length - 1; i++) {
            System.out.print(heroes[i].getName() + ", ");
            this.heroes[i] = heroes[i];
        }
        System.out.println(heroes[heroes.length - 1].getName() + " выступят в " + name + ".");
        this.heroes[heroes.length - 1] = heroes[heroes.length - 1];
    }

    public MainHero[] getHeroes() {
        return heroes;
    }

    public MainHero[] getInvitedHeroes() {
        return invitedHeroes;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getInvitedQuantity() {
        return invitedQuantity;
    }

    public void appendHero(MainHero h) {
        heroes[quantity] = h;
        quantity++;
    }

    public void appendHeroInInvited(MainHero h) {
        invitedHeroes[invitedQuantity] = h;
        invitedQuantity++;
    }

    public boolean findInHeroes(MainHero h) {
        for (MainHero hero : heroes) {
            if (hero == h) {
                return true;
            }
        }
        return false;
    }

    public boolean findInInvitedHeroes(MainHero h) {
        for (MainHero hero : invitedHeroes) {
            if (hero == h) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hike)) return false;
        Hike hike = (Hike) o;
        return Arrays.equals(heroes, hike.getHeroes());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getHeroes());
    }

    @Override
    public String toString() {
        return "Hike= " + name;
    }
}
