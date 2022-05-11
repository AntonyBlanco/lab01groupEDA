// El programa pide 2 lados de un triangulo (double o in) para hallar la hipotenusa del triangulo
public class Pitagoras{
	public static void main(String[] args){
		System.out.println(" == Pitagoras == ");
		System.out.print("\nIngrese cateto 1: ");
		double cat1 = 40;
		System.out.println("\nCateto 1 = " + cat1);

		System.out.print("\nIngrese cateto 2: ");
		double cat2 = 9;
		System.out.println("\nCateto 2 = " + cat2);

		double hip = pitagoras(cat1, cat2);
		System.out.println("\nHipotenusa calculada: " + hip);
		
	}
	public static double pitagoras(double a, double b){
		double h = (a * a) + (b * b);
		h = Math.sqrt(h);	
		return h;
	}
}

