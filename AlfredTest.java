

public class AlfredTest {
    public static void main(String[] args) {

        AlfredQuotes alfredBot = new AlfredQuotes();

        String testGreeting = alfredBot.basicGreeting();
        String guestGreeting = alfredBot.guestGreeting("Beth Kane");
        String dateAnnoucement = alfredBot.dateAnnouncement();
        String alfred = alfredBot.talk("Alfred");
        String alexis = alfredBot.talk("Alexis");
        String neither = alfredBot.talk("Bruce");
        String flash = alfredBot.knockKnock("Flash");
        String superman = alfredBot.knockKnock("Superman");
        String wonderwoman = alfredBot.knockKnock("WonderWoman");
        String joker = alfredBot.knockKnock("Joker");
        String captainAmerica = alfredBot.knockKnock("Captain America");

        System.out.println(testGreeting);
        System.out.println(guestGreeting);
        System.out.println(dateAnnoucement);
        System.out.println(alfred);
        System.out.println(alexis);
        System.out.println(neither);
        System.out.println(flash);
        System.out.println(superman);
        System.out.println(wonderwoman);
        System.out.println(joker);
        System.out.println(captainAmerica);


    }
}