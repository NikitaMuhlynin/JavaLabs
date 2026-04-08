abstract class Notification {
    public abstract void send(String message);
}

class EmailNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Отправка Email: " + message);
    }
}

class SmsNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Отправка SMS: " + message);
    }
}

class PushNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Отправка Push: " + message);
    }
}

public class Main {
    public static void notifyUser(Notification notification) {
        notification.send("Ваш заказ оформлен");
    }

    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SmsNotification();
        Notification push = new PushNotification();

        notifyUser(email);
        notifyUser(sms);
        notifyUser(push);
    }
}