package Lesson.Factory;

public class Server extends Computer {


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

    public Server(String r, String s, String c) {
        this.ram = r;
        this.sdd = s;
        this.cpu = c;
    }
}
