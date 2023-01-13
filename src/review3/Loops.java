package review3;

public class Loops {
    public static void main(String[] args) {
    /*
    Loop - repeat block of code based on the condition
    USE while when you don"t know how many times you will repeat the code
    4 loops in Java:
    while
    do while

    USE for loop when you know how many times you will repeat the code
    for
    for each/ advanced for loop / enhanced for loop
    */
// 1. initialization
        // 2. condition
        // 3. if true -> code goes inside the loop body
        // goes back, increment
        // repeat
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello "+i);
        }
        System.out.println("--------------------------");

        for (int a = 0; a < 8; a+=4) {
            System.out.println("Bye");
        }
        System.out.println("--------------------------------");

        for (int i = 2; i >10 ; i++) {
            System.out.println(i);    // code with errors for example

        }




        System.out.println("End");
    }
}
