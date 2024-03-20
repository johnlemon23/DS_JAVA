/**
 * 
 */
package ChemicalEntreprise;

/**
 * La classe Technicien représente un employé affecté à la production dans l'entreprise.
 * Elle hérite de la classe Employe.
 */
public class Technicien extends Employe{

    private Double nombreUnites;

    /**
     * Constructeur de la classe Technicien.
     * 
     * @param nom Le nom du technicien.
     * @param prenom Le prénom du technicien.
     * @param age L'âge du technicien.
     * @param date La date d'entrée en service du technicien.
     * @param nombreUnites Le nombre d'unités produites par le technicien.
     */
    public Technicien(String nom, String prenom, int age, String date, Double nombreUnites) {
        super(nom, prenom, age, date);
        this.nombreUnites = nombreUnites;
    }

    /**
     * Méthode pour calculer le salaire du technicien.
     * 
     * @return Le salaire mensuel du technicien.
     */
    @Override
    public Double calculerSalaire() {
        return nombreUnites * 5;
    }
    
    /**
     * Méthode pour obtenir le titre de l'employé.
     * 
     * @return Le titre du technicien.
     */
    public String getTitre() {
        return "Je suis un technicien !";
    }

}
