package es.santander.ascender.proyecto03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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

    @Test
    public void testDividirPorCero() {
        // Preparo
        Calculadora calculadora = new Calculadora();

        // Ejecuto
       

        // Verifico . En este caso se captura la excepción
        try{

            double resultadoDividirPorCero = calculadora.dividir(50, 0);
            fail("Debería haber lanzado un error de división por 0");
        }catch(Exception e){
            System.out.println(e);
        }
     
    }

    @Test
    public void testPresentarTablaMultiplicar(){
        // Preparo
        Calculadora calculadora = new Calculadora();
         // Ejecuto
         calculadora.presentarTablaMultiplicar(6);

    }
    @Test
    public void testCalcularTablaMultiplicar(){
        // Preparo
        Calculadora calculadora = new Calculadora();
         // Ejecuto
         calculadora.calcularTablaMultiplicar(9);

    }

    @Test
    public void testCalcularTablaMultiplicarConWile(){
        // Preparo
        Calculadora calculadora = new Calculadora();
         // Ejecuto
         calculadora.calcularTablaMultiplicarConWhile(9);

    }

    @Test
    public void testCalcularTablaMultiplicarConDoWhile(){
        // Preparo
        Calculadora calculadora = new Calculadora();
         // Ejecuto
         calculadora.calcularTablaMultiplicarConDoWhile(9);

    }


}
