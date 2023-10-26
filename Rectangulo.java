/**
 * Clase que representa un rectángulo, heredando propiedades y comportamientos
 * de la clase FiguraGeometrica. Esta clase proporciona métodos específicos
 * para calcular el área y el perímetro de un rectángulo.
 */
public class Rectangulo extends FiguraGeometrica{
    protected double valor2;

    /**
     * Constructor de la clase Rectangulo.
     *
     * @param valor1 Representa la longitud de uno de los lados del rectángulo.
     * @param valor2 Representa la longitud del otro lado del rectángulo.
     */
    public Rectangulo(double valor1, double valor2) {
        super(valor1);
        this.valor2 = valor2;
    }

    /**
     * Retorna la longitud del segundo lado del rectángulo.
     *
     * @return La longitud del segundo lado del rectángulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getValor2() {
        return valor2;
    }

    /**
     * Establece la longitud del segundo lado del rectángulo.
     *
     * @param valor2 Nuevo valor a establecer para el segundo lado del rectángulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    /**
     * Calcula y retorna el área del rectángulo.
     *
     * @return El área del rectángulo, calculada como el producto de sus dos lados.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double getArea() {
        return this.valor1 * this.valor2;
    }

    /**
     * Calcula y retorna el perímetro del rectángulo.
     *
     * @return El perímetro del rectángulo, calculado como la suma de los lados multiplicada por 2.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double getPerimetro() {
        return 2 * (this.valor1 + this.valor2);
    }
}

