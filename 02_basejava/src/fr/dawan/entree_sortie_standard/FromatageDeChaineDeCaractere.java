package fr.dawan.entree_sortie_standard;

public class FromatageDeChaineDeCaractere {

	public static void main(String[] args) {
		// Les sorties : le format de ce qui va �tre affich�
		// %s Permet de formater une chaine de caractere
		//%c Permet de formater un caractere
		//%d peremt de for�ater un entier en base d�ciamla
		//%n ou \n retourne � la ligne
		
		int dividende = 25;
		int divisuer = 11;
		
		// 1er solution utilisation println ==>[25/11]
		System.out.println("[" +  dividende + "/" + divisuer+ "]");
		
		// 2�me solution utilisation println ==>[25/11]
		System.out.printf("%d%d%n", dividende,divisuer);
		
		// 3�me solution utilisation println ==>[25/11]
		String str = String.format("%d%d%n", dividende,divisuer);
		System.out.println(str);
	}

}
