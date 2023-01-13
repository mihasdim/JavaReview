package com.syntax.review1;

public class WorkingWithVariables {
    public static void main(String[] args) {
        // create a variable and store value into it
        // declared a variable and initialized it
        int number=10;
        // declared a variable
        int num; // declaration of the variable happens only once
        num=100; // initialize the variable
        num=200;// reassign the value

        System.out.println(num); //200 because reassigned box num

        boolean hungry=false;
        hungry=true; // reassign boolean
        // hungry="yes"; error
        String myString="Hello";
        String name="Dmitry"; // store any type of data
        //Hello Dmitry
        System.out.println(myString+" "+name);
        int age=42;
        // Dmitry is 42 years old
        System.out.println(name+ " is " +age+ " years old");
        /* if we want to attach String to anything we use "+" sign */
        //when we have two numeric values "+" acts as addition

        String month="December";
        int day=14;
        System.out.println(day+" "+month);
        char date='1';
        System.out.println(date+day); //63 - look at ASCII table google


    }

}
