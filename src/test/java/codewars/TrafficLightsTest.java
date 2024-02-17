package codewars;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrafficLightsTest {

    @Test
    void When_The_Input_Is_Red_Output_Should_Be_Green() {

        TrafficLights trafficLights = new TrafficLights();
        String updateColor = trafficLights.updateLight("red");
        Assertions.assertThat(updateColor).isEqualTo("green");
    }

    @Test
    void When_The_Input_Is_Yellow_Output_Should_Be_Green() {

        TrafficLights trafficLights = new TrafficLights();
        String green = trafficLights.updateLight("green");
        Assertions.assertThat(green).isEqualTo("yellow");
    }

    @Test
    void When_The_Input_Is_Yellow_Output_Should_Be_Red() {

        TrafficLights trafficLights = new TrafficLights();
        String yellow = trafficLights.updateLight("yellow");
        Assertions.assertThat(yellow).isEqualTo("red");
    }
}
