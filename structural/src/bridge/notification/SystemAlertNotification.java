package bridge.notification;

import bridge.channel.Channel;

public class SystemAlertNotification extends Notification{
    public SystemAlertNotification(Channel channel) {
        super(channel);
    }

    @Override
    public void notifyUser(String userId, String message) {
        channel.send(userId, "🚨 ALERT: " + message);
    }
}
