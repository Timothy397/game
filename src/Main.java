import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> player_1 = new ArrayList<>();
        ArrayList<Integer> player_2 = new ArrayList<>();
        ArrayList<Integer> player_3 = new ArrayList<>();
        System.out.println("This is a racing game, first to reach 100 wins");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Player 1: ");
        String player_one = scanner.nextLine();

        System.out.print("Player 2: ");
        String player_two = scanner.nextLine();

        System.out.print("Player 3: ");
        String player_three = scanner.nextLine();

        boolean run_again = true;
        int player_1_no_of_tries = 0;
        int player_2_no_of_tries = 0;
        int player_3_no_of_tries = 0;

        int player_1_result = 0;
        int player_2_result = 0;
        int player_3_result = 0;


        while (run_again){

            player_1_no_of_tries += 1;
            player_2_no_of_tries += 1;
            player_3_no_of_tries += 1;


            int player_1_dice = random.nextInt(6)+1;
            int player_2_dice = random.nextInt(6)+1;
            int player_3_dice = random.nextInt(6)+1;

            player_1.add(player_1_dice);
            player_2.add(player_2_dice);
            player_3.add(player_3_dice);

            player_1_result += player_1_dice;
            player_2_result += player_2_dice;
            player_3_result += player_3_dice;

            System.out.println(player_one+" rolled "+ player_1_dice);
            System.out.println(player_one +"'s current score is "+ player_1_result);
            sleeper(500);
            System.out.println(player_two+" rolled "+ player_2_dice);
            System.out.println(player_two +"'s current score is "+ player_2_result);
            sleeper(500);
            System.out.println(player_three+" rolled "+ player_3_dice);
            System.out.println(player_three+ "'s current score is "+ player_3_result);

            System.out.println("\n");

            sleeper(1500);


            if (player_1_result >= 100 || player_2_result >= 100 || player_3_result >= 100) {
                run_again = false;
                break;
            }
        }
        int min_tries = Math.min(player_1_no_of_tries, Math.min(player_2_no_of_tries, player_3_no_of_tries));
        String winner = "";

        if (player_1_result >= 100 && player_1_no_of_tries == min_tries) {
            winner = player_one;
        }
        else if (player_2_result >= 100 && player_2_no_of_tries == min_tries) {
            winner = player_two;
        }
        else if (player_3_result >= 100 && player_3_no_of_tries == min_tries) {
            winner = player_three;
        }

        System.out.println("The winner is " + winner + " with the smallest number of throws of " + min_tries);
    }

    static void sleeper(int x){
        try {
            Thread.sleep(x); // Sleep for 1000 milliseconds (1 second)
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
