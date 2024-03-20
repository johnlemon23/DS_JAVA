package ChemicalEntreprise;

/**
 * La classe Employe est une classe abstraite représentant un employé de l'entreprise.
 * Elle définit les attributs communs à tous les types d'employés et des méthodes abstraites
 * pour le calcul du salaire et l'obtention du nom.
 */
public abstract class Employe {
	protected String nom;
	protected String prenom;
	protected int age;
	protected String date;
	
    /**
     * Constructeur de la classe Employe.
     * 
     * @param nom Le nom de l'employé.
     * @param prenom Le prénom de l'employé.
     * @param age L'âge de l'employé.
     * @param date La date d'entrée en service de l'employé.
     */
	public Employe(String nom, String prenom, int age, String date) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date = date;
	}

    /**
     * Méthode abstraite pour calculer le salaire de l'employé.
     * Chaque sous-classe doit implémenter cette méthode en fonction du type d'employé.
     * 
     * @return Le salaire mensuel de l'employé.
     */
	public abstract Double calculerSalaire();
 
    /**
     * Méthode pour obtenir le nom complet de l'employé.
     * 
     * @return Le nom complet de l'employé.
     */
	public String getNom() {
		return nom+" "+prenom;
	}
	
    /**
     * Méthode abstraite pour obtenir le titre de l'employé.
     * Chaque sous-classe doit implémenter cette méthode pour indiquer le type d'employé.
     * 
     * @return Le titre de l'employé.
     */
	public abstract String getTitre();
 
}
