package solid.examples.java.solid.java.badexercises.badexercises;

public class DependencyInversion {

    class EmailNotification {
        public void send(String message) {
            System.out.println("Sending email: " + message);
        }
    }

    class SMSNotification {
        public void send(String message) {
            System.out.println("Sending SMS: " + message);
        }
    }

    class NotificationService {
        private EmailNotification emailNotification;
        private SMSNotification smsNotification;

        public NotificationService() {
            emailNotification = new EmailNotification();
            smsNotification = new SMSNotification();
        }

        public void sendNotification(String type, String message) {
            if (type.equals("email")) {
                emailNotification.send(message);
            } else if (type.equals("sms")) {
                smsNotification.send(message);
            }
        }
    }

}
