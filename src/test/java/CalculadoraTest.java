import org.junit.Test;
import static org.junit.Assert.*;
@SuppressWarnings("restriction")
public class CalculadoraTest {
	private Calculadora calculadora = new Calculadora();

    @Test
    public void testSubtraInteiros() {
        assertEquals(3, calculadora.subtraInteiros(5, 2));
    }

    @Test
    public void testMultiplicaInteiros() {
        assertEquals(10, calculadora.multiplicaInteiros(2, 5));
    }

    @Test
    public void testDividiInteiros() {
        assertEquals(2, calculadora.dividiInteiros(10, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividiInteirosPorZero() {
        calculadora.dividiInteiros(10, 0);
    }
}

