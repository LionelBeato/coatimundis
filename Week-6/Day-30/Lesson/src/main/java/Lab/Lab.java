package Lab;

public class Lab {

    // Write a method for our Fib sequence

    public static int iterator = 0;

    public static int fibGenerator(int x, int y){
        // TODO: Write the implementation of that method

        if (iterator == 10){
            System.out.println("The sequence has ended!");
            return 0;
        }

        if (iterator == 0) {
            x = 0;
            y = 1;
            int z = x + y;
            iterator++;
            System.out.println(x+" "+y+" ");
            return fibGenerator(y,z);
        }

        int z = x + y;
        iterator++;
        System.out.println(y+" ");
        return fibGenerator(y,z);
    };



}
