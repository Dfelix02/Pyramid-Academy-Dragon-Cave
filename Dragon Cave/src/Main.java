import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nYou are in a land full of dragons. In front of you, you see two caves. \nIn one cave, the dragon is friendly and will share his treasure with you. \nThe other dragon is greedy and hungry and will eat you on sight. \nWhich cave will you go into? (1 or 2)\n" +
                "\n");
        Random rand = new Random();

        int caveNumber = userInput.nextInt();
        int randomNumber = rand.nextInt(2)+1;
        while((caveNumber != 1) && (caveNumber!= 2)){
            System.out.println("\nIncorrect input, choose your path!");
            caveNumber = userInput.nextInt();
        }
        if (caveNumber==randomNumber){
            System.out.println("\nYou approach the cave... \nIt is dark and spooky... \nA large dragon jumps out in front of you! He opens his jaws and... \nGobbles you down in one bite!");
        }else {
            System.out.println("\nYou approach the cave... \nIt is dark and spooky... \nA large dragon jumps out in front of you! He opens his jaws and... \nas he yawns... \nHe welcomes you and give you some of his treasure!");
        }
    }
}
