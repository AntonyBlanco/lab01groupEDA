// Esta clase pregunta al usuario si quiere recibir el saludo de distintos animales
// Ejemplo de uso de Switch
import java.util.Scanner;

public class Saludo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println(" == Saludo ==");
		System.out.println(" 1. Perro");
		System.out.println(" 2. Gato");
		System.out.println(" 3. Loro");

		System.out.print("A quien desea saludar (1-3): ");
		int op = sc.nextInt();

		switch(op){
			default:
				System.out.println("* No recibiste ningun saludo :(");
				System.out.println("* Un perro viene a consolarte :D");
			case 1:
				System.out.println("GUAU GUAU!! :P");
				break;
			case 2:
				System.out.println("miaaaU!! :3");
				break;
			case 3:
				System.out.println("Hola, como estas? :v");
				break;
		}

	}
}

