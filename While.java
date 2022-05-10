
/*Realiza un programa que sume valores introducido por el usuario. 
  Para ello crea una variable tipo int con valor inicial cero el cual almacenará 
  la suma de los valores introducido por el usuario. El scanner (solicitar un valor al usuario) 
  debe estar dentro del bucle.Cuando el total llegue a 200 saldrá del bucle y visualizara el total.*/

import java.util.Scanner;
public class While {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    int suma = 0;
    while(suma <= 200){
        System.out.print("Introduce el número a sumar: ");
        int num = sc.nextInt();
        suma+= num;
    }
    System.out.println("La suma es " + suma);
    System.out.println("");
  }   
}

