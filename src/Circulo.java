/**
 * Ejemplo: círculos.
 *
 * @author José A. Mañas
 * @version 23.9.2005
 */
public class Circulo {
    /**
     *. Coordenada x del centro
     **/
    private double centroX;
    private double centroY;
    private double radio;
    /**
     * Constructor.
     * @param cx centro: coordenada X.
     * @param cy centro: coordenada Y.
     * @param r radio.
     */
    public Circulo(double cx, double cy, double r) {
        centroX = cx;
        centroY = cy;
        radio = r;
    }
    /**
     * Getter.
     * @return centro: coordenada X.
     */
    public double getCentroX() {
        return centroX;
    }
    /**
     * Calcula la longitud de la circunferencia (perímetro del círculo).
     * @return circunferencia.
     */
    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }
    /**
     * Desplaza el círculo a otro lugar.
     * @param deltaX movimiento en el eje X.
     * @param deltaY movimiento en el eje Y.
     */
    public void mueve(double deltaX, double deltaY) {
        centroX = centroX + deltaX;
        centroY = centroY + deltaY;
    }
    /**
     * Escala el círculo (cambia su radio).
     * @param s factor de escala.
     */
    public void escala(double s) {
        radio = radio * s;
        System.out.println(radio);
    }

}
