package fr.dawan.variable;

public class ConstantesEtRegleDeNommage {

	public static void main(String[] args) {
		System.out.println("*************Constante************");
		/*
		 * Les constantes doivent �tre ecrites majuscules, pour les diff�rencier
		 * des autres variables.
		 * doit contenir le mot cl� final : veut dire que le contenu de ma variable
		 * ne peut pas changer

		 */
		final int VIES_MAX = 15;
		//VIES_MAX = 52;
		System.out.println("***********REGLES DE NOMMAGE DES VARIABLES************");
		// Les noms des variables peuvent commencer par un underscore
		String val = "28";
		
		// Les molts compos�s
		//On peut utiliser l'underscore
		int nombre_de_vie;
		
		//On peut utiliser le CamelCase
		int nombreDeVie = 9;
		
		// Le nom d'une variable ne doit pas �tre un mot r�s�rv�
		// int double = 5;
		
		//Une variable ne peut pas commencer par une op�ration math�matique 
        //int -nbre = 8;

	}
	

}
