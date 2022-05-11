// Devolver el elemento n de la sucesion de Fibonacci para f(0) = 0 y f(1) = 1
public class Fibonacci{
	public static void main(String[] args){
		System.out.println(" == Fibonacci == ");
	}
	public static int fibonacci(int n){
		if(n == 0 || n == 1){
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}

