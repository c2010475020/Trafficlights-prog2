package at.ac.fhcampuswien;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.gui.TrafficLight;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;


public class TrafficLightTests {

    @Test
    @DisplayName("check if the singleton instance equals the object")
    public void checkSingleton() {
        TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
        assertEquals(trafficLight,TrafficLightCtrl.getController());
    }


    @Test
    @DisplayName("check if the light changes to green")
    public void checkGreen() {
        TrafficLight green = new TrafficLight(Color.green);
        assertFalse(green.isOn());
    }


    @Test
    @DisplayName("check if light changes to yellow")
    public void checkYellow() {
        TrafficLight yellow = new TrafficLight(Color.yellow);
        assertFalse(yellow.isOn());
    }

    @Test
    @DisplayName("check if light changes to red")
    public void checkRed() {
        TrafficLight red = new TrafficLight(Color.red);
        assertFalse(red.isOn());
    }


}
