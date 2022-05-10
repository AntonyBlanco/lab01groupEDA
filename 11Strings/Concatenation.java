package Strings;
//Ejemplos de concatenacion
public class Concatenation {
	public static void main(String[] args) {
		String mensaje1 = "Hola, amigos";
		String mensaje2 = "mundo";
		//concatenar con comillas no agrega espacios en blanco entre los textos a concatenar
		System.out.println(mensaje1 + "del " + mensaje2);
		//concatenar con la funcion concat() 
		System.out.println(mensaje1.concat(mensaje2));
	}
}
