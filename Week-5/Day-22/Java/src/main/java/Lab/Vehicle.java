package Lab;

public class Vehicle {
    private int numOfwheel;
    private int numOfDoors;
    private String model;
    private String type;
    private int year;

    public Vehicle(int numOfwheel, int numOfDoors, String model, String type, int year) {
        this.numOfwheel = numOfwheel;
        this.numOfDoors = numOfDoors;
        this.model = model;
        this.type = type;
        this.year = year;
    }

    public int getNumOfwheel() {
        return numOfwheel;
    }

    public void setNumOfwheel(int numOfwheel) {
        this.numOfwheel = numOfwheel;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
