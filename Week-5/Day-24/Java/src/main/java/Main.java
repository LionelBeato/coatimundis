import Lesson.Animal;
import Lesson.Bird;
import Lesson.Dog;

public class Main {

    // This method represents a more imperative, traditional way of coding that handles states and conditionals
    // doing things this way is strongly discouraged
    // this code still works but it should utilized sparingly
    public static String animalSoundGenerator(Animal a){
        if(a instanceof Dog){
            return "This dog barked";
        } else if (a instanceof Bird){
            return "this bird tweeted";
        } else {
            return "I did not understand that animal";
        }
    }

    public static void main(String[] args) {

        Dog myDog = new Dog("Rover");
        Bird myBird = new Bird("Tweety");

//        System.out.println(animalSoundGenerator(myDog));

        System.out.println(myDog.doCry());


    }

}
