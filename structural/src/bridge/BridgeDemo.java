package bridge;

import bridge.channel.EmailChannel;
import bridge.channel.PushChannel;
import bridge.channel.SmsChannel;
import bridge.notification.Notification;
import bridge.notification.OtpNotification;
import bridge.notification.SystemAlertNotification;

public class BridgeDemo {
    public static void main(String[] args) {
        Notification otpViaSms = new OtpNotification(new SmsChannel());
        otpViaSms.notifyUser("swati-phone", "8938572385");
        Notification offerViaEmail = new OtpNotification(new EmailChannel());
        offerViaEmail.notifyUser("swati@test.com", "50 % off on annual plan!");

        Notification alertViaPush = new SystemAlertNotification(new PushChannel());
        alertViaPush.notifyUser("swati-device", "High CPU detected on node-7");
    }
}
