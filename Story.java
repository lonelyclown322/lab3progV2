import classes.*;
import classes.MainHero;
import utilities.Home;

public class Story {
    public static void main(String[] args) {

        Pyatachok pyatachok = new Pyatachok("Пятачок", Home.PyatachokHome, Home.PyatachokHome);
        MainHero rabbit = new MainHero("Кролик", Home.RabbitHome, Home.RabbitHome);
        Pooh pooh = new Pooh("Винни-Пух", Home.PoohHome, Home.PoohHome);
        Tiger tiger = new Tiger("Тигра", Home.TigerHome, Home.TigerHome);
        MainHero roo = new MainHero("Ру", Home.RooHome, Home.RooHome);
        MainHero kenga = new MainHero("Кенга", Home.KengaHome, Home.KengaHome);

        MainHero[] crew = new MainHero[]{pyatachok, rabbit, pooh, roo, kenga};
        Hike hike = new Hike(crew, "поход завтра утром");

        rabbit.inviteToHike(tiger, hike);

        rabbit.goTo(tiger.getHome());

        Status status = new Status();

        status.nextDay();
        status.turnWeatherToBad();
        pooh.isAfraid();
        pooh.thinkOfHoney(status);
        pooh.isAfraid();
        pyatachok.goTo(pooh.getCurrentPosition());
        pooh.shareFeelings(pyatachok);
        pyatachok.beIndifferent(pooh);
        pyatachok.thinkOfEvilPlan(status);
        pyatachok.goTo(rabbit.getHome());
        pooh.goTo((rabbit.getHome()));
        pyatachok.shareEvilPlan(status, tiger);

    }
}
