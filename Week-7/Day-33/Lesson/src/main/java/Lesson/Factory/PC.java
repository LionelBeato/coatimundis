package Lesson.Factory;


// utilizing the factory design pattern, we can create our PC
// but we can alo create other computers as well
public class PC extends Computer {

    private String ram;
    private String sdd;
    private String cpu;


    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getSDD() {
        return this.sdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    public PC(String r, String s, String c) {
        this.ram = r;
        this.sdd = s;
        this.cpu = c;
    }

}
