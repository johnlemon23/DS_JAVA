/**
 * 
 */
package ChemicalEntreprise;
/**
 * La classe Commercial représente un employé du secteur commercial de l'entreprise.
 * Elle hérite de la classe Employe et définit un attribut spécifique pour le chiffre d'affaires réalisé.
 */
public class Commercial extends Employe{
	protected double chiffreAffaire;

    /**
     * Constructeur de la classe Commercial.
     * 
     * @param nom Le nom du commercial.
     * @param prenom Le prénom du commercial.
     * @param age L'âge du commercial.
     * @param date La date d'entrée en service du commercial.
     * @param chiffreAffaire Le chiffre d'affaires réalisé par le commercial.
     */
    public Commercial(String nom, String prenom, int age, String date, double chiffreAffaire) {
        super(nom, prenom, age, date);
        this.chiffreAffaire = chiffreAffaire;
    }
    
    /**
     * Méthode pour obtenir le chiffre d'affaires réalisé par le commercial.
     * 
     * @return Le chiffre d'affaires réalisé.
     */
    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    /**
     * Méthode abstraite pour calculer le salaire de l'employé.
     * Chaque sous-classe doit implémenter cette méthode en fonction du type d'employé.
     * 
     * @return Le salaire mensuel du commercial.
     */
	@Override
	public Double calculerSalaire() {
		// TODO Auto-generated method stub
		return null;
	}
	
    /**
     * Méthode pour obtenir le titre de l'employé.
     * 
     * @return Le titre du commercial.
     */
    public String getTitre() {
        return "Je suis un commercial !";
    }
	
}
