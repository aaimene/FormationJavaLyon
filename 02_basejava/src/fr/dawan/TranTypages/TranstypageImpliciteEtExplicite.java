package fr.dawan.TranTypages;

public class TranstypageImpliciteEtExplicite {

	public static void main(String[] args) {
		//Transtypages implicite : concerne un type inf�rieur
		// vers un type superieur
		int i = 42;
		double d = i;
		
		// Transtype explicite (cast)
		//Passage d'un type sup�rieur vers un type inf�rieur, cela
		//implique de faire un cast
		//CAST : concerne les conversions des types compatibles
		int i1 = 123;
		short s = (short) i1;
		
		int i3 = 130;
		byte b = (byte) i3;
		System.out.println(b); // perte de precision
		

	}

}
