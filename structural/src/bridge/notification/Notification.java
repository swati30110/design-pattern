package bridge.notification;

import bridge.channel.Channel;

// Abstraction
public abstract class Notification {
    protected final Channel channel;

    protected Notification(Channel channel) {
        this.channel = channel;
    }
    public abstract void notifyUser(String userId, String message);
}
