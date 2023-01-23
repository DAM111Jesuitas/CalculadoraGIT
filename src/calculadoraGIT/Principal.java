package calculadoraGIT;

public class Principal {
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		System.out.println(c.sumar(1, 3));
		System.out.println(c.restar(1, 4));
		System.out.println(c.multiplicar(3, 4));
	}
}
