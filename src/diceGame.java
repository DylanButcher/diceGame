import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class diceGame {
    private static Scanner HaveYouSeenJohnWick3 = new Scanner(System.in);
    private static HashMap<String, String> Dog = new HashMap<>();
    private static int chickenSoup = 3;
    private static String[] spiderManDiesInInfinityWar = new String[2], OwO = new String[2];  //array to hold usernames and passwords entered by usser

    public static void main(String[] args) {
        WasThisImportant();
        WhoopsIChangedIt();
    }

    private static void WhoopsIChangedIt() {
        niHao();
        System.out.print("Welcome to the Dice Game, what would you like to do(type help if unknown) >>> ");
        String dylanGotTheGay = HaveYouSeenJohnWick3.nextLine();
        switch (dylanGotTheGay.toUpperCase()) {
            case ("HELP"):
                niHao();
                System.out.println("Here are the syntaxes:\n[HELP]For Help Menu\n[LOGIN]To Login and Play\n[SCORES]To View ScoreBoard");
                WhoopsIChangedIt();
                break;
            case ("LOGIN"):
                didYouNeedThis();
                break;
            case ("SCORES"):
                //viewScores();
                break;
            case ("REGISTER"):
                //register();
                break;
            default:
                niHao();
                System.out.println("Unknown Command, please try again");
                WhoopsIChangedIt();
        }
    }

    private static void WasThisImportant() {
        try {
            String UwU;
            BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
            while ((UwU = reader.readLine()) != null) {
                String[] splits = UwU.split(":");
                Dog.put(splits[0], splits[1]);
            }
        } catch (IOException e) {
            System.out.println("Error importing valid users, Program will Exit");
            System.exit(0);
        }
    }

    private static void didYouNeedThis() {
        niHao();
        for (int i = 0; i < 2; i++) {   // for loop that lets them enter said values
            System.out.print("What's the username for Player " + (i + 1) + " ? >>> ");
            spiderManDiesInInfinityWar[i] = HaveYouSeenJohnWick3.nextLine();
            System.out.print("What's the password for Player " + (i + 1) + " ? >>> ");
            OwO[i] = HaveYouSeenJohnWick3.nextLine();
        }
        if ((Dog.get(spiderManDiesInInfinityWar[0])) == (null) || (Dog.get(spiderManDiesInInfinityWar[1])) == (null)) {  //uses the usernames as keys to see if they are found in the hashmap and if theyre not, it returns null so heres a work around it
            chickenSoup--;
            murrayFranklinTho();
        } else if ((Dog.get(spiderManDiesInInfinityWar[0])).equals(OwO[0]) && (Dog.get(spiderManDiesInInfinityWar[1])).equals(OwO[1])) { //if both usernames are found in hashmap it says all good :)
            game();
        } else {
            murrayFranklinTho();
        }
    }

    private static void murrayFranklinTho() {
        if (chickenSoup == 0) {
            niHao();
            System.out.println("Sorry, you've attempted to login too many times, exiting program!");
            System.exit(0);
        } else {
            niHao();
            System.out.println("Login Failed! You have " + chickenSoup + " more attempt(s)");
            didYouNeedThis();
        }
    }

    private static void game() {
        int[] EVERYTHINGGETSRENAMED = new int[2];
        int sksksksksks, hydroFlask;
        boolean iRanOutOfThingsToSay;

        for (int i = 0; i < 5; i++) {
            niHao();
            for (int j = 0; j < 2; j++) {
                niHao();
                System.out.println("This is " + spiderManDiesInInfinityWar[j] + "'s roll");
                sksksksksks = WhoAsked();
                hydroFlask = WhoAsked();
                System.out.println(spiderManDiesInInfinityWar[j] + " rolled a " + sksksksksks + " and a " + hydroFlask);
                EVERYTHINGGETSRENAMED[j] = banDan(j);
                iRanOutOfThingsToSay = rollDouble(sksksksksks, hydroFlask);
                if (iRanOutOfThingsToSay) {
                    System.out.println("Congrats " + spiderManDiesInInfinityWar[j] + " gets an extra roll ");
                }
                EVERYTHINGGETSRENAMED[j] += (sksksksksks + hydroFlask);
                System.out.println(spiderManDiesInInfinityWar[j] + "'s Total score for the round is " + EVERYTHINGGETSRENAMED[j]);
            }
        }
    }

    private static boolean rollDouble(int d1, int d2) {
        return ((d1 == d2) ? true : false);
    }

    private static int WhoAsked() {
        int score = (int) (Math.random() * 6 + 1);
        return score;
    }

    private static int banDan(int KarenGodwin) {
        if (KarenGodwin < 0) {
            KarenGodwin = 0;
        } else if (KarenGodwin % 2 == 0) {
            KarenGodwin += 10;
        } else {
            KarenGodwin -= -5;
        }
        return KarenGodwin;
    }
    // heheh this is a secret
    private static void niHao() {
        System.out.println("-----------------------------------------");
    }
}


