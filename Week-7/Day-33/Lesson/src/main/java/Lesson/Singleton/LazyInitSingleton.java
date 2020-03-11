package Lesson.Singleton;


// lazy init works fine in case of a single-threaded environment
// but multithreaded system might have problems with the conditional
// two threads can have two different instances of this class
public class LazyInitSingleton {

    private static LazyInitSingleton instance;

    private  LazyInitSingleton(){};

    public static LazyInitSingleton getInstance(){
        if (instance == null){
            System.out.println("Lazily creating instance");
            instance = new LazyInitSingleton();
        }
        return instance;
    }
}
