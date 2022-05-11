// Un método que devuelva el producto de 2 numeros enteros sin usar el operador de producto
public class Multiplicacion{
	public static void main(String[] args){
		System.out.println(" == Multiplicacion ==");
		System.out.println("Producto de 13 y 27");
		int res = producto(13, 27);
		System.out.println("Resultado: " + res);
	}
	public static int producto(int a, int b){
		int prod = 1; // Elemento neutro de operacion producto
		for(int i = 0; i < b; i++){
			prod += a;
		}
		return prod;
	}
}

