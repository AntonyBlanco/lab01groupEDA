// Cumpleanios:
// Programa que reparte un pastel de cierto peso entre una cantidad dada de personas de tal manera que se
// reparten las porciones en uno de los siguientes casos:
//  - Porciones de peso decimal iguales para todos
//  - Porciones de peso entero y lo que sobre se le agrega a la porcion del cumpleaniero
// La funcion repartirPasteles() recibe:
//  - El peso del pastel en gramos
//  - La cantidad de asistentes
//  - Booleano: Falso (Peso decimal) ; Verdadero (Peso entero)
// y devuelve un arreglo con los pesos de pastel para cada asistente, siendo la primera porcion para el
// cumpleaniero
public class Cumpleanios{
	public static void main(String[] args){
		System.out.println("  ---- Birthday Party ----");

		System.out.print("\nInsert cake weight: ");
		double cakeWeight = 40.0; // Peso del pastel
		System.out.print("\nCake weight: " + cakeWeight);

		System.out.print("\nInsert assistants quantity: ");
		int qtyAssistants = 12; // Cantidad de asistentes
		System.out.print("\nAssistants quantity: " + qtyAssistants);

		System.out.print("\nDivide in decimal or integer parts? (d/i): ");
		char diInput = 'd';
		boolean boolDecOrInt = false; // Peso decimal o entero
		if(diInput == 'd'){ // Particion modo Decimal
			boolDecOrInt = false;
			System.out.print("\nSet partition mode to Decimal");
		} else if(diInput == 'i'){ // Particion modo Integer
			boolDecOrInt = true;
			System.out.print("\nSet partition mode to Integer");
		}
		System.out.println();

		// Porciones a distribuir
		double[] portions = repartirPasteles(cakeWeight, qtyAssistants, boolDecOrInt);
	}
	public static double[] repartirPasteles(double cakeW, int qtyPeople, boolean decimalOrInteger){
		return null;
	}
}

