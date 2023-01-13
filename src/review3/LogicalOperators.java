package review3;

public class LogicalOperators {
    public static void main(String[] args) {

        /*when we need to compare two or more conditions - we use logical operators*/

        boolean loginButtonDisplayed=true;

        boolean loginButtonClickable=false;

        if(loginButtonDisplayed && loginButtonClickable) {
            System.out.println("Test case is passed");

        }else{
            System.out.println("Test case is failed");
        }

        System.out.println("-----------LOGICAL OR------------------");


        boolean dashBoard= true;

        String message="Welcome admin";

        if(dashBoard || message.equals("Welcome admin")){
            System.out.println("User is successfully logged in");
        }else {
            System.out.println("User is not logged in");
        }

        System.out.println("-----------LOGICAL NOT------------------");

        boolean b=true;
        System.out.println(!true); // false

        boolean agreeCheckBoxSelected=true; // default checkbox not selected

        if(!agreeCheckBoxSelected) {
            System.out.println("I'm clicking on checkbox");
        }
        System.out.println("I'm clicking on submit button");

    }
}
