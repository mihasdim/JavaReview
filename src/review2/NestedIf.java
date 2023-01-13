package review2;

import java.util.SortedMap;

public class NestedIf {
    public static void main(String[] args) {

        /* nested if is a statement inside another if statement

        when we have one condition depend on another
         */

        boolean vaccine =true;
        int dose=2;

        if(vaccine){
            System.out.println("How many doses do you have");
            // inner if always depends on outer if

            if (dose==1) {
                System.out.println("You need a second shot");
            } else{
                System.out.println("You are fully vaccinated");
            }
        }else {
            System.out.println("I don't have a vaccine");
        }

    }

}
