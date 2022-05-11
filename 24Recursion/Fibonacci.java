// Devolver el elemento n de la sucesion de Fibonacci para f(0) = 0 y f(1) = 1
import java.util.Scanner;

public class Fibonacci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println(" == Fibonacci == ");
		System.out.print("Ingrese valor para n de fibonacci: ");
		int n = sc.nextInt();
		int fibonacciN = fibonacci(n);

		System.out.println("Elemento " + n + " de Fibonacci:");
		System.out.println(fibonacciN);
	}
	public static int fibonacci(int n){
		if(n == 0 || n == 1){
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}

