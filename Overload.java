/*Realizar operaciones con sobrexarga de metodos.*/
public class Overload {
    public static void main(String[] args) {
       
        System.out.println("La suma es: "+suma(8.5, 10.3, 21.7));
        System.out.println("La suma es: "+suma(6, 7));
        System.out.println("La resta es: "+resta(88.5, 10.3, 21.7));
        System.out.println("La resta es: "+resta(100, 40));
        System.out.println("La multiplicacion es: "+multi(15, 11, 6));
        System.out.println("La multiplicacion es: "+multi(100, 40));
    }
    public static int suma(int n1, int n2) {
        return n1 + n2;
    }
    public static double suma(double n1, double n2, double n3 ) {
        return n1 + n2 + n3;
    }
    public static int resta(int n1, int n2) {
        return n1 - n2;
    }
    public static double resta(double n1, double n2, double n3 ) {
        return n1 - n2 - n3;
    }
    public static int multi(int n1, int n2) {
        return n1 * n2;
    }
    public static int multi(int n1, int n2, int n3 ) {
        return n1 * n2 * n3;
    }
}


