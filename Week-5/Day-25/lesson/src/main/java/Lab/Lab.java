package Lab;

import java.util.ArrayList;
import java.util.List;

public class Lab {
    public static void main(String[] args) {

        // functional interface that does a thing
        Functionable functionable = () -> "I did a thing";
        // printing to the console the method that we just implemented
        System.out.println(functionable.doThing());

        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(5);
        integerList.add(7);
        integerList.add(32);
        integerList.add(44);
        integerList.add(86);
        integerList.add(2);
        integerList.add(0);
        integerList.add(1);
        integerList.add(54);

        integerList.stream()
                .map(el -> String.format("This is the element %d plus 5: ", el)+(el+5))
               // .forEach(System.out::println);
                .close();

        Integer reduced = integerList.stream()
                .mapToInt(el -> el)
                .sum();

        // the reduced stream that was previously manipulated
        System.out.println(reduced);

    }
}
