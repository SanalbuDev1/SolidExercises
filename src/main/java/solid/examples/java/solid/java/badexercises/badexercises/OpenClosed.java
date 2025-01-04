package solid.examples.java.solid.java.badexercises.badexercises;

/**
 * La clase OpenClosed demuestra un ejemplo que no sigue el principio de abierto/cerrado.
 * Contiene una clase interna para calcular precios con diferentes tipos de descuentos.
 *
 * @autor santalbu
 */
public class OpenClosed {

    /**
     * La clase PriceCalculator calcula el precio después de aplicar un tipo de descuento.
     */
    class PriceCalculator {
        /**
         * Calcula el precio después de aplicar un tipo de descuento.
         *
         * @param originalPrice El precio original.
         * @param discountType El tipo de descuento a aplicar (GENERIC, SEASONAL, QUANTITY).
         * @param quantity La cantidad de productos (relevante solo para el descuento por cantidad).
         * @return El precio después de aplicar el descuento.
         */
        public double calculatePrice(double originalPrice, String discountType, int quantity) {
            if (discountType.equals("GENERIC")) {
                return originalPrice * 0.90; // 10% de descuento
            } else if (discountType.equals("SEASONAL")) {
                return originalPrice * 0.85; // 15% de descuento
            } else if (discountType.equals("QUANTITY") && quantity > 5) {
                return originalPrice * 0.80; // 20% de descuento
            } else {
                return originalPrice; // Sin descuento
            }
        }
    }

    /**
     * Método principal para ejecutar el ejemplo de cálculo de precios con descuentos.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        OpenClosed openClosed = new OpenClosed();

        OpenClosed.PriceCalculator priceCalculator = openClosed.new PriceCalculator();
        System.out.println(priceCalculator.calculatePrice(100, "GENERIC", 0));
        System.out.println(priceCalculator.calculatePrice(100, "SEASONAL", 0));
        System.out.println(priceCalculator.calculatePrice(100, "QUANTITY", 6));
    }
}