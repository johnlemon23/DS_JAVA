package ChemicalEntreprise;
/**
 * La classe ManuARisque représente un manutentionnaire travaillant avec des produits dangereux.
 * Elle hérite de la classe Manutentionnaire et implémente l'interface EmployeARisque.
 */
class ManuARisque extends Manutentionnaire implements EmployeARisque {
    /**
     * Constructeur de la classe ManuARisque.
     * 
     * @param nom Le nom du manutentionnaire.
     * @param prenom Le prénom du manutentionnaire.
     * @param age L'âge du manutentionnaire.
     * @param date La date d'entrée en service du manutentionnaire.
     * @param heuresTravail Le nombre d'heures de travail du manutentionnaire.
     */
    public ManuARisque(String nom, String prenom, int age, String date, Double heuresTravail) {
        super(nom, prenom, age, date, heuresTravail);
    }

    /**
     * Méthode pour calculer le salaire du manutentionnaire à risque.
     * 
     * @return Le salaire mensuel du manutentionnaire à risque, comprenant la prime de risque.
     */
    @Override
    public Double calculerSalaire() {
        return super.calculerSalaire()+ EmployeARisque.PRIME_MENSUELLE; // Calcul du salaire du manutentionnaire
    }
}