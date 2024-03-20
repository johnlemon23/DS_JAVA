/**
 * 
 */
package ChemicalEntreprise;

/**
 * La classe Vendeur représente un employé du secteur commercial spécialisé dans la vente.
 * Elle hérite de la classe Commercial.
 */
public class Vendeur extends Commercial{

    /**
     * Constructeur de la classe Vendeur.
     * 
     * @param nom Le nom du vendeur.
     * @param prenom Le prénom du vendeur.
     * @param age L'âge du vendeur.
     * @param date La date d'entrée en service du vendeur.
     * @param chiffreAffaire Le chiffre d'affaires réalisé par le vendeur.
     */
	public Vendeur(String nom, String prenom, int age, String date, Double chiffreAffaire) {
        super(nom, prenom, age, date, chiffreAffaire);
    }

    /**
     * Méthode pour calculer le salaire du vendeur.
     * 
     * @return Le salaire mensuel du vendeur.
     */
    @Override
    public Double calculerSalaire() {
        return chiffreAffaire * 0.20 + 400;
    }
    
    /**
     * Méthode pour obtenir le titre de l'employé.
     * 
     * @return Le titre du vendeur.
     */
    public String getTitre() {
        return "Je suis un vendeur !";
    }
}
