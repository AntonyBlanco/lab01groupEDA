//string y sus metodos
public class Strings {
	public static void main(String[] args) {
		String vocales = "A-E-I-O-U";
		String cadena = "Palabra De Prueba";
		System.out.println("Vocales: " + vocales);
		System.out.println("-----------------------------------------------------");
		System.out.println("Metodos de strings");
		System.out.println("-----------------------------------------------------");
		System.out.println("--------------Cadena: " + cadena + "-----------------");
		System.out.println("Tamaño de cadena: " + cadena.length());
		System.out.println("Cadena convertida a Mayusculas: ---> "+ cadena.toUpperCase());   // Convierte la cadena a Mayusculas
		System.out.println("Cadena convertida a Minusculas: ---> "+ cadena.toLowerCase());   // Convierte la cadena a Minusculas
		System.out.println("Pocision de cadena 'De' " + cadena.indexOf("De")); //ubica un texto especifico
	}
}

