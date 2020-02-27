package Lesson;

public class Lesson {

    static void myMethod(int x){
        if (x == 3){
            System.out.println("This is inside a conditional!");
            // you can put return statements anywhere
            // they will typically be at the end of a method body
            // but they can appear within code blocks inside of a method
            // conditionals can resolve to a value that you may want to return
            return;

        }

        System.out.println("This is inside my method");
    }

    // there are three major ways to hanle control flow
    // they are decision statements, looping statements, and branching statements

    public static void main(String[] args) {

        /*
            decision statements
         */

        String x = "foo";
        String y = "foo";
        // if statements will always check for a boolean value
        // in this case, we're comparing two different values and checking if they're the same
        // brace delimiters refers to the curly braces
        // where they are placed does not matter to the compiler

        if(x == y) {
            System.out.println("Reached!");
        } else if (x == "bar") {
            // here we're inside an else block, you can chain else if statements with other conditions
            // or simply write else
            System.out.println("Else statement");
        } else {
            // other code
        }

        // below is a switch statement
        // switch statements evaluate a variable to see if it matches a case
        // if it does it'll execute the associated block of code
        // otherwise it'll fallback to the default block of code
        // chars are declared using single quotes
        char grade = 'A';
        switch('Z'){
            case 'A':
                System.out.println("You did a great job!");
                break;
            case 'B':
                System.out.println("Okay! Good work.");
                break;
            default:
                System.out.println("I didn't understand that grade.");
        }

        // switch statements will throw an error if you try to use a boolean
//        boolean isLightOn = true;
//
//        switch(isLightOn){
//
//        }

        /*
            Looping Statements
        */

        // for loop
        // for loops have three arguments, an iterator, an end check, and the iteration value
        // typically the iterator is declared as i
        // the i variable is locally scoped
        for(int i = 0; i <= 10; i++){
            // nest for loops are a thing but they can sometimes be considered bad practice
            // think about why you'd ever use a nested for loop
            // is there an alternative? can the code be refactored?
            for(int d = 0; d <=10; d++){
                System.out.println(d);
            }
        }

        int[] intArr = {1,2,3,4,5};

        // this is an enhanced for loop
        // you declare a variable that represents an item/element in the array
        // you then pass in the array that you want to iterate through
        for(int item : intArr){
            System.out.println(item);
        }

        // while loops and do while loops

        // this is the simplest while loop
        // note that this while loop does not have a break statement
        // that means it'll run forever until there's a system error
//        while(true){
//            System.out.println("This is in a while loop.");
//        }

        // note the break statement
        // this will take us out of the while loop
        while(true){
            System.out.println("This statement is reached once");
            break;
        }

        do{
            System.out.println("This is inside a do while loop!");
        } while (false);

        /*
             branching statements
         */

        // branching statements control when blocks of code end and when they operate

        for(int i = 0; i <= 100; i++){
            System.out.println("This is for our branching example " + i);
            // below is a break statement, it will allow us to stop the for loop
            if (i == 57){
                break;
            }
        }

        for(int i = 0; i <= 100; i++){
            // below is a continue statement
            // this statement will jump your code to the next iteration
            // continue doesn't refer to "continuing the code"
            // it refers to continuing the iteration of the for loops, thus skipping any code below the continue statement
            if (i == 57){
                continue;
            }
            System.out.println("This is for our branching example " + i);
        }

        // return statement
        // a return statement dictates what a method is giving--or returning--as a value

        myMethod(3);





    }
}
