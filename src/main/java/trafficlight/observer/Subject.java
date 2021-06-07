package trafficlight.observer;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer newObserver) {
        observerList.add(newObserver);
    }

    public void removeObserver(Observer newObserver) {
        observerList.remove(newObserver);
    }
    public void notifyObserver(){
        for (Observer newObserver : this.observerList){
            newObserver.update();
        }
    }
}
