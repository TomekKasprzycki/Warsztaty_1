package pl.coderslab.warsztaty_1.zad3;

import javax.security.sasl.SaslClient;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Wynik rzutu to: " + rollDice());
    }

    public static int rollDice(){
        Scanner scan = new Scanner(System.in);
        String throwSymbol = scan.nextLine();

        String[] firstElement = throwSymbol.split("D");
        String[] secondElement = firstElement[1].split("\\+");

        if (secondElement.length==1){
            secondElement=firstElement[1].split("-");

        }
        Random x = new Random();

        int result = Integer.parseInt( firstElement[0])*x.nextInt(Integer.parseInt( secondElement[0]))+Integer.parseInt( secondElement[1]);

return result;
    }
}
