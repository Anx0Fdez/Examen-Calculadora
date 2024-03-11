/**
 * Clase que realiza la Raiz cuadrada de dos números
 */

public class RaizCuadrada {

    /**
     * Método que realiza la raiz de dos números
     * @param radicando Primer número
     * @param indice    Segundo número
     * @return El resultado de la raiz
     * @throws IllegalArgumentException Si el radicando es negativo y el indice es par, o si el indice es cero.
     */

    public double calcularRaiz(double radicando, double indice) {
        // Verificar si el radicando es negativo y el indice es par
        if (radicando < 0 && indice % 2 == 0) {
            // Lanzar una excepción ya que no se puede calcular la raíz de un número negativo si el indice es par

            throw new IllegalArgumentException("Error: No se puede calcular la raíz de un número negativo si el índice es par.");
        }
        // Verificar si el indice es cero
        else if (indice == 0) {
            // Lanzar una excepción para evitar errore
            throw new IllegalArgumentException("Error: El índice no puede ser cero.");
        } else {
            // Calcular y devolver la raíz
            return Math.pow(radicando, 1.0 / indice);
        }


    }
}
