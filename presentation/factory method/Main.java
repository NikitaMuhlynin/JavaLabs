public class Main {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailFactory();
        Notification email = emailFactory.createNotification();
        email.send("Привет по Email!");

        NotificationFactory smsFactory = new SMSFactory();
        Notification sms = smsFactory.createNotification();
        sms.send("Привет по SMS!");
    }
}