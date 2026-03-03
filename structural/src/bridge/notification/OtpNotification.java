package bridge.notification;

import bridge.channel.Channel;

public class OtpNotification extends Notification{
    public OtpNotification(Channel channel) {
        super(channel);
    }

    @Override
    public void notifyUser(String userId, String message) {
        channel.send(userId, "OTP: " + message);
    }
}
