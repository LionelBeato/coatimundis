package Lesson;

public class ExceptionTutorial {

    public static void main(String[] args) {
        try{
            throw new TestException();
        } catch(TestException test){
            System.out.println("Got my test exception");
        }finally {
            System.out.println("Inside my finally block!");
        }
    }
}
