package ChemicalEntreprise;

import java.util.ArrayList;

/**
 * La classe Personnel représente la gestion du personnel de l'entreprise.
 * Elle contient une collection d'employés et des méthodes pour ajouter des employés,
 * calculer les salaires et obtenir le salaire moyen.
 */
public class Personnel {
    private ArrayList<Employe> employes;

    /**
     * Constructeur de la classe Personnel.
     * Initialise la collection d'employés.
     */
    public Personnel() {
        employes = new ArrayList<>();
    }

    /**
     * Méthode pour ajouter un employé à la collection.
     * 
     * @param employe L'employé à ajouter.
     */
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    /**
     * Méthode pour calculer les salaires de tous les employés et les afficher.
     * Utilise instanceof pour déterminer le type de chaque employé.
     */
    public void calculerSalaires() {
        for (Employe employe : employes) {
        	if (employe instanceof Vendeur) {
                System.out.println("Le vendeur " + employe.getNom() + " gagne " + employe.calculerSalaire() + " euros.");
            } else if (employe instanceof Representant) {
                System.out.println("Le représentant " + employe.getNom() + " gagne " + employe.calculerSalaire() + " euros.");
            } else if (employe instanceof Technicien) {
                System.out.println("Le technicien " + employe.getNom() + " gagne " + employe.calculerSalaire() + " euros.");
            } else if (employe instanceof Manutentionnaire) {
                System.out.println("Le manut. " + employe.getNom() + " gagne " + employe.calculerSalaire() + " euros.");
            } else {
                System.out.println("L'employé " + employe.getNom() + " gagne " + employe.calculerSalaire() + " euros.");
            }
        }
    }

    /**
     * Méthode pour calculer le salaire moyen de tous les employés.
     * 
     * @return Le salaire moyen des employés.
     */
    public double salaireMoyen() {
        double totalSalaires = 0.0;
        for (Employe employe : employes) {
            totalSalaires += employe.calculerSalaire();
        }
        return totalSalaires / employes.size();
    }
}
