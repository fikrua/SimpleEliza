package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        System.out.print("Good day. What is your problem? ");
        while(!done){
        System.out.print( "Enter your response here or Q to quit:");
        String response = scan.nextLine();
        if(response.equalsIgnoreCase("q")){
            done = true;

            System.out.println(">>> end");
        }
        else{
            done =false;
            System.out.println(response+"?");
        }
        }

    }
}
