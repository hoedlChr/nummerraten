package nummerraten;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NummerRaten {
    public static void main(String[] args) throws NotANumberException {
        //create Random int
        int myRandomInt = new Random().nextInt(10);
//        System.out.println("myRandomInt = " + myRandomInt);

        Scanner myScanner = new Scanner(System.in);
        int myGuess = 0;
        while(myGuess != myRandomInt){
            if(myGuess != 0){
                System.out.println("Please try again");
            }
            System.out.print("What do you think is my number?: ");
            try{
                myGuess = myScanner.nextInt();
            } catch (InputMismatchException e){
                throw new NotANumberException("Des is ka zohl",e);
            }
        }
        System.out.println("You have won");
    }
}
