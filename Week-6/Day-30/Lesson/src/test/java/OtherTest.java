import Lesson.Factorial;
import Lesson.Overload;
import org.junit.Test;

public class OtherTest {

    // this test method is calling our Factorial method that happens to be static
    // its better to test code with the built in testing api
    @Test
    public void testFact(){
        System.out.println(Factorial.fact(15));
    }

    @Test
    public void testingOverload(){

        Overload overload = new Overload();
        System.out.println(overload.testOverload("test"));
        System.out.println(overload.testOverload("test", "test"));
        System.out.println(overload.testOverload(4));
        System.out.println(overload.testOverload('C'));



    }
}
