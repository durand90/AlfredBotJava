import java.util.Date;

public class AlfredQuotes {


    public String basicGreeting() {
        return "Hello, lovely to see you. How are you";

    }

    public String guestGreeting(String name) {
        return "Hello, " + name + ". How are you doing?";
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "Today is " + date;
    }

    public String talk (String name) {
        if (name.indexOf("Alfred") > -1) {
            return "Right away sir. She certainly isn't sophisticated enough for that.";
        } 
        if (name.indexOf("Alexis") > -1) {
            return "At your service. As you wish, naturally.";
        }
        else 
            return "Right. and with that I shall retire.";

    }

    public String knockKnock(String text) {
        if (text.indexOf("Flash") > -1) {
            return "Let him in, he's okay";
        }
        else if (text.indexOf("Superman") > -1) {
            return "No, he isn't tough enough";
        }
        else if (text.indexOf("WonderWoman") > -1) {
            return "Yeah, she's cool";
        }
        else if (text.indexOf("Joker") > -1) {
            return "the ultimate maniac";
        }
        else 
            return "Go away, we don't know them.";    }

}