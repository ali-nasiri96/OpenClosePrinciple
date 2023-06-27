package notification.impl;

import notification.Notification;

public class EmailService implements Notification {

    String message;

    public EmailService(String message) {
        this.message = message;
    }

    @Override
    public void sendNotification() {
        //generate email notification,call email connector ...
        System.out.println(message);
    }
}
