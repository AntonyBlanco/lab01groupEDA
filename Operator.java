/*Declare dos variables de tipo int y realize cada una de las operaciones*/
public class Operator {
    public static void main(String[] args){
        int n1=50,n2=20;
        double resultado;
        
        //suma
        resultado=n1+n2;
        System.out.println("La suma es: "+resultado);
        
        //resta
        resultado=n1-n2;
        System.out.println("La resta es: "+resultado);
        
        //multiplicacion
        resultado=n1*n2;
        System.out.println("La multiplicación es: "+resultado);
        
        //division
        resultado=(double)n1/(double)n2;
        System.out.println("La division es: "+resultado);
        
        //modulo
        resultado=n1/n2;
        System.out.println("El modulo es: "+resultado);
        
        //incremento
        int inc = ++n1;
        System.out.println("Incrementando el primer número :"+inc);
        
        //deceremento
        int dec = --n2;
        System.out.println("Decrementando el segundo número :"+dec);
        
    }
}
