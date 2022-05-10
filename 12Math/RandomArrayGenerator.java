// Esta clase implementa 2 funciones que generan un arreglo de enteros y de reales
public class RandomArrayGenerator{
	public static void main(String[] args){
		System.out.println("Random Array Generator");
		int[] intArr = genIntArray(10, -5, 15);
		printArr(intArr);
	}
	public static int[] genIntArray(int size, int min, int max){
	// Genera un arreglo de enteros
	// "size" es el tamaño del arreglo
	// "min" es el minimo valor aleatorio, el valor es incluido
	// "max" es el máximo valor aleatorio, el valor es excluido
		int[] arr = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = genInt(min, max);
		}
		return arr;
	}
	public static int genInt(int min, int max){
	// Genera un valor entero aleatorio entre "min" incluido y "max" excluido
		int a = (int)(Math.random() * (max - min) + min);
		return a;
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

