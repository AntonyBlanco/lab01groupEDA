/*Crear dos matrices de 2x2 y sumar sus valores, los resultados se deben almacenar en otra matriz. 
  Mostrar la suma.*/
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1[][]=new int[2][2];
        int m2[][]=new int[2][2];
        int suma[][]=new int[2][2];
        
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1.length;j++){
                 
                System.out.print("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 1: ");
                m1[i][j]=sc.nextInt();
                System.out.print("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 2: ");
                m2[i][j]=sc.nextInt();
                 
                suma[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("");
        System.out.println("Matriz 1");
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1.length;j++){
                System.out.print(m1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz 2");
        for(int i=0;i<m2.length;i++){
            for(int j=0;j<m2.length;j++){
                System.out.print(m2[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz Suma");
        for(int i=0;i<suma.length;i++){
            for(int j=0;j<suma.length;j++){
                System.out.print(suma[i][j]+" ");
            }
            System.out.println("");
       } 
   }   
}
