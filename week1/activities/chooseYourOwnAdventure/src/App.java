import java.util.HashMap;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //TODO Add variables that can change the ending. (ex choosing bakery gives you scone ending.)

        System.out.println("Welcome to choose your own adventure! You are in the middle of a clearing in the forest. \n\n"
        +"In front of you you see a narrow path leading to darkness. \n"
        +"To your left you see a tall cliff wall with a small opening to a cave. Seems scary. \n"
        +"To your right you see a lake. Looks like theres a small canoe in the middle of it. No people. \n"
        +"Behind you is the cottage you just came out of. Small, just has your basic necessities. \n \n"
        +"Please select an option [path] [lake] [cave] [cottage]"
        );
        HashMap<String, Integer> options = new HashMap<String, Integer>();
        options.put("path", 1);
        options.put("lake", 2);
        options.put("cave",3);
        options.put("cottage",4);
        String choice = sc.nextLine();
        int next = options.get(choice);
        
        switch (next) {
            case 1:
                System.out.println("\nThe path leads to a small town, brimming with life. Theres a little bakery that holds lots of confectionary, \n"+
                "a grand church taller than any other church youve seen,\n"+
                "and a market with lots of vendors, fresh produce and meats.\n\n"+
                "Please select an option [bakery] [church] [market]"
                );
                HashMap<String, String> options2 = new HashMap<String, String>();
                options2.put("bakery", "You get a scone from the baker. It is airy, buttery, and delicious. The baker warmly tells you about the lake nearby you decide to head that way. ");
                options2.put("church", "You go to the church and go to pray. In your prayer you start visualizing a lake, like the one you saw earlier. \n"
                +"You decide to go back to the lake.");
                options2.put("market","You purchase a durian. It is yummy, but you wanna relax and eat away from the noise of the market. \n"
                + "You decide to go back to the lake.");
                choice = sc.nextLine();
                System.out.println(options2.get(choice)); 
            
            case 2:
                System.out.println("You walk down to the lake and you see a canoe, theres no one nearby, but there is a fishing rod."+
                "To your right you see a campfire near the shore"+
                "To your left, a box, unmarked and suspicious"
                );
                HashMap<String, String> options3 = new HashMap<String, String>();
                options3.put("fishing rod", "You start fishing. You feel something watching you. You turn around and see the cliff wall. \n"
                +"You get bored of fishing and head to the cave.");
                options3.put("campfire", "You go to the campfire. Its warm and welcoming. But after a while, you feel, bored. \n"
                +"You look longingly at the cliff wall in search of adventure. You decide to go for the cave.");
                options3.put("box","In the box, theres a turtle! The turtle, scuttles towards the cliff wall, towards the cave.\n"
                +"You decide to go for the cave");
                choice = sc.nextLine();
                System.out.println(options3.get(choice));
                System.out.println();

            case 3:
                System.out.println("Cave is dark and smelly. You can hear a growl. You run home."
                );

            case 4:
                System.out.println("You went in the cottage. And fell asleep.");
                System.exit(0);
                break;
                
            default:
                System.out.println("You broke the game. And fell asleep.");
                break;
        }

    }
}
