import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        double myPi = 4.0;
        double i = 3.0;


        System.out.println("How many loops do you want?: ");

        Scanner sc = new Scanner(System.in);

        while(!(sc.hasNextInt())){
            System.out.println("Please give an integer.");
            sc.next();
        }

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