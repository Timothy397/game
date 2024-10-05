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

        System.out.println("Player 1: ");
        String player_one = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Player 2: ");
        String player_two = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Player 1: ");
        String player_three = scanner.nextLine();
        scanner.nextLine();

        boolean run_again = true;
        int player_1_no_of_tries = 0;
        int player_2_no_of_tries = 0;
        int player_3_no_of_tries = 0;
        while (run_again){

            player_1_no_of_tries += 1;
            player_2_no_of_tries += 1;
            player_3_no_of_tries += 1;

            int player_1_result = 0;
            int player_2_result = 0;
            int player_3_result = 0;

            int player_1_dice = random.nextInt(6)+1;
            int player_2_dice = random.nextInt(6)+1;
            int player_3_dice = random.nextInt(6)+1;

            player_1.add(player_1_dice);
            player_2.add(player_2_dice);
            player_3.add(player_3_dice);

            for (int figure_1 : player_1){
                player_1_result += figure_1;
                }
            for (int figure_2 : player_2){
                player_2_result += figure_2;
            }
            for (int figure_3 : player_3){
                player_3_result += figure_3;
            }
            if (player_1_result <= 100 || player_2_result <= 100 || player_3_result <= 100){
                System.out.println(player_one +" current score is "+ player_1_result);
                System.out.println(player_two +" current score is "+ player_2_result);
                System.out.println(player_three+ " current score is "+ player_2_result);
                System.out.println("\n");
                run_again = true;
            }
            else if (player_1_result >= 100 || player_2_result >= 100 || player_3_result >= 100){;
                run_again = false;
            }
        }
        String winner = min(player_1_no_of_tries, player_2_no_of_tries, player_3_no_of_tries);
    }
}
