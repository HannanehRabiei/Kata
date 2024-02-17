package codewars;

public class TrafficLights {

    public String updateLight(String current) {

        if (current.equals("yellow")){
            return "red";
        }
        if (current.equals("red")){
            return "green";
        }
        if (current.equals("green")) {
            return "yellow";
        } else {
            return "";
        }
    }
}


