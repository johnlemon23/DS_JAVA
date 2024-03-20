/**
 * 
 */
package ChemicalEntreprise;

/**
 * La classe Representant représente un employé du secteur commercial spécialisé dans la représentation.
 * Elle hérite de la classe Commercial.
 */
public class Representant extends Commercial {

    /**
     * Constructeur de la classe Representant.
     * 
     * @param nom Le nom du représentant.
     * @param prenom Le prénom du représentant.
     * @param age L'âge du représentant.
     * @param date La date d'entrée en service du représentant.
     * @param chiffreAffaire Le chiffre d'affaires réalisé par le représentant.
     */
	public Representant(String nom, String prenom, int age, String date, double chiffreAffaire) {
        super(nom, prenom, age, date, chiffreAffaire);
    }

    /**
     * Méthode pour calculer le salaire du représentant.
     * 
     * @return Le salaire mensuel du représentant.
     */
    @Override
    public Double calculerSalaire() {
        return chiffreAffaire * 0.20 + 800;
    }
    
    /**
     * Méthode pour obtenir le titre de l'employé.
     * 
     * @return Le titre du représentant.
     */
    public String getTitre() {
        return "Je suis un representant !";
    }
	

}
