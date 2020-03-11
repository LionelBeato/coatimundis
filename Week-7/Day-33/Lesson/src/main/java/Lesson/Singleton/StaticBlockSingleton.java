package Lesson.Singleton;

import Lesson.Lesson;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){};

    static{
        try {
            instance = new StaticBlockSingleton();
        } catch(Exception e){
            throw new RuntimeException("Single ton failed");
        }
    }


    public static StaticBlockSingleton getInstance(){
        return instance;
    }


}
