/**
 * 
 */
package ChemicalEntreprise;


/**
 * La classe Manutentionnaire représente un employé affecté à la manutention dans l'entreprise.
 * Elle hérite de la classe Employe.
 */
public class Manutentionnaire extends Employe{

	private Double heuresTravail;

    /**
     * Constructeur de la classe Manutentionnaire.
     * 
     * @param nom Le nom du manutentionnaire.
     * @param prenom Le prénom du manutentionnaire.
     * @param age L'âge du manutentionnaire.
     * @param date La date d'entrée en service du manutentionnaire.
     * @param heuresTravail Le nombre d'heures de travail du manutentionnaire.
     */
    public Manutentionnaire(String nom, String prenom, int age, String date, Double heuresTravail) {
        super(nom, prenom, age, date);
        this.heuresTravail = heuresTravail;
    }

    /**
     * Méthode pour calculer le salaire du manutentionnaire.
     * 
     * @return Le salaire mensuel du manutentionnaire.
     */
    @Override
    public Double calculerSalaire() {
        return heuresTravail * 65;
    }
    
    /**
     * Méthode pour obtenir le titre de l'employé.
     * 
     * @return Le titre du manutentionnaire.
     */
    public String getTitre() {
        return "Je suis un manutentionnaire !";
    }

}
