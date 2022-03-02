package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner myScan = new Scanner(System.in); //Scanner Input
        String reverse = myScan.nextLine(); //String to reverse
        String result = reverseString(reverse);
        System.out.println(result);
    }

    private static String reverseString(String input){
        String result = ""; //initilize var
        int Length = input.length();//get string length
        for(int i = 0; i<Length;i++){
            char a = input.charAt(Length-(i+1));
            result += a;
        }
        return result;

    }
}
