// Este código utilizar ordenamiento burbuja de menor a mayor usando Math.max()

public class BubbleSortMax{
	public static void main(String[] args){
		System.out.println("Bubble Sort with Math.max()");

		int arr[] = RandomArrayGenerator.genIntArray(15,0,100);
		System.out.println("Random array");
		RandomArrayGenerator.printArr(arr);

		int[] sortedArray = bubbleSort(arr);
		System.out.println("Sorted array");
		RandomArrayGenerator.printArr(sortedArray);
	}
	public static int[] bubbleSort(){
		return {};
	}
}

