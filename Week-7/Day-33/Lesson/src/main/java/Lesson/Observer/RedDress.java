package Lesson.Observer;

import java.util.ArrayList;

public class RedDress implements Observable {

    private ArrayList<Observer> users = new ArrayList<Observer>();


    private boolean inStock = true;

    public boolean isInStock(){
        return inStock;
    }

    public void setInStock(boolean inStock){
        this.inStock = inStock;
        notifyObserver();
    }


    @Override
    public void addObserver(Observer o) {
        users.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        users.remove(o);

    }

    @Override
    public void notifyObserver() {

        for(Observer user:users){
            user.update();
        }

    }
}
