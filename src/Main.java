import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double myPi = 4.0;
        double i = 3.0;

        System.out.println("How many loops do you want?: ");
        int j = sc.nextInt();

        while (i<j*4){
            myPi = myPi - (4/i) + (4/(i+2));
            i+=4;
            System.out.println("Round " + ((int)(i/4)) + " result is: " + myPi);
        }

        System.out.println("Actual value of Pi: " + Math.PI);
        System.out.println("You were " + (myPi - Math.PI) + " away from Pi!");


    }
}