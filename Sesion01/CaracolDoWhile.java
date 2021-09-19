/*
Un caracol se cae a un pozo de altura H cms., por el día sube S cms. y 
por la noche resbala R cms. en cuantos días sale el caracol del pozo?
*/
public class CaracolDoWhile
{
	public static void main(String[] args) {
		int H = 20, S = 9, R = 7;
		int avance = 0, dias = 0;
		
		// Estructura de repetición de bloques de código
		do { // Condición post probada: al menos ejecuta 1 vez el bloque
		    dias++; // Incrementador en 1 de datos numéricos, enteros
		    avance = avance + S; // En el día sube S cms.
		    if (avance >= H){ // Si el avance es > H
		        break; // se corta la repetición
		    }
		    avance = avance - R; // En la noche resbala R cms.
		} while (avance < H); // Mientras el caracol sigue en el pozo
		System.out.println("El caracol sale en " + dias + " días.");
	}
}