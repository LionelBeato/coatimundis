package Lab;

public class Practice {

    // this method will return a specific value that we can test for using assertEquals
    public int doesStuff(int x, int y){
        return (x+y) * x;
    }

    // this method will throw an Exception and we can test for this using assertThrows
    // our test will always pass because we throw an exception explicitly
    public void throwsStuff() throws Exception {
            int x = 3;
            throw new Exception();
    }


    // in order for your test to not pass you would need to handle the exception in some fashion
    // ideally you would refactor your code
    // but you can also catch the exception using the try-catch block
//    public void throwsStuff() throws Exception {
//        try {
//            int x = 3;
//            throw new Exception();
//        } catch (Exception e){
//            System.out.println(e);
//        }
//    }

}
