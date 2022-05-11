// Un repartidor de periodicos solo entrega el periodico a quienes pagaron por el
//
// Clientes se representan en un arreglo de booleanos
public class Repartidor{
	public static void main(String[] args){
		System.out.println(" == Repartidor de Periodicos ==");
		boolean[] clientes = generateBooleanArray(15);
		repartirPeriodicos(clientes);
	}
	public static boolean[] generateBooleanArray(int size){
	// Genera un arreglo de booleanos aleatorios
		boolean[] arr = new boolean[size];
		for(int i = 0; i < size; i++){
			arr[i] = generateRndBoolean();
		}
		return arr;
	}
	public static boolean generateRndBoolean(){
	// Genera un booleano aleatorio
		return Math.random() < 0.5 ? false : true;
	}
	public static void repartirPeriodicos(boolean[] lista){
	// Muestra en la salida estandar el proceso de las entregas
		for(int i = 0; i < lista.length; i++){
			boolean pagado = lista[i];
			if(!pagado) // Si no ha pagado se dirige al siguiente cliente
				continue;
			System.out.println("Periódico entregado a cliente " + i);
		}
		System.out.println("Entregas terminadas.");
	}
}

