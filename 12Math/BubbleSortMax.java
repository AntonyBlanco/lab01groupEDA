// Este código utilizar ordenamiento burbuja de menor a mayor usando Math.max()

public class BubbleSortMax{
	public static void main(String[] args){
		System.out.println("Bubble Sort with Math.max()");

		int arr[] = RandomArrayGenerator.genIntArray(15,0,100);
		System.out.println("Random array");
		printArr(arr);

		int[] sortedArray = bubbleSort(arr);
		System.out.println("Sorted array");
		printArr(sortedArray);
	}
	public static int[] bubbleSort(int[] arr){
	// Ordenamiento burbuja con Math.max()
		// Crea una copia del arreglo ingresado
		int sorted[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			sorted[i] = arr[i];
		}

		for(int i = 0; i < sorted.length - 1; i++){
			for(int n = 0; n < sorted.length - i - 1; n++){
				// Intercambio de valores con Math.max
				int max = Math.max(sorted[n], sorted[n+1]);
				if(sorted[n] == max){
					int tmp = sorted[n];
					sorted[n] = sorted[n+1];
					sorted[n+1] = tmp;
				}
			}
			// Opcional, solo para ver el proceso de ordenamiento
			printArr(sorted);
		}
		
		return sorted;
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

