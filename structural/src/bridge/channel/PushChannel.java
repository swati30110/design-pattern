package bridge.channel;

public class PushChannel implements Channel {
    @Override
    public void send(String to, String message) {
        System.out.println("[PUSH] To: " + to + " | " + message);
    }
}
