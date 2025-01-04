package solid.examples.java.solid.java.badexercises.badexercises;

/**
 * La clase SingleResponsability demuestra un ejemplo de incorrecto donde se puede implementar el principio de responsabilidad única.
 * Contiene una clase interna para manejar notificaciones por correo electrónico y SMS.
 *
 * @autor santalbu
 */
public class SingleResponsability {

    /**
     * La clase NotificationService maneja el envío de notificaciones por correo electrónico y SMS.
     */
    class NotificationService {
        private String userName;
        private String email;
        private String phoneNumber;

        /**
         * Constructor de la clase NotificationService.
         *
         * @param userName El nombre del usuario.
         * @param email El correo electrónico del usuario.
         * @param phoneNumber El número de teléfono del usuario.
         */
        public NotificationService(String userName, String email, String phoneNumber) {
            this.userName = userName;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        /**
         * Envía un correo electrónico con el mensaje especificado.
         *
         * @param message El mensaje del correo electrónico.
         */
        public void sendEmail(String message) {
            System.out.println("Sending email to " + email + ": " + message);
        }

        /**
         * Envía un SMS con el mensaje especificado.
         *
         * @param message El mensaje del SMS.
         */
        public void sendSms(String message) {
            System.out.println("Sending SMS to " + phoneNumber + ": " + message);
        }
    }

}