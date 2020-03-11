package Lesson.Factory;

public abstract class Computer {

    public abstract String getRAM();
    public abstract String getSDD();
    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM= "+this.getRAM()+", SDD="+this.getSDD()+", CPU="+this.getCPU();
    }

}
