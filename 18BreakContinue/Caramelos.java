// Al salir de una fiesta, recibes tantos caramelos como años te falten para tener 30
import java.util.Scanner;

public class Caramelos{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int caramelos = 0; // Contador de caramelos

		System.out.println(" == Caramelos! ==");

		System.out.print("Que edad tienes?: ");
		int edad = sc.nextInt();

		System.out.println("* Recibes 1 caramelo");
		edad++;
		caramelos++;

		while(true){

			System.out.println("* Recibes 1 caramelo mas");
			edad++;
			caramelos++;

			if(edad >= 30)
				break;
		}

		System.out.println("TOTAL CARAMELOS: " + caramelos);
	}
}

