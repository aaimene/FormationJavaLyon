package Exercice;

public class Exercice_01 {

	public static void main(String[] args) {
		// Méthode1
		double _var1 = 5.7;
		double _var2 = 10;
		double quotient1 = _var1/_var2;
		System.out.println("quotient = " + "[" + quotient1 + "]");
		
		// 2éme méthode

				double var1 = 5.7;
				int var2 = 10;
				double quotient2 = var1/var2;
				System.out.println("quotient = " + "[" + quotient2 + "]");
				
		//3éme solution
		// On peut caster 1 des deux variables
			double quotient3 = (double) var1/ _var2;
			System.out.println("quotient =  " + "[" + quotient3 + "]");
		

	}

}
