package utilities;

public abstract class Hero implements HeroInterface{

    private Location currentPosition;
    private final String name;

    protected Hero(String name, Location currentPosition) {
        this.name = name;
        this.currentPosition = currentPosition;
    }


    @Override
    public void goTo(Location l) {
        currentPosition = l;
        System.out.println(name + " пойдет сейчас в " + currentPosition.getLocation().getLocationName() + ".");
    }

}
