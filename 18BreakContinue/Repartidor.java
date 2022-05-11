// Un repartidor de periodicos solo entrega el periodico a quienes pagaron por el
//
// Clientes se representan en un arreglo de booleanos
public class Repartidor{
	public static void main(String[] args){
		System.out.println(" == Repartidor de Periodicos ==");
	}
	public static boolean[] generateBooleanArray(int size){
	// Genera un arreglo de booleanos aleatorios
		boolean[] arr = new boolean[size];
		for(int i = 0; i < size; i++){
			arr[0] = generateRndBoolean();
		}
		return arr;
	}
	public static boolean generateRndBoolean(){
	// Genera un booleano aleatorio
		return Math.random() < 0.5 ? false : true;
	}
}

