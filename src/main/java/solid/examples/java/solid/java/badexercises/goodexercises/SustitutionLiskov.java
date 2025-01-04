package solid.examples.java.solid.java.badexercises.goodexercises;

/**
 * La clase SustitutionLiskov demuestra el principio de sustitución de Liskov.
 * Contiene una interfaz para formas geométricas y sus implementaciones.
 *
 * @autor santalbu
 */
public class SustitutionLiskov {

    /**
     * La interfaz Shape define el método para calcular el área de una forma.
     */
    interface Shape {
        /**
         * Calcula el área de la forma.
         *
         * @return El área de la forma.
         */
        double calculateArea();
    }

    /**
     * La clase Square implementa la interfaz Shape para representar un cuadrado.
     */
    class Square implements Shape {
        int side;

        /**
         * Constructor de la clase Square.
         *
         * @param side El lado del cuadrado.
         */
        public Square(int side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return side * side;
        }
    }

    /**
     * La clase Rectangle implementa la interfaz Shape para representar un rectángulo.
     */
    class Rectangle implements Shape {
        int width;
        int height;

        /**
         * Constructor de la clase Rectangle.
         *
         * @param width El ancho del rectángulo.
         * @param height El alto del rectángulo.
         */
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }

    /**
     * La clase AreaCalculator calcula el área de una forma.
     */
    class AreaCalculator {
        /**
         * Calcula el área de una forma.
         *
         * @param s La forma cuya área se va a calcular.
         * @return El área de la forma.
         */
        public double calculateArea(Shape s) {
            return s.calculateArea();
        }
    }

    /**
     * Método principal para ejecutar el ejemplo de cálculo de áreas.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        SustitutionLiskov sl = new SustitutionLiskov();
        AreaCalculator ac = sl.new AreaCalculator();

        Square s = sl.new Square(5);
        Rectangle r = sl.new Rectangle(2, 3);

        System.out.println(ac.calculateArea(s));
        System.out.println(ac.calculateArea(r));
    }

}