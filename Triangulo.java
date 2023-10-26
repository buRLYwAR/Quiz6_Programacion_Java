/**
 * Clase que representa un triángulo rectángulo, extendiendo la clase FiguraGeometrica.
 * Esta clase permite calcular el área y el perímetro del triángulo basándose en su base y altura.
 */
public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    /**
     * Constructor para crear una instancia de un triángulo rectángulo con una base y altura especificadas.
     *
     * @param base La longitud de la base del triángulo rectángulo.
     * @param altura La longitud de la altura del triángulo rectángulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Triangulo(double base, double altura) {
        super(base);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método para obtener la base del triángulo.
     *
     * @return Retorna la base del triángulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getBase() {
        return base;
    }

    /**
     * Método para establecer una nueva base al triángulo.
     *
     * @param base El nuevo valor de la base.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Método para obtener la altura del triángulo.
     *
     * @return Retorna la altura del triángulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Método para establecer una nueva altura al triángulo.
     *
     * @param altura El nuevo valor de la altura.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Método para calcular el área del triángulo.
     *
     * @return Retorna el área del triángulo, que se calcula como la base multiplicada por la altura y dividida por 2.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double getArea() {
        return (this.base * this.altura) / 2;
    }

    /**
     * Método para calcular el perímetro del triángulo rectángulo.
     *
     * @return Retorna el perímetro del triángulo, que se calcula sumando la base, y dos veces la hipotenusa.
     *
     * Complejidad temporal: O(1) Tiempo constante, ya que las operaciones aritméticas y la raíz cuadrada son operaciones constantes.
     */
    @Override
    public double getPerimetro() {
        double hipotenusa = Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
        return this.base + 2 * hipotenusa;
    }
}
