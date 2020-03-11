package Lesson.Singleton;


// eager means that this singleton will immediately be instatiated at runtime
public class EagerInitSingleton {

    // this is the initialization of the singleton
    // note how its private static final
    // it is the only instance of the class
    private static final EagerInitSingleton instance = new EagerInitSingleton();

    // private constructor
    // private constructors will restrict intialization of the class
    private EagerInitSingleton(){};

    public static EagerInitSingleton getInstance(){
        return instance;
    }

}
