package calc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTeste {

    @Test
    public void testSomaInteiros() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.SomaInteiros(2, 3));
    }

    @Test
    public void testSubtraInteiros() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.subtraInteiros(5, 3));
    }

    @Test
    public void testMultiplicaInteiros() {
        Calculadora calc = new Calculadora();
        assertEquals(15, calc.multiplicaInteiros(3, 5));
    }

    @Test
    public void testDividiInteiros() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividiInteiros(6, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividiInteirosPorZero() {
        Calculadora calc = new Calculadora();
        calc.dividiInteiros(6, 0);
    }
}

