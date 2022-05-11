// Se ingresan 2 puntos opuestos (x, y) de un rectangulo en el espacio 2D
// El programa calcula el área de dicho rectangulo usando Math.abs()
import java.util.Scanner;

public class AreaRectangulo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println(" == Area de Rectangulo == ");
		
		System.out.println("\nIngrese 2 numeros para P1(x,y):");
		double xP1 = sc.nextDouble();
		double yP1 = sc.nextDouble();

		System.out.println("\nIngrese 2 numeros para P2(x,y):");
		double xP2 = sc.nextDouble();
		double yP2 = sc.nextDouble();
		
		double area = calcularAreaRect(xP1, yP1, xP2, yP2);
		System.out.println("\nArea calculara: " + area);
	}
	public static double calcularAreaRect( double xP1, double yP1, double xP2, double yP2){
	// Calcula el area del rectangulo usando Math.abs()
		double base = Math.abs(xP1 - xP2);
		double altura = Math.abs(yP1 - yP2);
		return base * altura;
	}
}

