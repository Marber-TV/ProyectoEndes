package jUnit;
/**
 * Esta clase representa una calculadora básica que realiza operaciones matemáticas simples.
 *
 * @version 1.1
 * @author Pablo Martinez
 */
public class Calculadora {
    private int num1;
    private int num2;

    /**
     * Crea una instancia de la calculadora con dos números dados.
     *
     * @param num1 El primer número.
     * @param num2 El segundo número.
     */
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Calcula la suma de los dos números.
     *
     * @return La suma de los dos números.
     */
    public int suma() {
        return num1 + num2;
    }

    /**
     * Calcula la resta entre el primer y segundo número.
     *
     * @return La resta entre el primer y segundo número.
     */
    public int resta() {
        return num1 - num2;
    }

    /**
     * Calcula la multiplicación de los dos números.
     *
     * @return La multiplicación de los dos números.
     */
    public int multiplica() {
        return num1 * num2;
    }

    /**
     * Calcula la división del primer número entre el segundo número.
     *
     * @return El cociente de la división del primer número entre el segundo número.
     */
    public int divide() {
        return num1 / num2;
    }

    /**
     * Calcula el valor absoluto de la diferencia entre los dos números.
     *
     * @return El valor absoluto de la diferencia entre los dos números.
     */
    public int valorAbsoluto() {
        return restaPositiva() ? num1 - num2 : num2 - num1;
    }

    /**
     * Verifica si la resta entre el primer y segundo número es un resultado positivo o cero.
     *
     * @return `true` si la resta es un resultado positivo o cero, `false` en caso contrario.
     */
    public boolean restaPositiva() {
        return this.num1 >= this.num2;
    }

    /**
     * Calcula la división del primer número entre el segundo número, aceptando el valor 0 como divisor.
     *
     * @return El cociente de la división del primer número entre el segundo número, o `null` si el segundo número es 0.
     */
    public Integer divideAcepta0() {
        return num2 == 0 ? null : num1 / num2;
    }
}
