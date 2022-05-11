//Alcance de las variables en java
public class Scope {
	public static void main(String[] args) {
	    //System.out.println(x); //--> si dejamos de comentar esta linea de codigo, surgiria un error de sintaxis 
		//pues la variable x no esta aún declarada
	    int x = 100;
	    System.out.println(x);
	}
	  	//System.out.println(x); //--> Del mismo modo si dejamos de comentar esta linea habria un error pues a pesar
	  	//de que la variable es declarada antes, no esta dentro del bloque main (delimitado entre corchetes)
}
