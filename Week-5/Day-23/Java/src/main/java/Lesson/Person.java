package Lesson;

public class Person {
    // instance variables are when variables belong to a class and are not in a method
    // instance variables are instantiated when the object of the class type is constructed
    private String name;
    private int id;
    // class variables are variables that are never instantiated and strictly belong the that class
    public static int counter;

    // here are my person constructors
    // note that there are two; this allows for flexibility when constructing
    // when you have variables declared in parantheses, that's called your parameters
    // when you call the method and pass in values to the parameters, those are called arguments
    // think of parameters as your blueprint/contract
    // think of arguments as the actual value that you're passing in
    public Person(String name, int id) {
        // using super will refer to the class above this one in the chain of hierarchy
        super();
        // you can also call sub(), which will refer to child elements
        //note the this keyword
        //"this" will always refer to the instance variable of a class
        //it literally refers to this class
        this.name = name;
        this.id = id;
    }

    // this is an empty constructor
    // you don't need it construct, but I would recommend that you write one anyway
    // remember that constructors have no declared return types; not even void
    public Person() {

    }

    // whenever a function is tied to an object, that function is referred to as a method
    // note that methods need to have their return types explicitly declared
    // having a return type of "void" which will return nothing is legal
    // not having a return type is not the same as void
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String x = "goodbye";

    public String myMethod(){
        // note that this variable is locally scoped to the enclosing method
        String x = "hello";
        return x;

    }
}
