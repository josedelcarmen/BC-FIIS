/*
Un cajero automático entrega billetes de 200, 100, 50, 20 y 10 soles 
Dado un monto a retirar entregar la menor cantidad de billetes posible
*/
public class CajeroAutomatico
{
	public static void main(String[] args) {
		int[] billete = {200, 100, 50, 20, 10}; // 5 elementos
		// El índice va de 0 hasta 4
		int monto = 750, resto = monto, cociente = 0;
		
		for (int i = 0; i < billete.length; i++) {
		    cociente = resto / billete[i]; // cociente de división entera
		    resto = resto % billete[i]; // resíduo de una división
		    if (cociente > 0)
		    System.out.println("" + cociente + " de " + billete[i]  + " soles");
		}
	}
}