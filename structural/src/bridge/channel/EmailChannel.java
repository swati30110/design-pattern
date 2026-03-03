package bridge.channel;

public class EmailChannel implements Channel {
    @Override
    public void send(String to, String message) {
        System.out.println("[EMAIL] To: " + to + " | " + message);
    }

}
