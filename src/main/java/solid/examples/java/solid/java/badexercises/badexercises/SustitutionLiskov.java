package solid.examples.java.solid.java.badexercises.badexercises;

/**
 * La clase SustitutionLiskov demuestra un ejemplo que no sigue el principio de sustitución de Liskov.
 * Contiene una clase Rectangle y una clase Square que extiende Rectangle.
 *
 * @autor santalbu
 */
public class SustitutionLiskov {

    /**
     * La clase Rectangle representa un rectángulo con ancho y alto.
     */
    class Rectangle {
        private int width;
        private int height;

        /**
         * Obtiene el ancho del rectángulo.
         *
         * @return El ancho del rectángulo.
         */
        public int getWidth() {
            return width;
        }

        /**
         * Establece el ancho del rectángulo.
         *
         * @param width El ancho del rectángulo.
         */
        public void setWidth(int width) {
            this.width = width;
        }

        /**
         * Obtiene el alto del rectángulo.
         *
         * @return El alto del rectángulo.
         */
        public int getHeight() {
            return height;
        }

        /**
         * Establece el alto del rectángulo.
         *
         * @param height El alto del rectángulo.
         */
        public void setHeight(int height) {
            this.height = height;
        }

        /**
         * Calcula el área del rectángulo.
         *
         * @return El área del rectángulo.
         */
        public int calculateArea() {
            return width * height;
        }
    }

    /**
     * La clase Square extiende Rectangle y representa un cuadrado.
     * Sobrescribe los métodos setWidth y setHeight para asegurar que el ancho y el alto sean iguales.
     */
    class Square extends Rectangle {
        @Override
        public void setWidth(int width) {
            super.setWidth(width);
            super.setHeight(width); // Forzamos que ancho y alto sean iguales
        }

        @Override
        public void setHeight(int height) {
            super.setWidth(height);
            super.setHeight(height); // Forzamos que ancho y alto sean iguales
        }
    }
}