//Metodos en java: Un método es un bloque de código que solo se ejecuta cuando se le llama.
public class Methods {
	public static void main(String[] args) {
		metodo1();//llamada a metodo 1
		System.out.println("ejecucion de metodo2 --> " +metodo2()); //lamada e impresion de metodo2
	}
	
//Este metodo vacio ejecuta una snetencia que envia un mensaje 
static void metodo1() {
	System.out.println("Este mensaje se mostrará cuando llamen al metodo1");
}
//Este metodo muestra el numero que contiene una variable dentro del metodo
static int metodo2() {
	int numeros = 5+5;
	return numeros;
}
}
