import notification.impl.EmailService;
import notification.impl.NotificationService;
import notification.impl.TelegramService;

public class Main {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(new EmailService("This message was sent by email..."));
        notificationService.sendNotification(new TelegramService("This message was sent by telegram ..."));
    }
}
