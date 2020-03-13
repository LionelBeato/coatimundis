package OtherPackage;


// classes cannot be static because they generally cant be defined as belonging to another class
public class CodeThatINeed {

    public static int valueThatINeed = 3;

    // technically, classes CAN be static
    // but they would have to be inside of another class
    public static class nestedClass {

    }

}
