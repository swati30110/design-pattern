package bridge.channel;

public class SmsChannel implements Channel {
    @Override
    public void send(String to, String message) {
        System.out.println("[SMS] To: " + to + " | " + message);
    }
}
