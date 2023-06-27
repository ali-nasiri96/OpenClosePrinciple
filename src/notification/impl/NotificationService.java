package notification.impl;

import notification.Notification;

public class NotificationService {

    public void sendNotification(Notification notification) {
        //pre processing

        notification.sendNotification();

        //post processing
    }
}
