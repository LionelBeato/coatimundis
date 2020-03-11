package Lesson.Observer;

public class User implements Observer {

    private Observable observable = null;

    public User(Observable observable){
        this.observable = observable;
    }
    @Override
    public void update() {
        buyDress();
        unsubscribe();
    }

    public void buyDress() {
        System.out.println("Got my new dress!");
    }

    public void unsubscribe(){
        observable.removeObserver(this);
    }

}

