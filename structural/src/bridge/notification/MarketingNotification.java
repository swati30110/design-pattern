package bridge.notification;

import bridge.channel.Channel;

public class MarketingNotification extends Notification{
    protected MarketingNotification(Channel channel) {
        super(channel);
    }

    @Override
    public void notifyUser(String userId, String message) {
        channel.send(userId, "🔥 Offer: " + message);
    }
}
