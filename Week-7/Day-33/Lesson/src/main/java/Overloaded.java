public class Overloaded {

    public int doStuff(int a, int b){
        return a + b;
    }


    // in the case of overloading, you do have to change the parameters

    public String doStuff(String a){
        return a;
    }

    // however, if its a different type, the parameters can "be the same"
    public String doStuff(String a, String b){
        return a +" "+ b;
    }


}
