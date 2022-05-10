package IfElse;
//Manejo de If else (version corta)
public class IfElseShort {
	public static void main(String[] args) {
		int time = 20;
		//forma regular de aplicacion del If else
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		//forma corta de if else para hacer el mismo código
		System.out.println("---------------------------------");	
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);	
	}
}
