package ChemicalEntreprise;
/**
 * La classe TechnARisque représente un technicien travaillant avec des produits dangereux.
 * Elle hérite de la classe Technicien et implémente l'interface EmployeARisque.
 */
class TechnARisque extends Technicien implements EmployeARisque {
    /**
     * Constructeur de la classe TechnARisque.
     * 
     * @param nom Le nom du technicien.
     * @param prenom Le prénom du technicien.
     * @param age L'âge du technicien.
     * @param date La date d'entrée en service du technicien.
     * @param nombreUnites Le nombre d'unités produites par le technicien.
     */
    public TechnARisque(String nom, String prenom, int age, String date, Double nombreUnites) {
        super(nom, prenom, age, date, nombreUnites);
    }

    /**
     * Méthode pour calculer le salaire du technicien à risque.
     * 
     * @return Le salaire mensuel du technicien à risque, comprenant la prime de risque.
     */
    @Override
    public Double calculerSalaire() {
        return super.calculerSalaire()+ EmployeARisque.PRIME_MENSUELLE; // Calcul du salaire du technicien
    }
}
