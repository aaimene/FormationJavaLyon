package fr.dawan.TranTypages;

public class IntroductionTranstypage {

	public static void main(String[] args) {
		// premiere solution
		int var1 = 4;
		int var2 = 10;
		double quotient = var1/var2;
		System.out.println("quotient = " + quotient);
		
		//2éme solution
		double _var1 = 4;
		double _var2 = 10;
		double quotient1 = _var1/_var2;
		System.out.println("quotient = " + quotient1);
		
		//3éme solution
		// On peut caster 1 des deux variables
		double quotient3 = (double) var1/ _var2;
		System.out.println("quotient = " + quotient2);
	}

}
