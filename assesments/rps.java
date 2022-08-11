package assesments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class rps {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rng = new Random();

        int Rock = 1;
        int Paper = 2;
        int Scissors = 3;

        // declare String variables to hold the user's input
        String stringMove;
        String stringRound;
        int Round;
        //int Move;
        int noRounds = 0;

        String ans = "";




        //get input from the user

        System.out.println("Please enter the number of rounds (b/w 1 to 10):");
        stringRound = scan.nextLine();
        Round = Integer.parseInt(stringRound);


        if ((Round < 1) || (Round > 10)) {
            System.out.println("You have entered too few or too many rounds!");
            System.out.println("You have exited the program");
            //break;
        } else {
            do {
                int Move = 0;
                do {
                    System.out.println("Please choose a number: 1 = rock, 2 = paper or 3 = scissors");
                    stringMove = scan.nextLine();
                    try {
                        Move = Integer.parseInt(stringMove);
                    }catch (NumberFormatException e) {
                        System.out.println("You have not entered a number!");
                    }

                }while (!isValidUserMove(Move));
                int computChoice = rng.nextInt(3) + 1;

                result(Move, computChoice);
                noRounds = noRounds + 1;
            }while (noRounds < Round);
            do {
                System.out.println("would you like to play it again?");
                ans = scan.nextLine();
            } while(!isValidans(ans));
            if (ans.equalsIgnoreCase("N")){
                System.out.println("Thank you for playing");

            }
        }





    }

    public static void result (int Move, int computChoice){
       switch (Move){
           case 1:

               System.out.println("User choice is Rock");
               if (computChoice == 1){
                   System.out.println("Computer choice is Rock");
                   System.out.println("Result: This is a Tie");
               } else if(computChoice==2){
               System.out.println("Computer choice is Paper");
               System.out.println("Result: Computer Won");
               } else {
               System.out.println("Computer choice is Scisssors");
               System.out.println("Result: You Won");
               }
               break;

           case 2:
               System.out.println("User choice is Paper");
               if (computChoice == 1){
                   System.out.println("Computer choice is Rock");
                   System.out.println("Result: You Won");
               } else if(computChoice==2){
                   System.out.println("Computer choice is Paper");
                   System.out.println("Result: Its A Tie");
               } else {
                   System.out.println("Computer choice is Scisssors");
                   System.out.println("Result: Computer Won");
               }
               break;
           case 3:
               System.out.println("User choice is Scissors");
               if (computChoice == 1){
                   System.out.println("Computer choice is Rock");
                   System.out.println("Result: Computer won");
               } else if(computChoice==2){
                   System.out.println("Computer choice is Paper");
                   System.out.println("Result: You won");
               } else {
                   System.out.println("Computer choice is Scisssors");
                   System.out.println("Result: Its a Tie");
               }





       }

    }
    public static boolean isValidUserMove (int move) {
        ArrayList<Integer> validMove = new ArrayList<>(Arrays.asList(1,2,3));
        return  validMove.contains(move);
    }
    public static boolean isValidans (String answer){
        return answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("Y");
    }
}
