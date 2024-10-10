import java.util.Scanner;
import java.util.Random;

public class GenerateurMotMePasseSecurise {

	public static void main(String[] args) {
		/*
		 * Exercice 5 : "Le générateur de mot de passe sécurisé" Une société vous a
		 * demandé de développer un générateur de mot de passe sécurisé. Le programme
		 * doit générer un mot de passe de longueur donnée par l'utilisateur. Le mot de
		 * passe doit contenir des lettres majuscules, des lettres minuscules, des
		 * chiffres et des symboles spéciaux. Vous devez aussi vérifier que le mot de
		 * passe généré respecte ces critères
		 */
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Entrez une longuere de mdp ");
		int longueur = myObj.nextInt();
		String motDePasse = "";
		
		/*
		 * lettres majuscules lettres minuscules chiffres symboles spéciaux
		 */
		
	    for (int i = 33; i < 126; ++i) {
	    	System.out.println(i + "===> " + (char)i);
	     } 
	    
	    Random r = new Random();
    	int k = r.nextInt(26) + 65;
		System.out.println("lettres majuscules ===> " + (char)k);
		
		k = r.nextInt(26) + 97; 
		 System.out.println("lettres minuscules ===> " + (char)k);
		 
		k = r.nextInt(10) + 47; 
		System.out.println("chiffres ===> " + (char)k);
		  
		k = r.nextInt(14) + 33;
		System.out.println("symboles spéciaux ===> " + (char)k);
		
		k = r.nextInt(126) + 33;
		System.out.println("tout ===> " + (char)k);
		
		System.out.println("longueur " + longueur + " === ");
		
		for (int j = 0; j < longueur; ++j) {
			k = r.nextInt(92) + 33;
			motDePasse += (char)k;
			System.out.println("==============> " + (char)k + "  ====== " + k);
		}
			
		System.out.println("Le mot de passe est " + motDePasse);	 
		myObj.close();
	}

}
