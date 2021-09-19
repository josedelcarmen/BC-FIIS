public class Funciones {
	/* Funciones de clase: se usan sin necesidad de crear objetos */
	public static int sumar(int a, int b) {
		return a + b;
	}
	public static int restar(int a, int b) {
		return a - b;
	}
	public static int multiplicar(int a, int b) {
		return a * b;
	}
	public static int dividir(int a, int b) {
		return a / b;
	}
	/* Funciones de instancia: se usan pero se necesita crear un objeto
	 * basado en ésta clase (instancia == objeto) */
	public double sumar(double x, double y) {
		return x + y;
	}
}
