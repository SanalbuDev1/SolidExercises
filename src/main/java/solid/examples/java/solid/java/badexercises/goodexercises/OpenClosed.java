package solid.examples.java.solid.java.badexercises.goodexercises;

/**
 * La clase OpenClosed demuestra el principio de abierto/cerrado.
 * Contiene una interfaz para aplicar descuentos y varias implementaciones de descuentos.
 *
 * @autor santalbu
 */
public class OpenClosed {

    /**
     * La interfaz Discount define el método para aplicar un descuento.
     */
    interface Discount {
        /**
         * Aplica un descuento al precio original.
         *
         * @param originalPrice El precio original.
         * @return El precio después de aplicar el descuento.
         */
        double applyDiscount(double originalPrice);
    }

    /**
     * La clase GenericDiscount implementa la interfaz Discount para aplicar un descuento genérico.
     */
    class GenericDiscount implements Discount {
        @Override
        public double applyDiscount(double originalPrice) {
            return originalPrice * 0.90;
        }
    }

    /**
     * La clase SeasonalDiscount implementa la interfaz Discount para aplicar un descuento estacional.
     */
    class SeasonalDiscount implements Discount {
        @Override
        public double applyDiscount(double originalPrice) {
            return originalPrice * 0.85;
        }
    }

    /**
     * La clase QuantityDiscount implementa la interfaz Discount para aplicar un descuento por cantidad.
     */
    class QuantityDiscount implements Discount {
        @Override
        public double applyDiscount(double originalPrice) {
            return originalPrice * 0.80;
        }
    }

    /**
     * La clase PriceCalculatorRefactored calcula el precio después de aplicar un descuento.
     */
    class PriceCalculatorRefactored {
        /**
         * Calcula el precio después de aplicar un descuento.
         *
         * @param originalPrice El precio original.
         * @param discount La implementación del descuento a aplicar.
         * @return El precio después de aplicar el descuento.
         */
        public double calculatePrice(double originalPrice, Discount discount) {
            return discount.applyDiscount(originalPrice);
        }
    }

    /**
     * Método principal para ejecutar el ejemplo de aplicación de descuentos.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        OpenClosed openClosed = new OpenClosed();

        OpenClosed.PriceCalculatorRefactored priceCalculatorRefactored = openClosed.new PriceCalculatorRefactored();
        System.out.println(priceCalculatorRefactored.calculatePrice(100, openClosed.new GenericDiscount()));
        System.out.println(priceCalculatorRefactored.calculatePrice(100, openClosed.new SeasonalDiscount()));
        System.out.println(priceCalculatorRefactored.calculatePrice(100, openClosed.new QuantityDiscount()));
    }
}