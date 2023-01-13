package review3;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int i=1;
        while (i<4){
            System.out.println("Hello");
            i++;
        }
/* Ask a user if he is tired*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you tired?");

        boolean tired= scan.hasNextBoolean();
        while (!tired) {
            System.out.println("This is great");
            tired=scan.nextBoolean();
        }


    }
}
