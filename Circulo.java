/**
 * Clase que representa un círculo, heredando propiedades y comportamientos
 * de la clase FiguraGeometrica. Esta clase proporciona métodos específicos
 * para calcular el área y el perímetro de un círculo.
 */
public class Circulo extends FiguraGeometrica {
    private double radio;

    /**
     * Constructor de la clase Circulo.
     *
     * @param radio Representa el radio del círculo.
     */
    public Circulo(double radio) {
        super(radio);
        this.radio = radio;
    }

    /**
     * Retorna el radio del círculo.
     *
     * @return El radio del círculo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el radio del círculo.
     *
     * @param radio El nuevo radio a establecer para el círculo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Calcula y retorna el área del círculo.
     *
     * @return El área del círculo, calculada como PI multiplicado por el cuadrado del radio.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    /**
     * Calcula y retorna el perímetro (o circunferencia) del círculo.
     *
     * @return La circunferencia del círculo, calculada como 2 multiplicado por PI y luego multiplicado por el radio.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.radio;
    }
}
