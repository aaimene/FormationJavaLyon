package Exercice;

import java.util.Scanner;

public class AnneeBissextile {

	public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int annee = 0;
        
        System.out.print("Entrer l'année souhaitée SVP : ");
        annee = input.nextInt();
        
        if ( ( ( annee % 4 == 0 ) && ( annee % 100 != 0 ) ) || ( annee % 400 == 0 ) ) {
            System.out.println( "l'année " + annee + " est bissextile .");
         }
         else {
            System.out.println( "l'année " + annee + " n'est pas bissextile .");
         }  
        
	}

}
