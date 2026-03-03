package bridge.channel;

public interface Channel {
    void send(String to, String message);
}
