package solid.examples.java.solid.java.badexercises.goodexercises;

/**
 * La clase DependencyInversion demuestra el principio de inversión de dependencias.
 * Está diseñada para enviar notificaciones a los usuarios de una aplicación.
 *
 * Actualmente, el sistema tiene varios tipos de notificaciones:
 * - EmailNotification: Enviar notificaciones por correo electrónico.
 * - SMSNotification: Enviar notificaciones por mensaje de texto.
 * - PushNotification: Enviar notificaciones push a dispositivos móviles.
 * - WhatzapNotification: Enviar notificaciones por Whatzap.
 *
 * @autor santalbu
 */
public class DependencyInversion {

    /**
     * La interfaz Notification define el método para enviar una notificación.
     */
    interface Notification {
        /**
         * Envía una notificación con el mensaje especificado.
         *
         * @param message El mensaje de la notificación.
         */
        void sendNotification(String message);
    }

    /**
     * La clase EmailNotification implementa Notification para enviar notificaciones por correo electrónico.
     */
    class EmailNotification implements Notification {
        String email;

        /**
         * Constructor de la clase EmailNotification.
         *
         * @param email El correo electrónico al que se enviará la notificación.
         */
        public EmailNotification(String email) {
            this.email = email;
        }

        @Override
        public void sendNotification(String message) {
            System.out.println("Sending email to " + email + ": " + message);
        }
    }

    /**
     * La clase SmsNotification implementa Notification para enviar notificaciones por mensaje de texto.
     */
    class SmsNotification implements Notification {
        String phoneNumber;

        /**
         * Constructor de la clase SmsNotification.
         *
         * @param phoneNumber El número de teléfono al que se enviará la notificación.
         */
        public SmsNotification(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public void sendNotification(String message) {
            System.out.println("Sending SMS to " + phoneNumber + ": " + message);
        }
    }

    /**
     * La clase PushNotification implementa Notification para enviar notificaciones push a dispositivos móviles.
     */
    class PushNotification implements Notification {
        String deviceToken;

        /**
         * Constructor de la clase PushNotification.
         *
         * @param deviceToken El token del dispositivo al que se enviará la notificación.
         */
        public PushNotification(String deviceToken) {
            this.deviceToken = deviceToken;
        }

        @Override
        public void sendNotification(String message) {
            System.out.println("Sending push notification to " + deviceToken + ": " + message);
        }
    }

    /**
     * La clase WhatzapNotification implementa Notification para enviar notificaciones por Whatzap.
     */
    class WhatzapNotification implements Notification {
        String phoneNumber;

        /**
         * Constructor de la clase WhatzapNotification.
         *
         * @param phoneNumber El número de teléfono al que se enviará la notificación.
         */
        public WhatzapNotification(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public void sendNotification(String message) {
            System.out.println("Sending Whatzap to " + phoneNumber + ": " + message);
        }
    }

    /**
     * La clase NotificationService utiliza una implementación de Notification para enviar notificaciones.
     */
    class NotificationService {
        private Notification notification;

        /**
         * Constructor de la clase NotificationService.
         *
         * @param notification El tipo de notificación a enviar.
         */
        public NotificationService(Notification notification) {
            this.notification = notification;
        }

        /**
         * Envía una notificación con el mensaje especificado.
         *
         * @param message El mensaje de la notificación.
         */
        public void sendNotification(String message) {
            notification.sendNotification(message);
        }
    }

    /**
     * Método principal para ejecutar el ejemplo de envío de notificaciones.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        DependencyInversion di = new DependencyInversion();

        DependencyInversion.NotificationService notificationService = di.new NotificationService(di.new EmailNotification("prueba@gmail.com"));
        notificationService.sendNotification("¡Hola, mundo desde un correo!");

        notificationService = di.new NotificationService(di.new SmsNotification("1234567890"));
        notificationService.sendNotification("¡Hola, mundo desde SMS!");

        notificationService = di.new NotificationService(di.new PushNotification("ABC123"));
        notificationService.sendNotification("¡Hola, mundo mandando un Push!");

        notificationService = di.new NotificationService(di.new WhatzapNotification("3152221113"));
        notificationService.sendNotification("¡Hola, mundo desde Whatzap!");
    }

}