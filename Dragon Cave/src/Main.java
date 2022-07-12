import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static String userChoosingPath(){
        Scanner userInput = new Scanner(System.in);
        String caveNumber = userInput.nextLine();
        while((!Objects.equals(caveNumber, "1")) && (!Objects.equals(caveNumber, "2"))){
            System.out.println("\nIncorrect input, choose your path!");
            caveNumber = userInput.next();
        }
        return caveNumber;
    }
    public static void dialog(){
        System.out.println("\nYou are in a land full of dragons.");
        System.out.println("In front of you, you see two caves.");
        System.out.println("In one cave, the dragon is friendly and will share his treasure with you.");
        System.out.println("The other dragon is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");
    }
    public static String askUserToPlayAgain(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like to play again? (y/n)");
        String playAgain = userInput.nextLine();
        while((!playAgain.equalsIgnoreCase("y"))&&!playAgain.equalsIgnoreCase("n")){
            System.out.println("\nIncorrect input, (y/n)");
            playAgain = userInput.next();
        }
        return playAgain;
    }
    public static void pathChosenDialog(int caveNumber){
        Random rand = new Random();
        int randomNumber = rand.nextInt(2)+1;
        if (caveNumber==randomNumber){
            System.out.println("\nYou approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you!");
            System.out.println("He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");
        }else {
            System.out.println("\nYou approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you!");
            System.out.println("He opens his jaws and...");
            System.out.println("Welcomes you and give you some of his treasure!");
        }
    }
    public static void main(String[] args){

        dialog();
        pathChosenDialog(Integer.parseInt(userChoosingPath()));

        String playAgain = askUserToPlayAgain();
        while(playAgain.equalsIgnoreCase("y")){
            dialog();
            pathChosenDialog(Integer.parseInt(userChoosingPath()));
            playAgain = askUserToPlayAgain();
        }
        System.out.println("\nThanks for playing!");

    }
}
