package solid.examples.java.solid.java.badexercises.goodexercises;

/**
 * La clase SingleResponsability demuestra el principio de responsabilidad única.
 * Contiene clases internas para manejar notificaciones por correo electrónico y SMS.
 *
 * @autor santalbu
 */
public class SingleResponsability {

    class User{
        String email;
        String phoneNumber;

        /**
         * Constructor de la clase User.
         *
         * @param userName El nombre del usuario.
         * @param email El correo electrónico del usuario.
         * @param phoneNumber El número de teléfono del usuario.
         */
        public User(String userName, String email, String phoneNumber) {
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

    }

    interface Notification{
        /**
         * Envía una notificación con el mensaje especificado.
         *
         * @param message El mensaje de la notificación.
         */
        void sendNotification(String message);
    }

    static class EmailNotification implements Notification{
        String email;

        /**
         * Constructor de la clase EmailNotification.
         *
         * @param email El correo electrónico al que se enviará la notificación.
         */
        public EmailNotification(String email){
            this.email = email;
        }

        @Override
        public void sendNotification(String message) {
            System.out.println("Sending email to " + email + ": " + message);
        }
    }

    static class SmsNotification implements Notification{
        String phoneNumber;

        /**
         * Constructor de la clase SmsNotification.
         *
         * @param phoneNumber El número de teléfono al que se enviará la notificación.
         */
        public SmsNotification(String phoneNumber){
            this.phoneNumber = phoneNumber;
        }

        @Override
        public void sendNotification(String message) {
            System.out.println("Sending SMS to " + phoneNumber + ": " + message);
        }
    }

    /**
     * Método principal para ejecutar el ejemplo de notificaciones.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        User user = new SingleResponsability().new User("User", "prueba@gmail.com", "123456789");
        Notification emailNotification = new EmailNotification(user.email);
        emailNotification.sendNotification("Hello this a email notification");
        Notification smsNotification = new SmsNotification(user.phoneNumber);
        smsNotification.sendNotification("Hello this a sms notification");
    }

}