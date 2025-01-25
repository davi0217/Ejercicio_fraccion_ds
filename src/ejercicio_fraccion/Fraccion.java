package ejercicio_fraccion;

public class Fraccion {

    /*
     * Clase que elabora una fraccion cuyos atributos son un numerador y un
     * denominador
     * El denominador nunca es 0
     * Incluye métodos getters y setters y también de devolución de fracción como
     * texto
     * 
     * davidsanchez@authoros
     * 
     * @version 1.0
     */

    private int numerador;
    private int denominador;

    /*
     * Los atributos numerador y denominador son números enteros
     */

    public Fraccion() {
        /*
         * La función constructora es una función que admite sobrecarga
         * En este caso, al no recibir parámetros, devuelve la fracción 0/1
         */
        this.numerador = 0;
        this.denominador = 1;
    }

    public Fraccion(int num, int den) {
        /*
         * Cuando la función constructora recibe dos parámetros, valida que el
         * denominador no sea 0
         * En ese caso, crea una nueva función con el numerador y el denominador
         * indicados
         */
        if (den != 0) {
            this.numerador = num;
            this.denominador = den;
        } else {
            System.out.println("El denominador no puede ser 0");
        }
    }

    public Fraccion(int num) {
        /*
         * Si el constructor solo recibe el numerador, asigna el valor 1 al denominador
         */
        this.numerador = num;
        this.denominador = 1;
    }

    public int getNumerador() {
        /*
         * Devuelve el valor del numerador
         */
        return this.numerador;
    }

    public void setNumerador(int num) {
        /*
         * Cambia el valor del numerador
         */
        this.numerador = num;
    }

    public int getDenominador() {
        /*
         * Devuelve el valor del denominador
         */
        return this.denominador;
    }

    public void setDenominador(int den) {
        /*
         * Cambia el valor del denominador, validando que no sea 0
         */
        if (den != 0) {
            this.denominador = den;
        } else {
            System.out.println("He pasado cero como denominador, por lo que no lo cambiaré");
        }
    }

    public String fraccionTexto() {
        /*
         * Devuelve la fracción com texto
         */

        return (Integer.toString(numerador) + "\\" + Integer.toString(denominador));
    }

    public static void main(String[] args) throws Exception {
        /*
         * Una serie de impresiones para asegurar el correcto funcionamiento de la
         * función
         */
        Fraccion fraccion = new Fraccion(2, 5);
        System.out.println("El denominador de mi primera fracción es " + fraccion.getDenominador());
        System.out.println("El numerador de mi primera fracción es " + fraccion.getNumerador());
        System.out.println("Mi fracción como texto es " + fraccion.fraccionTexto());
        fraccion.setDenominador(0);
        fraccion.setDenominador(6);
        System.out.println("He cambiado el denominador de mi fracción y ahora es " + fraccion.getDenominador());
        Fraccion nuevaFraccion = new Fraccion();
        System.out.println("Mi nueva fracción, a la que no he añadido parámetros, es " + nuevaFraccion.fraccionTexto());
        Fraccion ultimaFraccion = new Fraccion(3);
        System.out.println("La última fracción que creo, a la que le paso solo el numerador 3, me devuelve "
                + ultimaFraccion.fraccionTexto());
    }
}
