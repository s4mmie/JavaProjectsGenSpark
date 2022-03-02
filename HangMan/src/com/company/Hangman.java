package com.company;

import java.util.Scanner;

public class Hangman {

    private static String[] words = {"cat","dog","rat","baby" };
    private static String word = words[(int) (Math.random() * words.length)];
    private static String realword = new String(new char[word.length()]).replace("\0", "_");
    private static int count = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (count < 7 && realword.contains("_")) {
            System.out.println("Guess any letter in the word");
            System.out.println(realword);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    public static void hang(String guess) {
        String newguess = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newguess += guess.charAt(0);
            } else if (realword.charAt(i) != '_') {
                newguess += word.charAt(i);
            } else {
                newguess += "_";
            }
        }

        if (realword.equals(newguess)) {
            count++;
            hangmanImage();
        } else {
            realword = newguess;
        }
        if (realword.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }
    }

    public static void hangmanImage() {

        if (count == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("HANGMAN");
            System.out.println("+--+");
            System.out.println("O | ");
            System.out.println("  | ");
            System.out.println("  | ");
            System.out.println(" === ");
        }
        if (count == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("HANGMAN");
            System.out.println("+--+");
            System.out.println("O | ");
            System.out.println("| | ");
            System.out.println("  | ");
            System.out.println(" === ");
        }
        if (count == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("HANGMAN");
            System.out.println("+--+");
            System.out.println("O | ");
            System.out.println("| | ");
            System.out.println("1 | ");
            System.out.println(" === ");
        }
        if (count == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("HANGMAN");
            System.out.println(" +--+");
            System.out.println(" O | ");
            System.out.println(" | | ");
            System.out.println("1 1 | ");
            System.out.println("  === ");
        }
        if (count == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("HANGMAN");
            System.out.println("  +--+");
            System.out.println(" O  | ");
            System.out.println(" |1  | ");
            System.out.println("1 1 | ");
            System.out.println("   === ");
        }
        if (count == 7) {
            System.out.println("GAME OVER!");
            System.out.println("HANGMAN");
            System.out.println("  +--+");
            System.out.println(" O  | ");
            System.out.println("1|1 | ");
            System.out.println("1 1 | ");
            System.out.println("   === ");
            System.out.println("GAME OVER! The word was " + word);
        }
    }
}
