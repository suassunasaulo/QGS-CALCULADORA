
public class Calculadora {
	    public int subtraInteiros(int a, int b) {
	        return a - b;
	    }

	    public int multiplicaInteiros(int a, int b) {
	        return a * b;
	    }

	    public int dividiInteiros(int a, int b) {
	        if (b == 0) {
	            throw new IllegalArgumentException("Não é possível dividir por zero");
	        }
	        return a / b;
	    }
	}

