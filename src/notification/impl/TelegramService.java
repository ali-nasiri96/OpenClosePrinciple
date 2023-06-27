package notification.impl;

import notification.Notification;

public class TelegramService implements Notification {

    String message;

    public TelegramService(String message) {
        this.message = message;
    }

    @Override
    public void sendNotification() {
        //generate telegram notification,call telegram connector ...
        System.out.println(message);
    }
}
