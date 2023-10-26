/**
 * Clase abstracta que representa una figura geométrica.
 * Esta clase proporciona una estructura para representar figuras geométricas con un valor asociado.
 */
public abstract class FiguraGeometrica {
    protected double valor1;

    /**
     * Constructor de la clase FiguraGeometrica.
     *
     * @param valor1 Valor asociado con la figura geométrica. Este valor podría representar dimensiones
     *               como el radio, el lado, entre otros, dependiendo de la figura concreta.
     */
    public FiguraGeometrica(double valor1) {
        this.valor1 = valor1;
    }

    /**
     * Retorna el valor asociado con la figura geométrica.
     *
     * @return El valor asociado con la figura.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getValor1() {
        return valor1;
    }

    /**
     * Establece el valor asociado con la figura geométrica.
     *
     * @param valor1 Nuevo valor a establecer.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    /**
     * Método abstracto para obtener el área de la figura geométrica.
     *
     * @return El área de la figura.
     */
    public abstract double getArea();

    /**
     * Método abstracto para obtener el perímetro de la figura geométrica.
     *
     * @return El perímetro de la figura.
     */
    public abstract double getPerimetro();
}
