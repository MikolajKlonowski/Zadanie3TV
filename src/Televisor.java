public class Televisor {
    String status;

    Televisor(String st) {
        status = st;
        st = "OFF";
    }

    Televisor() {
status = "off";

    }

    void turnOn() {
        status = "On";
        System.out.println("Włączona funkcja ON");
    }

    void turnOff() {
        status = "OFF";
        System.out.println("Włączona funkcja OFF");
    }

    void showStatus() {
        System.out.println(status);
    }

}
