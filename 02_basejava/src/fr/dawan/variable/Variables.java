package fr.dawan.variable;

public class VariablesEtTypes {

	public static void main(String[] args) {
		/*
		 * *Declaration d'une variable : Type nom_variable = valeur
		 */
		//Type caract�re
		char c = 'a';
		System.out.println(c);
		
		//Type entier: byte, short, int, long
				byte b = 1;
				short s = 2;
				int i = 3;
				long l = 4;

				/*
				 * *On peut forcer une valeur litteral � �tre interpret�e comme un entier long
				 * en sufixant la valeur par L ou l
				 */
				long L2 = 100L;
				/*  Pour une meuilleur visibilit� il est egalement possible de s�parer les milliers
				* par un underscore()
				*/
				long L3 = 1_000_000_000;
				System.out.println("Le contenu de 13 : " + 13 + 15);
				
				//Les types � virgules flottantes : float et double
				double d1 = 5.8;
				System.out.println("Le contenu de d1 : " + d1);
				
				//Pour les variables de type float, il faut sufixer les valeurs la valeur par F ou f
                float f = 0.5F;
                
                boolean bool = true;
                
                // Type complexe
                String str = "DAWAN";
                int[] tab = {200,300};
                
	}

}
