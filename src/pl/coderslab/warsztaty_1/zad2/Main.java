package pl.coderslab.warsztaty_1.zad2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        lotto();
    }

    public static void lotto(){

        int[] myNumbers = myNumb();
        int[] rng = rng();
        int hit = 0;

        for (int i=0;i<myNumbers.length;i++){
            for(int j=0;j<rng.length;j++){
                if (myNumbers[i]==rng[j]){
                    hit++;
                }
            }

        }

        if (hit>=3){
            System.out.print("Brawo, trfiłeś conajmniej 3!");
        } else {
            System.out.print("Spóbuj jeszcze raz ;)");
        }

    }

    public static int[] myNumb(){
        int[] myNumbers = new int[6];

        Scanner scan = new Scanner(System.in);
        int counter=0;

        while (true) {
            if (counter == 6) break;
            try {
                System.out.print("Podaj liczbę z zakresu 1-49: ");
                int tempNumber = scan.nextInt();
                if (tempNumber<50)if(tempNumber>0){
                    boolean test = false;
                    for (int i=0;i<myNumbers.length;i++){
                        if (tempNumber==myNumbers[i]){
                            test = true;
                        }
                    }
                    if (test){
                        System.out.println("Taką liczbę już podałeś! Podaj jeszcze raz.");
                    } else {
                        myNumbers[counter]=tempNumber;
                        counter++;
                    }
                }
            }catch (InputMismatchException e) {
                System.out.println("Nieporawne dane!");
            }
        }

        Arrays.sort(myNumbers);
        String result = Arrays.toString(myNumbers);
        System.out.println("Twoje typy: " + result);
        return myNumbers;
    }

    public static int[] rng() {
        Random x = new Random();

        int[] randomNumbers = new int[6];


        int counter=0;

        while (true) {
            if (counter == 6) break;
                int tempNumber = x.nextInt(49);
                    boolean test = false;
                    for (int i=0;i<randomNumbers.length;i++){
                        if (tempNumber==randomNumbers[i]){
                            test = true;
                        }
                    }
                    if (!test){
                        randomNumbers[counter]=tempNumber;
                        counter++;
                    }
                }

        Arrays.sort(randomNumbers);
        String result = Arrays.toString(randomNumbers);
        System.out.println("Wylosowane liczby: " + result);

        return randomNumbers;
    }

}
