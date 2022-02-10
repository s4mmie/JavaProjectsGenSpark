package com.company;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your name.");
        String name = myObj.nextLine();
        System.out.println("Hello "+name+", I am thinking of a number 1-20.");
        System.out.println("You may have 6 attempts. Take a guess");
        game(name);
    }
    public static void game(String name){
        int guess_count = 0;
        Scanner myObj = new Scanner(System.in);
        int min = 1;
        int max = 20;
        int answer = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(answer);
        while(guess_count<6)
        {
            int guess = myObj.nextInt();
            guess_count++;
            if(guess == answer)
            {
                if(guess_count == 1){
                    System.out.println("Goodjob, "+name+"! You guess my number in " +guess_count+ " guess! AMAZING!");
                }else{
                    System.out.println("Goodjob, "+name+"! You guess my number in " +guess_count+ " guesses!");
                }

                System.out.println("Would you like to play again! (y/n)");
                char again_tune = myObj.next().charAt(0);
                String yesstr = "yes";
                String nostr = "no";
                char agree = yesstr.charAt(0);
                char decline = nostr.charAt(0);
                if(again_tune == agree){
                    //answer = (int)Math.floor(Math.random()*(max-min+1)+min);
                    game(name);
                }
                if(again_tune == decline){
                    System.out.println("Thanks for playing! Goodbye. See you next time.");
                    guess_count = 12;
                    return;
                }
            }

            if(guess > answer){
                System.out.println("Im thinking a bit lower.");
            }
            if(guess < answer){
                System.out.println("Im thinking a bit higher.");
            }

            if(guess_count == 6){
                System.out.println("Seems I have won.");
                System.out.println("Would you like to play again! (y/n)");
                String again = myObj.nextLine();
                char again_tune = again.charAt(0);
                if(again == "y"){
                    answer = (int)Math.floor(Math.random()*(max-min+1)+min);
                    guess_count = 0;
                }
                if(again =="n"){
                    System.out.println("Thanks for playing! Goodbye. See you next time.");
                    return;
                }
            }
        }
    }
}
