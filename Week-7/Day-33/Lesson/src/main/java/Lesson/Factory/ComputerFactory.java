package Lesson.Factory;


// this is our factory proper!
// it will generate a computer depending on the type
// it basically creates instances for us
public class ComputerFactory {



    public static Computer getComputer(String type, String ram, String sdd, String cpu){
        if ("PC".equalsIgnoreCase(type)){
            return new PC(ram, sdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, sdd, cpu);
        }
        return null;
        }
    }


