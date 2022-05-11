// Esta clase muestra un ejemplo de Math.min() para buscar el minimo valor de un arreglo
public class MinValueSearch{
	public static void main(String[] args){
		System.out.println("Mininum Value Search");
		// Genera un arreglo de valores enteros aleatorios [0; 50>
		int[] arr = RandomArrayGenerator.genIntArray(20, 0, 50);
		printArr(arr);
		int minVal = minValueSearch(arr);
		System.out.println("Minimun value of array: " + minVal);
	}
	public static int minValueSearch(int[] arr){
		int min = arr[0];
		for(int i = 1; i < arr.length; i++){
			// Establece el minimo valor
			min = Math.min(min, arr[i]);
		}
		return min;
	}
	public static void printArr(int[] arr){
	// Imprime un arreglo de enteros
		System.out.print("[");
		for(int i = 0; i < arr.length; i++){
			if(i != 0)
				System.out.print(",");
			System.out.print( arr[i] );
		}
		System.out.println("]");
	}
}

