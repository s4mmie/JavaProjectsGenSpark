package com.company;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("You're in a land full of dragons, in front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight!");
        System.out.println("Which cave will you go into? (1 or 2)");
        int w_or_l = choice();
    }
        //System.out.println(right_choice); //See the right way
        private static int choice()
    {
            Scanner myObj = new Scanner(System.in);
            String str_choice = myObj.nextLine();
            int res=0;
            int right_choice=5;
            try {
                res = Integer.valueOf(str_choice);
            }catch(Exception e) {
                System.out.println("Please only type ('1' or '2')");
                choice();
            }
                double rand = Math.random();
                if (rand >= .5) {
                    right_choice = 2;
                } else if (rand <= .499999) {
                    right_choice = 1;
                }
                if(res == 1 || res == 2) {
                    if (res == right_choice) {
                        System.out.println("You approach the cave....");
                        System.out.println("It's dark and spooky...");
                        System.out.println("A large friendly dragon jumps out and offers you some gold!");
                        System.out.println("You won!");
                        return 1;
                    } else {
                        System.out.println("You approach the cave....");
                        System.out.println("It's dark and spooky...");
                        System.out.println("A large evil dragon jumps out! RUN!!!");
                        System.out.println("You lost!");
                        return 0;
                    }
                }else if(res != 1 || res != 2){
                    System.out.println("Please type ('1' or '2')");
                    choice();
                }
                return 3;
    }


}

