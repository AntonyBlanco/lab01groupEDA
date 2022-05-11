// Esta clase muestra un ejemplo de Math.min() para buscar el minimo valor de un arreglo
public class MinValueSearch{
	public static void main(String[] args){
		System.out.println("Mininum Value Search");
		// Genera un arreglo de valores enteros aleatorios [0; 50>
		int[] arr = RandomArrayGenerator.genIntArray(20, 0, 50);
		RandomArrayGenerator.printArr(arr);
		int minVal = minValueSearch(arr);
		System.out.println("Minimun value of array: " + minVal);
	}
	public static int minValueSearch(int[] arr){
		return arr[0];
	}
}

