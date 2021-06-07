package trafficlight.gui;


import trafficlight.observer.Observer;

import java.awt.*;

public class TrafficLight extends Light implements Observer {

    public TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void update() {

        turnOn(isOn==false);

        /*turnOn(false);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        turnOn(true);*/
    }
}
//TODO implement a part of the pattern here
