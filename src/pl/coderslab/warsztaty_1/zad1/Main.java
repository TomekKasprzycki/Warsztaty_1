package pl.coderslab.warsztaty_1.zad1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        zgadnij();

    }

    public static void zgadnij(){

        int quest = 0;

        Random x = new Random();
        quest = x.nextInt(1000);

        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Zgadnij liczbę! ");

            try {
                int guess = scan.nextInt();

            if (quest == guess) {
                System.out.print("Zgadleś!");
                break;
            }

            if(guess<quest){
                System.out.println("Za mało!");
            } else {
                System.out.println("Za dużo!");
            }
            } catch (InputMismatchException e){
                System.out.println("To nie jest liczba! Spróbuj jeszcze raz.");
            }
        }
    }
}
