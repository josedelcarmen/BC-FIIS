/*
Dado un Año y un mes determinar cuantos días tiene ese mes.
Un año es bisiesto si es múltiplo de 4, múltiplo de 400, pero no de 100(pero no de 400)
*/
public class Bisiesto
{
	public static void main(String[] args) {
		int anio = 2021, mes = 9, dias = 0;
		switch(mes){
		    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		        dias = 31; break; // break aquí termina el grupo de casos
		    case 4: case 6: case 9: case 11:
		        dias = 30; break;
		    case 2:
		        dias = 28 + esBisiesto(anio); break;
		    default:
		        dias = 0; // no necesita break
		}
		System.out.println("El mes " + mes + " tiene " + dias + " días");
	}
	public static int esBisiesto(int anio){
	    int bisiesto = 0;
	    if (anio % 4 == 0){ // si es múltiplo de 4
	        bisiesto = 1;
	    }
	    if (anio % 100 == 0){ // si es múltiplo de 100
	        bisiesto = 0;
	    }
	    if (anio % 400 == 0){ // si es múltiplo de 400
	        bisiesto = 1;
	    }
	    return bisiesto;
	}
}