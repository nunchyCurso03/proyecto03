package es.santander.ascender.proyecto03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    // PREGUNTAR¿crear una new Calculadora en cada método o una fuera
    // común?-->BORRAR
    // TODO ¿donde creo el método para dividir por cero? (NO ESTÁ CREADO)
    @Test
    public void testSumar() {
        // Preparo
        Calculadora calculadora = new Calculadora();

        // Ejecuto
        long resultadoSumar = calculadora.sumar(25, 5);

        // Verifico
        assertEquals(30, resultadoSumar);
    }

    @Test
    public void testRestar() {
        // Preparo
        Calculadora calculadora = new Calculadora();

        // Ejecuto
        long resultadoRestar = calculadora.restar(12, 2);

        // Verifico
        assertEquals(10, resultadoRestar);
    }

    @Test
    public void testMultiplicar() {
        // Preparo
        Calculadora calculadora = new Calculadora();

        // Ejecuto
        long resultadoMultiplicar = calculadora.multiplicar(20, 3);

        // Verifico
        assertEquals(60, resultadoMultiplicar);
    }

    @Test
    public void testDividir() {
        // Preparo
        Calculadora calculadora = new Calculadora();

        // Ejecuto
        double resultadoDividir = calculadora.dividir(50, 2);

        // Verifico
        assertEquals(25.0, resultadoDividir);
    }
}
