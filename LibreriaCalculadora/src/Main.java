import LibreriaES.EntradaSalida;

public class Main {
    /**
     * Método principal que realiza la operación seleccionada por el usuario
     * @param args
     */

    public static void main(String[] args) {

        final float operacion = EntradaSalida.entrada("Elija la operación a realizar: \n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Raiz\n", 1);
        Float a;
        Float b;

        /*Menú de opciones para el usuario*/
        switch ((int) operacion) {
            case 1:
                Suma suma = new Suma();
                a = EntradaSalida.entrada("Primer número a sumar: ", 1);
                b = EntradaSalida.entrada("Segundo número a sumar: ", 1);
                suma.sumar(a, b);
                EntradaSalida.salida("El resultado de la suma es: ", 1);
                break;
            case 2:
                Resta resta = new Resta();
                a = EntradaSalida.entrada("Primer número a restar: ", 1);
                b = EntradaSalida.entrada("Segundo número a restar: ", 1);
                resta.restar(a, b);
                EntradaSalida.salida("El resultado de la resta es: ", 1);
                break;
            case 3:
                Multiplicacion multiplicacion = new Multiplicacion();
                a = EntradaSalida.entrada("Primer número a multiplicar: ", 1);
                b = EntradaSalida.entrada("Segundo número a multiplicar: ", 1);
                multiplicacion.multiplicar(a, b);
                EntradaSalida.salida("El resultado de la multiplicación es: ", 1);
                break;
            case 4:
                Division division = new Division();
                a =EntradaSalida.entrada("Primer número a dividir: ", 1);
                b = EntradaSalida.entrada("Segundo número a dividir: ", 1);
                division.dividir(a, b);
                EntradaSalida.salida("El resultado de la división es: ", 1);
                break;
            case 5:
                RaizCuadrada raiz = new RaizCuadrada();
                a =EntradaSalida.entrada("Introduce el indice: ", 1);
                b = EntradaSalida.entrada("Introduce el radicando: ", 1);
                raiz.calcularRaiz(a, b);
                EntradaSalida.salida("El resultado de la raiz es: ", 1);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}