public class Calculadora {

	public static void main(String[] args) {
		// Usando una librería de funciones
		int x = 2, y = 3;
		int suma = Funciones.sumar(x, y);
		System.out.println("La suma de " + x + " y de " + y + " es " + suma);	
		// Usando un método de instancia ( de objeto)
		double n1 = 3.14, n2 = 2.38;
		Funciones objFunciones = new Funciones(); // Creando el objeto (instancia)
		double sumaDecimales = objFunciones.sumar(n1, n2);
		System.out.println("La suma de " + n1 + " y de " + n2 + " es " + sumaDecimales);
	}

}
