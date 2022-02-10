package com.company;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int right_choice = 0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("You're in a land full of dragons, in front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight!");
        System.out.println("Which cave will you go into? (1 or 2)");

        double rand = Math.random();
        if (rand >= .5) {
            right_choice = 2;
        } else if (rand <= .499999) {
            right_choice = 1;
        }
        //System.out.println(right_choice); //See the right way
        String choice = myObj.nextLine();
        int res = Integer.valueOf(choice);
        if(res == 1 || res == 2) {
            if (res == right_choice) {
                System.out.println("You approach the cave....");
                System.out.println("It's dark and spooky...");
                System.out.println("A large friendly dragon jumps out and offers you some gold!");
                System.out.println("You won!");
            } else {
                System.out.println("You approach the cave....");
                System.out.println("It's dark and spooky...");
                System.out.println("A large evil dragon jumps out! RUN!!!");
                System.out.println("You lost!");
            }
        }
    }
}
