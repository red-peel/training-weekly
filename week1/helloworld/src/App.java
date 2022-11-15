import java.util.Scanner;
import java.util.Random;

//Driver class - contains the main method
//Main method is the entry point, where the logic starts

public class App {
    // public - accessed by any other calss not just app class
    // static - you dont need to instantiate an object of the App class
    // void - does not return any output
    // main - name of the method 
    // String[] args - String[] is the datatype (string array) of the argument args 
    public static void main(String[] args) throws Exception {
        //methods in java follow a structure
        //acesss_modifier, modifier, return_type, method_name(method_parameter_datatype, method_parameter_name)

        Random random = new Random();
        String name = "Bella";

        System.out.println(Hello(name));
        System.out.println("Hello, World!");

        
        

        String[] moves = new String[] {"rock", "paper", "scissors"};
        String computerMove = moves[random.nextInt(3)];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose rock [0], paper [1], or scissors[2] ");
        int preUserInput = scanner.nextInt();
        
        String userInput = moves[preUserInput];
        System.out.println("You chose " + userInput + " and computer chose "+ computerMove +"!");


        if (computerMove.equals(userInput)){
            System.out.println("Its a tie!");
        }
        else{
            if((userInput.equals("scissors") && computerMove.equals("paper")) 
            || (userInput.equals("paper") && computerMove.equals("rock"))
            || (userInput.equals("rock") && computerMove.equals("scissors"))            
            ){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose");
            }
        }
        scanner.close();
        // if (userInput.equals("scissors")){
        //     if (computerMove.equals("scissors")){
        //         System.out.println("Tie");
        //     }
        //     else if (computerMove.equals("paper")){
        //         System.out.println("User wins");
        //     }
        //     else{
        //         System.out.println("Computer Wins");;
        //     }
        // }
        // else if (userInput.equals("paper")){
        //     if (computerMove.equals("scissors")){
        //         System.out.println("Computer wins");
        //     }
        //     else if (computerMove.equals("paper")){
        //         System.out.println("Tie");
        //     }
        //     else{
        //         System.out.println("User Wins");;
        //     }
        // }
        // else{
        //     if (computerMove.equals("scissors")){
        //         System.out.println("User Wins");
        //     }
        //     else if (computerMove.equals("paper")){
        //         System.out.println("Computer Wins");
        //     }
        //     else{
        //         System.out.println("Tie");;
        //     }
        // }

    }





    //FUN FACT: method parameters are variables that are scoped to the method
    static String Hello(String name){
        return "Hello " + name;
    }
    
}