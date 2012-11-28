package modele;
import controleur.Controleur;
import vue.FenetrePrincipale;

public class Ose {
	public static void main(String [] args){
		PlanSalle modele = new PlanSalle("Sans Nom") ;
		FenetrePrincipale vue = new FenetrePrincipale(modele) ;
		new Controleur(vue,modele) ;
	}
}