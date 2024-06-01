import java.lang.reflect.Array;

public class Capstone1 {
        public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
                        "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
                        "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
                        "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
                        "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
                        "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
                        "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
                        "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
                        "wombat", "zebra" };

        public static String[] gallows = { "+---+\n" +
                        "|   |\n" +
                        "    |\n" +
                        "    |\n" +
                        "    |\n" +
                        "    |\n" +
                        "=========\n",

                        "+---+\n" +
                                        "|   |\n" +
                                        "O   |\n" +
                                        "    |\n" +
                                        "    |\n" +
                                        "    |\n" +
                                        "=========\n",

                        "+---+\n" +
                                        "|   |\n" +
                                        "O   |\n" +
                                        "|   |\n" +
                                        "    |\n" +
                                        "    |\n" +
                                        "=========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|   |\n" +
                                        "     |\n" +
                                        "     |\n" +
                                        " =========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a
                                                      // trailing escape
                                                      // character, which also happens to be '\'
                                        "     |\n" +
                                        "     |\n" +
                                        " =========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|\\  |\n" +
                                        "/    |\n" +
                                        "     |\n" +
                                        " =========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|\\  |\n" +
                                        "/ \\  |\n" +
                                        "     |\n" +
                                        " =========\n" };

        public static void main(String[] args) {
                System.out.println("Hello world");

                // Hier wordt een random getal gekozen dat nooit hoger is dan de lengte van de
                // array want math.random kiest een getal tussen 0 en <1 en door het typecasten
                // van double naar integer wordt er naar beneden afgerond.
                int randomNumber = (int) (Math.random() * (words.length));
                // Hier wordt de functie voor het kiezen van een woord daadwerkelijk als String
                // gedefinieerd in de Main method.
                String gekozenWoord = woordKiezen(randomNumber, words);
                // print het woord te controle
                System.out.println(gekozenWoord);

                // Hier wordt de functie voor het bereken van het aantal streepjes en ze ook
                // tekenen gedefinieerd als String in de Main method.
                String getekendeStreepjes = streepjePerLetter(gekozenWoord);
                System.out.println("Word: " + getekendeStreepjes);

                int aantalLevens = 6;
                String getekendeGalg = tekenGalg(aantalLevens, gallows);

        }

        // geef een random integer die niet groter is dan de lengte van een array en ook
        // de gebruikte array en dan wordt de waarde in de array die correspondeert met
        // het random getal teruggegeven als String
        public static String woordKiezen(int randomNummer, String[] bibliotheek) {
                String gekozenWoord = bibliotheek[randomNummer];
                return gekozenWoord;
        }

        // geeft een String terug met een aantal streepjes dat overeenkomt met de lengte
        // van het gegeven woord.
        public static String streepjePerLetter(String hetWoord) {
                String streepjes = " ";

                for (int i = 0; i < hetWoord.length(); i++) {

                        streepjes = streepjes + " _ ";

                }

                return streepjes;
        }

        public static String tekenGalg(int aantalLevens, String[] galgCatalogus) {
                String galg = "";

                return galg;
        }

}
